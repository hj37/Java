package object;

class Data1{
	int value;
}

class Data3{
	int value;
	Data3(int x){	//매개변수가 있는 생성자.
		value = x;
	}
}

public class ConstructorTest {
	public static void main(String[] args){
		Data1 d1 = new Data1();
	}

}
