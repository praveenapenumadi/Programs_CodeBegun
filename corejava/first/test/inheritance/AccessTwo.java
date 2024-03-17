package com.corejava.first.test.inheritance;

public class AccessTwo extends AccessTest {
	
	int b=20;
	
	@Override
	 int methodOne() {
		System.out.println("Method is overrided in accessTwo class");
		return 0;
		
	}
	
}
