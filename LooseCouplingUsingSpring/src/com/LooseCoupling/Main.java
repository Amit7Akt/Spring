package com.LooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
		
		Student obj = context.getBean("student", Student.class);
		obj.Student_cheating();
	}
}
