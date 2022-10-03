package com.ex;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.Hibernate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;




@Configuration
@ComponentScan(basePackageClasses=SpringTemplate.class)
public class AppConfig{

@Bean
 public DataSource getDataSource(){
DriverManagerDataSource ds=new DriverManagerDataSource();
ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
ds.setUrl("jdbc:mysql://127.0.0.1:3306/JNIT");
ds.setUsername("root");
ds.setPassword("JanVij@2021");
return ds;
}
public LocalSessionFactoryBean getSessionFactory(){
LocalSessionFactoryBean sb=new LocalSessionFactoryBean();
sb.setDataSource(getDataSource());
Properties pr=new Properties();
pr.put("Hibernate.show_sql", "true");
pr.put("Hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
pr.put("Hibernate.hbm2ddl.auto","update");
sb.setHibernateProperties(pr);
sb.setAnnotatedClasses(Student.class);
return sb;
}

@Bean(value="getSpringTemplate")
public SpringTemplate getSpringTemplate( ){
SpringTemplate st=new SpringTemplate();
st.setSf(getSessionFactory().getObject());
return st;
}
}