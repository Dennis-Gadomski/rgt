package com.gadomski.dennis.rgt.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.gadomski.dennis.rgt")
public class DBConfig {
    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties SourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName(SourceProperties().getDriverClassName())
                .url(SourceProperties().getUrl())
                .username(SourceProperties().getUsername())
                .password(SourceProperties().getPassword())
                .build();
    }
}
