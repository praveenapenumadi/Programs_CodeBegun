package com.corejava.first.test.wrapperclass;

public class WrapperClassExample {

	
		    void wrapperM1() {
		        Byte b = null;
		        Short s = null;
		        Integer a = null;
		        Long l = null;
		        Float f = null;
		        Double d = null;
		        Character c = null;
		        Boolean b1 = null;
		    System.out.println("Default values are printing");
			System.out.println(b);
			System.out.println(s);
			System.out.println(a);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
			System.out.println(c);
			System.out.println(b1);
		    }
			void wrapperM2() {
		        Byte b = 1;
		        Short s = 10;
		        Integer a = 20;
		        Long l = 30l;
		        Float f = 40f;
		        Double d = 50d;
		        Character c ='p';
		        Boolean b1 = false;
		     System.out.println("values are given by usimg wrapper class");
			System.out.println(b);
			System.out.println(s);
			System.out.println(a);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
			System.out.println(c);
			System.out.println(b1);
		    }

		    

		    public static void main(String[] args) {
		    	WrapperClassExample wrapper = new WrapperClassExample();
		        wrapper.wrapperM1();
			wrapper.wrapperM2();
		    }

}
