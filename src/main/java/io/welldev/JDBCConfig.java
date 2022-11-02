package io.welldev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan({"io.welldev"})
public class JDBCConfig {

    @Bean("driverManager")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource dmd = new DriverManagerDataSource();
        dmd.setDriverClassName("org.postgresql.Driver");
        dmd.setUrl("jdbc:postgresql://localhost:5432/Test");
        dmd.setUsername("postgres");
        dmd.setPassword("Csgrindonset2");

        return dmd;
    }

    @Autowired
    @Qualifier("driverManager")
    @Bean
    public DataSourceTransactionManager getTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


}
