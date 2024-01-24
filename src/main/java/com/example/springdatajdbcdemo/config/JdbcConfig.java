package com.example.springdatajdbcdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
@EnableJdbcRepositories(basePackages = "com.example.springdatajdbcdemo.repositories")
public class JdbcConfig {

}
