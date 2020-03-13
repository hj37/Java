package com.javachobo.book;

class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return s;
	}
}


public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
	}

}
