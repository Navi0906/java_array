import java.util.*;
class Friends{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] ages = new int[3];
		int[] heights = new int[3];
		
		
		//Taking input from user
		for(int i=0;i<3;i++){
			System.out.print("Enter the age: ");
			ages[i] = sc.nextInt();
		}
		for(int i=0;i<3;i++){
			System.out.print("Enter the height: ");
			heights[i] = sc.nextInt();
		}
		
		//Comparing ages to find which one is youngest
		if(ages[0]<ages[1] && ages[0]<ages[2]){
			System.out.println("Amar is the youngest among all");
		}
		else if(ages[1]<ages[0] && ages[1]<ages[2]){
			System.out.println("Akbar is the youngest among all");
		}
		else{
			System.out.println("Anthony is the youngest among all");
		}
		
		//Comparing heights to find which one is tallest
		if(heights[0]>heights[1] && heights[0]>heights[2]){
			System.out.println("Amar is the tallest among all");
		}
		else if(heights[1]>heights[0] && heights[1]>heights[2]){
			System.out.println("Akbar is the tallest among all");
		}
		else{
			System.out.println("Anthony is the tallest among all");
		}
		
	}
}