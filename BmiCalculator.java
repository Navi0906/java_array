import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of people: ");
		int people = sc.nextInt();
		double[][] personData = new double[people][3];
		String[] weightStatus = new String[people];
		
		
		// Loop for taking input and calculating BMI
		for(int i=0;i<people;i++){
			
			System.out.print("Enter weight (kg): ");
			personData[i][0] = sc.nextDouble();
			System.out.print("Enter height (cm): ");
			personData[i][1] = sc.nextDouble();
			personData[i][1] /= 100;
			personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
        }
		
		//determining weight status using bmi and displaying information
        for(int i=0;i<people;i++){
			String status = "";
			if (personData[i][2] <= 18.4) {
				weightStatus[i] = "Underweight";
			} else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
				weightStatus[i] = "Normal weight";
			} else if (personData[i][2] >= 25.0 && personData[i][2] <=39.9) {
				weightStatus[i] = "Overweight";
			} else {
				weightStatus[i] = "Obese";
			}
			
			System.out.println("The weight, height, bmi and weight status of person "+(i+1)+" is "+personData[i][0]+" , "+personData[i][1]+" , "+personData[i][2]+" & "+weightStatus[i]+" respectively");
        }
        
    }
}