package com;

public class Calculator {
	
	
	public int add(int a, int b) {
		return a+b;

	}

	public int sub(int a, int b) {
		return a-b;

	}

	public int multi(int a, int b) {
		return a*b;

	}
	
	public int div(int a, int b) {

		return a/b;

	}

//*******************************************************************************************//

	public static void main(String[] args) {
		
		System.out.println("Calculator Program....... START !");
		System.out.println("******************************************************");
		Calculator c1 = new Calculator();
		System.out.println("Additional opertaion , ANS : "+c1.add(10,20));
		System.out.println("Subtraction opertaion , ANS : "+c1.sub(50, 32));
		System.out.println("DIV opertaion , ANS : "+c1.div(50, 2));
		System.out.println("MUL opertaion , ANS : "+c1.multi(50, 329));
		System.out.println("******************************************************");
		System.out.println("Calculator Program....... TERMINATED !");

	}

}
