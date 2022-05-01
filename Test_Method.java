package com.simplilern.day4;

public class Test_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_Method tm = new Test_Method();
		tm.add();
		tm.add(20 ,30);
		
		int a=tm.sub();
		System.out.println("Sub "+a);
		
		int b=tm.sub(5,8);
		System.out.println("mul "+b);
		
	}
	
	void add()  // without return type without argument
	{
		int a = 10;
		int b = 20;
		int c= a+b;
		System.out.println("Sum "+ c);
	}
	
	void add(int a,int b) { // without return type with argument
		System.out.println("Sum "+(a+b) );
	}
	
	int sub() {    // with return type and without argument
		
		int a=50;
		int b=20;
		int c =a-b;
		
		return c;
	}
	
   int sub(int a,int b) {   // with return type and with argument
		int c =a*b;
		
		return c;
	}
}
