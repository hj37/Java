package object;

class Tv2{
	boolean power; //�������� (on/off)
	int channel; //ä��
	
	void power() { power =!power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv2{
	boolean caption; 	//ĸ�ǻ���(on/off)
	void displayCaption(String text){
		if(caption){	//ĸ�� ���°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String argsp[]){
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello,World");
		ctv.caption = true;
		ctv.displayCaption("Hello,world");
	}
}
