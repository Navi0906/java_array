import java.util.*; 

class VotingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] students = new int[10]; 

        // Loop to take age input for each student
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the age of student: ");
            students[i] = sc.nextInt(); // Storing input age in the array
        }

        // Loop to check voting eligibility for each student
        for (int i = 0; i < students.length; i++) {
            if (students[i] <= 0) { 
                System.err.println("Invalid age");
            } 
            else if (0 < students[i] && students[i] < 18) { 
                System.out.println("The student with the age " + students[i] + " cannot vote");
            } 
            else { 
                System.out.println("The student with the age " + students[i] + " can vote");
            }
        }
    }
}
