package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.multi.Config;
import com.study.springboot.multi.Person;

// @SpringBootApplication => 이 주석이 있으면 자동으로 실행되면서 웹으로 실행됨
public class Ex01JavaDiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Ex01JavaDiApplication.class, args);
		
		// 일반 자바로 실행하려면
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Person p1 = (Person)context.getBean("Person1");
		p1.print();
	}

}
