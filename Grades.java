import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = sc.nextInt();
		while(students<=0){
				System.out.print("Invalid Input! Enter the number of students: ");
				students = sc.nextInt();
			}
		double[][] studentsData = new double[students][4];
		String[] grade = new String[students];
		
		
		// Loop for taking input and calculating percentage
		for(int i=0;i<students;i++){
			
			System.out.print("Enter marks in physics: ");
			studentsData[i][0] = sc.nextDouble();
			while(studentsData[i][0]<=0){
				System.out.print("Invalid Input! Enter marks in physics: ");
				studentsData[i][0] = sc.nextDouble();
			}
			
			
			System.out.print("Enter marks in chemistry: ");
			studentsData[i][1] = sc.nextDouble();
			while(studentsData[i][1]<=0){
				System.out.print("Invalid Input! Enter marks in chemistry: ");
				studentsData[i][1] = sc.nextDouble();
			}
			
			
			System.out.print("Enter marks in maths: ");
			studentsData[i][2] = sc.nextDouble();
			while(studentsData[i][2]<=0){
				System.out.print("Invalid Input! Enter marks in maths: ");
				studentsData[i][2] = sc.nextDouble();
			}
			
			// storing percentage of each student
			studentsData[i][3] = (studentsData[i][0]+studentsData[i][1]+studentsData[i][2])/3;
        }
		
		//determining grade and displaying remarks
        for(int i=0;i<students;i++){
			if (studentsData[i][3] >= 80) {
				grade[i] = "Grade: A  Remarks: Level 4, above agency-normalized standards";
			} else if (studentsData[i][3] >= 70 && studentsData[i][3] <= 79) {
				grade[i] = "Grade: B  Remarks: Level 3, at agency-normalized standards";
			} else if (studentsData[i][3] >= 60 && studentsData[i][3] <=69) {
				grade[i] = "Grade: C  Remarks: Level 2, below, but approaching agency-normalized standards";
			} else if (studentsData[i][3] >= 50 && studentsData[i][3] <=59) {
				grade[i] = "Grade: D  Remarks: Level 1, well below agency-normalized standards";
			} else if (studentsData[i][3] >= 40 && studentsData[i][3] <=49) {
				grade[i] = "Grade: E  Remarks: Level -1, too below agency-normalized standards";
			} else {
				grade[i] = "Grade: F  Remarks: Remedial Students";
			}
			
			System.out.println("The marks in physics, chemistry, maths, percentage & grade of student "+(i+1)+" is "+studentsData[i][0]+" , "+studentsData[i][1]+" , "+studentsData[i][2]+" , "+studentsData[i][3]+"% & "+grade[i]+" respectively");
        }
        
    }
}