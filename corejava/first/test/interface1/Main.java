package com.corejava.first.test.interface1;

public class Main {

	public static void main(String[] args) {
		InterfaceImplClass obj = new InterfaceImplClass();
		 obj.method1();
		 int result=obj.method2();
		int result1=obj.method2(60, 10);
		float result2=obj.method3(30.50f, 20.50f);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
