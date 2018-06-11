package com.zz.springboot.repository;

import com.alibaba.fastjson.JSON;
import com.zz.springboot.annotation.Cacheable;
import com.zz.springboot.util.RedisHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import java.util.concurrent.TimeUnit;

/**
 * Created by Francis.zz on 2018/3/13.
 *
 * 自定义所有jpa仓库的实现基类，在springboot入口使用repositoryBaseClass引入
 * 可以在基类中使用自定义的curd实现，比如引入缓存等
 * springboot2 已无需在此处定义缓存策略，可直接使用{@link org.springframework.cache.annotation.Cacheable}缓存热点数据
 */
public class BaseRepository<T> extends SimpleJpaRepository<T, Long> {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    private EntityManager em;
    private Class<T> clz;
    private boolean cacheable = false;
    private long cacheTime;

    // cache
    private static RedisTemplate<String, String> redisTemplate;

    public BaseRepository(JpaEntityInformation<T, Long> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.em = entityManager;
        this.clz = getDomainClass();

        Cacheable cacheaAnno = clz.getAnnotation(Cacheable.class);
        if(cacheaAnno != null) {
            cacheable = true;
            cacheTime = cacheaAnno.value();
        }
    }

    @Override
    public T getOne(Long aLong) {
        if(!cacheable) {
            return super.getOne(aLong);
        }
        logger.debug("-- 查询{}, ID：{}", clz.getSimpleName(), aLong);

        String value = redisTemplate.opsForValue().get(redisKey(aLong));
        if(!StringUtils.isEmpty(value)) {
            return JSON.parseObject(value, clz);
        }

        T res = super.getOne(aLong);
        saveCache(aLong, res);

        return res;
    }

    private void saveCache(Long id, T value) {
        redisTemplate.opsForValue().set(redisKey(id), JSON.toJSONString(value), cacheTime, TimeUnit.MILLISECONDS);
    }

    public static void setRedisTemplate(RedisTemplate<String, String> redisTemplate) {
        BaseRepository.redisTemplate = redisTemplate;
    }

    private String redisKey(Object id) {
        return RedisHelper.redisCacheKey(id, clz);
    }
}
