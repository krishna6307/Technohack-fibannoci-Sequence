import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        
        // Validate input to avoid runtime errors
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a positive integer.");
            return;
        }
        
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}