package com.feri.mybatisplus_sys.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;

/**
 *@Author feri
 *@Date Created in 2019/3/13 11:02
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean createFilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new CrosFilter());
        ArrayList<String> list=new ArrayList<>();
        list.add("/*");
        filterRegistrationBean.setUrlPatterns(list);
        return filterRegistrationBean;
    }
}
