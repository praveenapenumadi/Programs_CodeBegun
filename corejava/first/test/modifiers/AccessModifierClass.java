package com.corejava.first.test.modifiers;

public class AccessModifierClass {

	private int a=10;
	protected int b=20;
	int c=30;
	public int d=40;
	
	private void method1() {
		System.out.println("Private Method");
	}
	
	protected void method2() {
		System.out.println("Protected Method");
	}
	 void method3() {
		System.out.println("default Method");
	}
	 public void method4() {
			System.out.println("Public Method");
		}
	 public static void main(String args[])
	 {
		 AccessModifierClass modifier = new AccessModifierClass();
		 System.out.println(modifier.a);
		 System.out.println(modifier.b);
		 System.out.println(modifier.c);
		 System.out.println(modifier.d);
		 modifier.method1();
		 modifier.method2();
		 modifier.method3();
		 modifier.method4();
	 }

}
