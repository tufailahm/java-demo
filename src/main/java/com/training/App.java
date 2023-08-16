package com.training;

import java.util.Date;

public class App {
	public static void main(String[] args) {
		Date currentTime = new Date();
		System.out.println("The current local date/time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
