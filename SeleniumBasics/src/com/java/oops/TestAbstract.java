package com.java.oops;

public class TestAbstract extends AbstractionCalc {

	 int a;
	 int b;

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
int i=this.a=a*b;
System.out.println("multiplication is "+ i);
	}

	@Override
	public void div(int a, int b) {
		int i=this.a=a/b;
System.out.println("division is "+ i);

	}

	public static void main(String[] args) {
		TestAbstract abs=new TestAbstract();
		abs.add(2, 3);
		abs.sub(3, 2);
		abs.mul(3, 2);
		abs.div(6, 2);
	}
}