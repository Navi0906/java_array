import java.util.*;
class ReverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// temporary variable for finding number of digits
		int temp = number;
		int size = 0;
		
		// Finding number of digits
		while(temp!=0){
			size++;
			temp = temp/10;
		}
		
		int[] digits = new int[size];
		int d = 0; // For index
		
		//saving digits in digits array
		while(number!=0){
			digits[d]=number%10;
			number = number/10;
			d++;
		}
		
		System.out.print("Number in reverse order is ");
		for(int i=0;i<size;i++){
			System.out.print(digits[i]);
		}
		
	}
}