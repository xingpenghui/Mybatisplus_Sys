package com.feri.mybatisplus_sys.config;

import com.feri.mybatisplus_sys.convert.DateConvert;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *@Author feri
 *@Date Created in 2019/3/21 14:59
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new DateConvert());
    }
}
