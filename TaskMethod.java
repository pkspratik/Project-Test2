package com.simplilern.day4;

public class TaskMethod {
	
	void add() {
		int a = 10;
		int b =20;
		int c = a+b;
		System.out.println("Sum of "+a +" and "+b +"  "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaskMethod obj =new TaskMethod();
		
		obj.add();
		int x = obj.sub(20,10);
		System.out.println(x);
	}
	
	int sub(int a ,int b){
		
		int c = a-b;
		return c;
	}
}
