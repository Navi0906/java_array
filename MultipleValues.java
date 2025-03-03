import java.util.*;
class MulitpleValues{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[10];
		int i = 0;
		
		// Loop to take input from the user and store values in the array
		while(true){ 
			if(i==10){
				break;
			}
			System.out.print("Enter the number :");
			numbers[i] = sc.nextDouble();
			// Condition to break when user enters 0 or negative
			if(numbers[i]<0 || numbers[i]==0){
				break;
			}
			i++;
		}
		
		
		int sum = 0;
		
		// Loop to iterate through the stored numbers and calculate their sum
		for(int j=0;j<10;j++){
			if(numbers[j]<0 || numbers[j]==0){
				break;
			}
			System.out.println(numbers[j]);
			sum += numbers[j];
		}
		
		System.out.println("The sum is "+sum);
		
	}
}