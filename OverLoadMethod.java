package com.simplilern.day4;

public class OverLoadMethod {
	
	 public void area(int b,int h)
	    {
	        System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(float b,int h)
	    {
	        System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(int b,float h)
	    {
	        System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(int r) 
	    {
	        System.out.println("Area of Circle : "+(3.14*r*r));
	    }
	    public static void main(String args[])
	    {
	        OverLoadMethod ob=new OverLoadMethod();
	        ob.area(10,12);
	        ob.area(5);  
	    }

}




