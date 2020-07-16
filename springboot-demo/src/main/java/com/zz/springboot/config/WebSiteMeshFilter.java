package com.zz.springboot.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.content.tagrules.html.DivExtractingTagRuleBundle;

/**
 * ************************************
 * create by Intellij IDEA
 *
 * @author Francis.zz
 * @date 2018-07-17 15:03
 * @desc WebSiteMeshFilter
 * ************************************
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/*", "/WEB-INF/decorator.html")
                .addExcludedPath("/login/**")
                .addExcludedPath("/main/**")
                .addExcludedPath("/popup/**");
        builder.addTagRuleBundles(new DivExtractingTagRuleBundle());
    }
}
