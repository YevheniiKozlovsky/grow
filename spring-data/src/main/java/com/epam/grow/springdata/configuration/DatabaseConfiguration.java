package com.epam.grow.springdata.configuration;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@EnableJpaRepositories
@Configuration("com.epam.grow.springdata.repository.jpa")
@PropertySource({"classpath:database.properties"})
public class DatabaseConfiguration {

    @Value("${db.driver}")
    private String databaseDriver;

    @Value("${db.url}")
    private String databaseUrl;

    @Value("${db.username}")
    private String databseUsername;

    @Value("${db.password}")
    private String databasePassword;

    @Bean
    public DataSource dataSource() {
        MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setUrl(databaseUrl);
        dataSource.setUser(databseUsername);
        dataSource.setPassword(databasePassword);
        return dataSource;
    }

    @Bean
    @Autowired
    public EntityManagerFactory entityManagerFactory(final JpaVendorAdapter jpaVendorAdapter,
                                                     final DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(jpaVendorAdapter);
        factory.setPackagesToScan("com.epam.grow.springdata");
        factory.setDataSource(dataSource);
        return factory.getObject();
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(false);
        return jpaVendorAdapter;
    }



}
