/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.web.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.sitewhere.web.rest.controllers.AssetsController;

@Configuration
@ComponentScan(basePackageClasses = { AssetsController.class })
public class RestMvcConfiguration extends WebMvcConfigurationSupport {

    /** URL prefix for matching REST API calls */
    public static final String REST_API_MATCHER = "/api/*";

    /*
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * configurePathMatch(org.springframework.web.servlet.config.annotation.
     * PathMatchConfigurer)
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
	configurer.setUseSuffixPatternMatch(false);
    }

    /*
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * configureContentNegotiation(org.springframework.web.servlet.config.annotation
     * .ContentNegotiationConfigurer)
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	configurer.favorPathExtension(false);
    }
}