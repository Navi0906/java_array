import java.util.Scanner;
class Multiplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		int[] table = new int[10];
		
		// Loop to calculate and store the multiplication table in the array
		for(int i=0;i<10;i++){
			table[i] = number*(i+1);
		}
		
		// Loop to print the multiplication table from the array
		for(int j=0;j<10;j++){
			System.out.println(number+"*"+(j+1)+" = "+table[j]);
		}
	}
}