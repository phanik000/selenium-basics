package com.java.oops;

public abstract class AbstractionCalc {
	int a;
	int b;
public void add(int a, int b) {
	int i=this.a=a+b;
	
	System.out.println("addition is "+i);
	
}
public void sub(int a,int b) {
	int i=this.b=a-b;
	System.out.println("substraction is "+i);
}
public abstract void mul(int a,int b);

public abstract void div(int a,int b);
}

