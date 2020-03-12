package object;

class Tv2{
	boolean power; //전원상태 (on/off)
	int channel; //채널
	
	void power() { power =!power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv2{
	boolean caption; 	//캡션상태(on/off)
	void displayCaption(String text){
		if(caption){	//캡션 상태가 on(true)일 때만 text를 보여준다.
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
