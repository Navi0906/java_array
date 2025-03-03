import java.util.*;
class CheckNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		// Loop to take 5 integer inputs from the user 
		for(int i=0;i<5;i++){
			System.out.print("Enter the number "+(i+1)+": ");
			array[i] = sc.nextInt();
		}
		
		
		// Loop to check each number in the array is even, odd, zero, or negative
		for(int i=0;i<5;i++){
			if(array[i]>0){
				if(array[i]%2==0){
					System.out.println("The number "+array[i]+" is even");
				}
				else{
					System.out.println("The number "+array[i]+" is odd");
				}
			}
			else if(array[i]==0){
				System.out.println("The number "+array[i]+" is zero");
			}
			else{
				System.out.println("The number "+array[i]+" is negative");
			}
		}
		
		
		// Checking the first and last elements of the array and comparing them
		if(array[0]==array[4]){
			System.out.println("First and Last number are equal");
		}
		else if(array[0]<array[4]){
			System.out.println("First number is less than last number");
		}
		else{
			System.out.println("First number is greater than last number");
		}
	}
}