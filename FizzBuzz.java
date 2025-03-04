import java.util.*;

class FizzBuzz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = sc.nextInt();
		
		String[] array = new String[number];
		
		// Loop for checking numbers and applying condition
		for(int i=1;i<=number;i++){
			if(i%3==0 && i%5==0){
				array[i-1] = "FizzBuzz";
			}
			else if(i%3==0){
				array[i-1] = "Fizz";
			}
			else if(i%5==0){
				array[i-1] = "Buzz";
			}
			else{
				array[i-1] = Integer.toString(i);
			}
		}
		
		System.out.println("The array is ");
		for(int i=0;i<number;i++){
			System.out.println(array[i]);
		}
	}
}