package com.cg.abstraction;

abstract class bike{
	abstract void run();
}
class honda extends bike{
	void run( ) {
		System.out.println("its is running safely");
		
	}
	
}

public class Demo {

	public static void main(String[] args) {
		honda obj = new honda();
		obj.run();
				
		

	}

}
