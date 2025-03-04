import java.util.*;
class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int index = 0;
		
		//Loop for saving factors in array
		for(int i = 1;i<number;i++){
			if(number%i==0){
				if(index==maxFactor){ //resize the array when factors exceed size of array 
					maxFactor *= 2;
					factors = Arrays.copyOf(factors, maxFactor);
				}
				factors[index] = i;
				index++;
			}
			
		}
		System.out.print("Factors are :");
		for(int i=0;i<maxFactor;i++){
			if(factors[i]==0){
				break;
			}
			System.out.print(factors[i] + " ");
		}
	}
}