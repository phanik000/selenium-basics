package com.java.oops;

import org.testng.annotations.Test;

public class InheritanceTest extends Inheritence{
	int x;
	int y;
	
	@Test(priority=1,enabled=true)
	public void assignTest(int X,int Y) {
		this.x=X+Y;
		this.y=X-Y;
		System.out.println("THE NUMBER OF "+ x);
		System.out.println("THE NUMBER OF "+ y);

	}
		

	public static void main(String[] args) throws InterruptedException {
			InheritanceTest it=new 	InheritanceTest();
		    it.launch();
			it.signUp();
			it.assignTest(5, 9);
	     	it.exit();
		
		}
		
		// TODO Auto-generated method stub

	}


