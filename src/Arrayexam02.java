
public class Arrayexam02 {
	public static void main(String[] args){
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++){
			System.out.print(number[i] = i);
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++){
			int n = (int)(Math.random() * 10);	//0 ~ 9���� �� ���� ���Ƿ� ��´�.
			int temp = number[0]; //�迭�� ù ��° ���� ���Ƿ� ���õ� ��ġ�� ���� �ٲ۴�.
			number[0] = number[n];
			number[n] = temp;
		}
		
		for(int i=0; i < number.length; i++){
			System.out.print(number[i]);
		}
		
		
	}
}
