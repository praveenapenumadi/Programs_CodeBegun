package com.corejava.first.test.interface1;

public class InterfaceImplClass implements InterfaceClass{

	@Override
	public int method1() {
		System.out.println("Methods are implemented");
		return 0;
	}

	@Override
	public int method2() {
		int a = 20;
		int b = 30;
		return a+b;
	}

	@Override
	public int method2(int a, int b) {
		
		return a+b;
	}

	@Override
	public float method3(float a, float b) {
		
		return a+b;
	}
	
}
