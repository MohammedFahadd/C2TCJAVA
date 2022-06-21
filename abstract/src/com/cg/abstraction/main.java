package com.cg.abstraction;

abstract class movie{
	abstract void setTitle(String s);
}
class MYmovie extends movie{
	void setTitle(String s){
	System.out.println("The title is:" + s);
}	
}
public class main {
	
public static void main(String[] args) {
	movie Mymovie = new MYmovie();
	Mymovie.setTitle("Harry potter");
}
}
