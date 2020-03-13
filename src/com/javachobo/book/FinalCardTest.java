package com.javachobo.book;

class Card{
	final int NUMBER; 	//������� ����� �Բ� �ʱ�ȭ���� �ʰ�
	final String KIND; //�����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	static int width = 100; 
	static int height = 250;
	
	Card(String kind,int num){	//�Ű������� �Ѱܹ��� ������ KIND�� NUMBER�� �ʱ�ȭ�Ѵ�.
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART",1);
	}
	
	public String toString(){
		return ""+KIND+""+NUMBER;
	}
}


public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card("HEART",10);
		// c.NUMBER = 5; �����߻�! cannot assign a value to final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}

}
