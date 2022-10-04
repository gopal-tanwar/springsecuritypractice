package com.example.springsecuritypractice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

   /* @Autowired
    private Environment environment;

    @Bean
    @Primary
    public DataSource firstDatasource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty(""));
        dataSource.setUrl(environment.getProperty(""));
        dataSource.setUsername(environment.getProperty(""));
        dataSource.setPassword(environment.getProperty(""));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("firstDatasource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }*/

}
