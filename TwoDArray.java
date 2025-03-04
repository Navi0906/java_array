import java.util.*;
class TwoDArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = sc.nextInt();
		
		
		int[][] matrix = new int[rows][columns];
		
		
		// Taking input for 2D Array
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print("Enter the number in "+i+j+": ");
				matrix[i][j] = sc.nextInt();
			}
		}
		// Printing 2D Array in 1D Array
		int[] array = new int[rows*columns];
		System.out.print("The 1D array is ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				array[i+j] = matrix[i][j];
				System.out.print(array[i+j]+" ");
			}
		}
	}
}