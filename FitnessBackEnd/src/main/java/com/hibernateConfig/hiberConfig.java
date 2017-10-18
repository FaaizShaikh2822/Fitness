package com.hibernateConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.event.spi.jpa.ListenerFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.Dao.*;
import com.DaoImpl.*;
import com.model.*;

@Configurable
@EnableTransactionManagement
@ComponentScan("com")
public class hiberConfig 
{
	@Autowired
	@Bean(name="DataSource")
	public DataSource getH2()
	{
		System.out.println("Hibernate Initiated.....");
		DriverManagerDataSource dt= new DriverManagerDataSource();
		dt.setDriverClassName("org.h2.Driver");
		dt.setUsername("sa");
		dt.setUrl("jdbc:h2:~/test/s180132/dt");
		dt.setPassword("");
		return dt;
		
	}
	private Properties getHiberProps()
	{
		Properties p = new Properties();
		p.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		p.put("hibernate.show_sql", "true");
		p.put("hibernate.hbm2ddl.auto", "update");
		return p;
	}
	
	@Autowired
	@Bean(name="userDaoImpl")
	public UserDaoImpl getUserData(SessionFactory sessionFactory)
	{
		return new UserDaoImpl(sessionFactory);
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSession(DataSource dataSource)
	{
		LocalSessionFactoryBuilder lsfb = new LocalSessionFactoryBuilder(getH2());
		lsfb.addProperties(getHiberProps());
		lsfb.addAnnotatedClass(User.class);
		SessionFactory sessionFactory = lsfb.buildSessionFactory();
		return sessionFactory;
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransaction(SessionFactory sessionFactory)
	{
		HibernateTransactionManager tm = new HibernateTransactionManager(sessionFactory);
		return tm;
	}
}
