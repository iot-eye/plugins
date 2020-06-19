package com.ioteye.maven;

		import java.util.Date;

		import org.springframework.context.ApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Date date = context.getBean("date", Date.class);

		System.out.println(date);
	}
}
