package com.feri.mybatisplus_sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.feri.mybatisplus_sys.mapper")
//@EnableWebMvc //
public class MybatisplusSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusSysApplication.class, args);
    }

}
