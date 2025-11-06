import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int digits = 0;
        int sum = 0;

        // Count number of digits
        for (int temp = num; temp > 0; temp /= 10) {
            digits++;
        }

        // Calculate sum of digits raised to power of number of digits
        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            int power = 1;
            
            // Calculate digit^digits using for loop
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
        }

        // Check if Armstrong number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
        
        sc.close();
    }
}