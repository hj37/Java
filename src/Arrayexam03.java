
public class Arrayexam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++){
			System.out.print(number[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i = 0; i < number.length; i++){
			boolean changed = false; //�ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.
			for(int j = 0; j < number.length-1-i; j++){
				if(number[j] > number[j+1]){
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true; 	//�ڸ��ٲ��� �߻������Ƿ� changed�� true��.
				}//end if
			}//end for j
			for(int k =0; k<number.length; k++)
			{
				System.out.print(number[k]);	//�� �ݺ����� ���ĵ� ����� ����Ѵ�.
			}//end for k
			System.out.println();
			if(!changed)break;
		}//end for i 
	}

}
