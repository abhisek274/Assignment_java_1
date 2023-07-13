import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            sum += number;
        }
        
        System.out.println("The sum of the numbers is: " + sum);
        
        scanner.close();
    }
}
