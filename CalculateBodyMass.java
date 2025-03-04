import java.util.Scanner;

public class CalculateBodyMass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of people: ");
		int people = sc.nextInt();
		double[] weight = new double[people];
		double[] height = new double[people];
		double[] bmi = new double[people];
		
		
		// Loop for taking input and calculating BMI
		for(int i=0;i<people;i++){
			System.out.print("Enter weight (kg): ");
			weight[i] = sc.nextDouble();
			System.out.print("Enter height (cm): ");
			height[i] = sc.nextDouble();
			height[i] /= 100;
			bmi[i] = weight[i] / (height[i] * height[i]);
        }
		
		//determining weight status using bmi and displaying information
        for(int i=0;i<people;i++){
			String status = "";
			if (bmi[i] <= 18.4) {
				status = "Underweight";
			} else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
				status = "Normal weight";
			} else if (bmi[i] >= 25.0 && bmi[i] <=39.9) {
				status = "Overweight";
			} else {
				status = "Obese";
			}
			
			System.out.println("The weight, height, bmi and weight status of person "+(i+1)+" is "+weight[i]+" , "+height[i]+" , "+bmi[i]+" & "+status+" respectively");
        }
        
    }
}