import java.util.Scanner;
class Mean{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] heights = new double[11];
		double sum = 0;
		
		// Loop to take input of heights from the user and calculate the sum
		for(int i=0;i<11;i++){
			System.out.print("Enter the height of player "+(i+1)+" : ");
			heights[i] = sc.nextDouble();
			sum += heights[i];
		}
		
		// Calculating the mean height
		double meanHeight = sum/11;
		System.out.println("The mean height of football team is "+meanHeight);
	}
}