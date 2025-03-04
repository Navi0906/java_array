import java.util.*;
class Bonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		 // Arrays to store salaries and years of service for 10 employees
		double[] salary = new double[10];
		int[] year = new int[10];
		
		double oldSalary = 0;
		
		// Loop to get salary and years of service for each employee
		for(int i=0;i<10;i++){
			System.out.print("Enter the salary of employee "+(i+1)+" : ");
			salary[i] = sc.nextDouble();
			
			// Validate salary input to ensure it's positive
			while(salary[i]<=0){
				System.out.print("Invalid input! Enter the salary of employee"+(i+1)+" : ");
				salary[i] = sc.nextDouble();
			}
			oldSalary +=salary[i];
			
			System.out.print("Enter the year of service of employee "+(i+1)+" : ");
			year[i] = sc.nextInt();
			
			// Validate years of service input to ensure it's positive
			while(year[i]<=0){
				System.out.print("Invalid input! Enter the year of service of employee"+(i+1)+" : ");
				year[i] = sc.nextInt();
			}
		}
		
		double totalBonus = 0;
		
		// Loop to calculate the total bonus based on years of service
		for(int i=0;i<10;i++){
			if(year[i]<5){
				totalBonus += salary[i]*2/100;
			}
			else{
				totalBonus += salary[i]*5/100;
			}
		}
		
		System.out.println("Total Bonus: "+totalBonus);
		System.out.println("Total Old Salary: "+oldSalary);
		System.out.println("Total New Salary: "+(totalBonus+oldSalary));
		
	}
}