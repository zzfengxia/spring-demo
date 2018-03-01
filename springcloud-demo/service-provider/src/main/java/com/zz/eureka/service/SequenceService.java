package com.zz.eureka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Map;

/**
 * Created by Francis.zz on 2018/3/1.
 */
@Service
public class SequenceService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getNextVal() {
        Map<String, Object> result = jdbcTemplate.queryForMap("select getSequenceValue(?) as curVal", "S_TERMINAL_TRANS_NO");

        Integer nextVal = (Integer) result.get("curVal");
        DecimalFormat df = new DecimalFormat("000000000000000");

        return "1" + df.format(nextVal);
    }
}
