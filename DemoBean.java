package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class DemoBean implements CommandLineRunner {

	//https://reasonable-code.com/command-line-runner/
	
	@Override
	public void run(String... args) {
//		System.out.println("Test Batch");
		for(String arg: args) {
			System.out.println(arg);
		}
	}
}

@Component
@Order(1)
class DemoBean1 implements CommandLineRunner {
	@Override
	public void run(String...args) {
		System.out.println("いっこめ");
	}
}

@Component
@Order(2)
class DemoBean2 implements CommandLineRunner {
	@Override
	public void run(String...args) {
		System.out.println("にこめ");
	}
}

@Component
@Order(3)
class DemoBean3 implements CommandLineRunner {
	@Override
	public void run(String...args) {
		System.out.println("さんこめ");
	}
}