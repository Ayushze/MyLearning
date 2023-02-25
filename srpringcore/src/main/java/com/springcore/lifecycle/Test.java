package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		// registring shutdown hook
		context.registerShutdownHook();
		
//		Samosa s = (Samosa)context.getBean("samosa");
//		System.out.println(s);
//		
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		
//		Pepsi p = (Pepsi)(context.getBean("pepsi"));
//		System.out.println(p);
		
		Example e = (Example) context.getBean("example");
		System.out.println(e);
	}

}
