package com.cadastroapp;

import java.net.URI;
import java.net.URISyntaxException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {
	
	@Bean
	public DataSource dataSource(){
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://pfw0ltdr46khxib3.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/itn4ip5h3k2ax127");
	    dataSource.setUsername("qjsy5wkoyo6gox0q");
	    dataSource.setPassword("y1pck6uqynquz5iz");
	    return dataSource;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
	    HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	    adapter.setDatabase(Database.MYSQL);
	    adapter.setShowSql(true);
	    adapter.setGenerateDdl(true);
	    adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
	    adapter.setPrepareConnection(true);
	    return adapter;
	}
	
}
