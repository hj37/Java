
public class Arrayexam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++){
			System.out.print(number[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i = 0; i < number.length; i++){
			boolean changed = false; //자리바꿈이 발생했는지를 체크한다.
			for(int j = 0; j < number.length-1-i; j++){
				if(number[j] > number[j+1]){
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true; 	//자리바꿈이 발생했으므로 changed를 true로.
				}//end if
			}//end for j
			for(int k =0; k<number.length; k++)
			{
				System.out.print(number[k]);	//매 반복마다 정렬된 결과를 출력한다.
			}//end for k
			System.out.println();
			if(!changed)break;
		}//end for i 
	}

}
