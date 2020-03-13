package object;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3D p3 = new P3D();
		System.out.println("p3.x="+p3.x);
		System.out.println("p3.y="+p3.y);
		System.out.println("p3.z="+p3.z);
		
	}

}

class Point3{
	int x;
	int y;
	
	Point3(int x,int y){
		this.x = x;
		this.y = y;
	}
	String getLocation(){
		return "x:"+x+",y:"+y;
	}
}


class P3D extends Point3{
	int z;
	
	P3D(){
		this(100,200,300);	//Point3D(int x,int y,int z)를 호출한다.
	}
	
	P3D(int x,int y,int z){
		super(x,y);
		this.z = z;
	}
}
