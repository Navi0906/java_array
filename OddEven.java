import java.util.*;
class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// Checking if the input number is natural number or not
		if(number<=0){
			System.err.println("Input is not a natural number.");
			System.exit(-1);
		}
		
		int[] oddArray = new int[(number+1)/2];
		int[] evenArray = new int[number/2];
		
		int even = 0;
		int odd = 0;

		// for loop for saving odd and even numbers from 1 to input number in odd and even arrays
		for(int i=1;i<=number;i++){
			if(i%2==0){
				evenArray[even] = i;
				even++;
			}
			else{
				oddArray[odd] = i;
				odd++;
			}
		}
		
		
		//Printing both arrays seperately
		System.out.print("Odd Array: ");
		for(int i=0;i<oddArray.length;i++){
			System.out.print(oddArray[i]+" ");
		}
		System.out.println();
		
		System.out.print("Even Array: ");
		for(int i=0;i<evenArray.length;i++){
			System.out.print(evenArray[i]+" ");
		}
	}
}