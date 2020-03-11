package object;

public class MemberCall {

	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv; 
	//static int cv2 = iv;	//����. Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv;	//���� ����Ϸ��� ��ó�� ��ü�� �����ؾ���.
	
	static void classMethod1(){
		System.out.println(cv);
		//System.out.println(iv); ����. Ŭ�����޼��忡�� �ν��Ͻ������� �ٷ� ����� �� ����.
		
		MemberCall c = new MemberCall();
		System.out.println(c.iv); //��ü�� ������ �Ŀ��� �ν��Ͻ������� ������ ������.
	}
	
	void instanceMethod1(){
		System.out.println(cv);
		System.out.println(iv); //�ν��Ͻ��޼��忡���� �ν��Ͻ������� �ٷ� ��밡��.
	}
	
	static void classMethod2(){
		classMethod1();
		// instanceMethod1(); ����. Ŭ�����޼��忡���� �ν��Ͻ��޼��带 �ٷ� ȣ���� �� ����.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); //�ν��Ͻ��� ������ �Ŀ��� �ν��Ͻ��޼��带 ȣ���� �� ����.
	}
	
	void instanceMethod2() {	//�ν��Ͻ��޼��忡���� �ν��Ͻ��޼���� Ŭ�����޼���
		classMethod1(); //��� �ν��Ͻ��������� �ٷ� ȣ���� �����ϴ�.
		instanceMethod1();
	}
	
		
}

