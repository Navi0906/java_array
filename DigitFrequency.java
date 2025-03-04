import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); 
        
        // Array to store the digits
        int[] digits = new int[20]; 
        int index = 0;

        // Getting digits from the number and store them in the digits array
        while (number != 0) {
            int digit = (int)(number % 10);
            digits[index] = digit; 
            index++;
            number /= 10; 
        }

        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Calculate the frequency of each digit
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++; // Increment the frequency of the digit
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { 
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}