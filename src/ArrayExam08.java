
public class ArrayExam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {0,1,2,3,4,5};
		int[] newNumber = new int[10];
		
		for(int i=0; i < number.length; i++){
			//�迭 number�� ���� newNumber�� �����Ѵ�.
			newNumber[i] = number[i];
		}
		
		for(int i=0; i < newNumber.length; i++)
		{
			System.out.print(newNumber[i]);
		}
	}

}
