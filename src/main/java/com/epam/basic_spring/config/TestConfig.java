package com.epam.basic_spring.config;

import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class TestConfig {

    @Bean
    @ConditionalOnBean(DataSource.class)
    public Test test(DataSource dataSource) {
        return new Test(dataSource);
    }


    @AllArgsConstructor
    class Test {

        private DataSource dataSource;
    }

}
