package com.ty;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Student stud =(Student)context.getBean("myStudent");
		
		System.out.println("Student name : "+stud.getName());
		System.out.println("Student age : "+stud.getAge());
		System.out.println("================subject List=============== ");
		
		List<String> subjects = stud.getSubject();
		for(String s : subjects)
		{
			System.out.println(s);
		}
	}

}
