package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.configuration.ConfigurationSampleClass;
import com.project.model.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationSampleClass.class);
		Student student = ctx.getBean(Student.class);
		student.setFirstName("Akash");
		student.setLastName("Chauhan");
		
		System.out.println("-------------------------");
		System.out.println(student.toString());
	}

}
