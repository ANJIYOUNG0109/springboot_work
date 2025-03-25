package com.study.springboot.multi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @Configuration : 스프링 부트가 시작하면서 이 어노테이션이 붙은 파일을 설정파일로 사용
 * 					설정 클래스에 @Bean으로 등록된 객체를 생성하고 관리 (설정파일로 사용하겠다는 뜻)
 */

@Configuration
public class Config {
	@Bean
	public Person Person1() {
		Person Person1 = new Person();
		Person1.setName("홍길동");
		Person1.setNickname("아버지라 못함");
		Person1.setPrinter(new PrinterA());
		
		return Person1;
	}
	
	@Bean(name="hello") //bean에 이름을 붙혀줄 수 있음 
	public Person Person2() {
		return new Person("이고잉","java",new PrinterA());
	}
	
	@Bean 
	public PrinterA printerA() {
		return new PrinterA();
	}
	
	@Bean 
	public PrinterB printerB() {
		return new PrinterB();
	}

}
