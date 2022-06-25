package com.movie.test.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class MybatisConfig {
	@Autowired
	private DataSource dasource;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		System.out.println(">>>>"+dasource); //fixme System.out.println 보다는 log.info 등을 사용해주세요
		SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
		factoryBean.setDataSource(dasource);
		//src/main/resources 자원을 읽어들이기위한 객체
		String locationPattern="classpath:static/mapper/**/*mapper.xml"; //fixme 이런 정적 문자열은 클래스 필드로 빼서 사용해주세요
		Resource[] resources=applicationContext.getResources(locationPattern);
		factoryBean.setMapperLocations(resources);
		//org.apache.ibatis.session.Configuration 반영
		factoryBean.setConfiguration(myBatisConfig());
		
		return factoryBean.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate() throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory());
	}
	//DB의 컬럼명 java class의 필드명 mapping
	//하나의 클래스에 동일한 이름의 클래스 사용시 import는 1개만 가능
	//그래서 추가해서 사용한 클래스는 full-name으로 적용하세요
	@Bean
	@ConfigurationProperties(prefix = "mybatis.configuration")
	public org.apache.ibatis.session.Configuration myBatisConfig(){
		return new org.apache.ibatis.session.Configuration();
	}
}
