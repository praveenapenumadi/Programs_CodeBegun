package com.corejava.first.test.modifiers;

public class WithInSameClass {

	public static void main(String[] args) {
		AccessModifierClass modifier = new AccessModifierClass();
		System.out.println("except private all the access modifier are accessaable in the same package but in different class");
		
		 System.out.println(modifier.b);
		 System.out.println(modifier.c);
		 System.out.println(modifier.d);
		 
		 modifier.method2();
		 modifier.method3();
		 modifier.method4();

	}

}
