// File: Main.java
import java.util.Scanner;

public class Main {

    // === Feature 1: Reverse a String ===
    public static String reverseString(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // === Feature 2: Check if Number is Prime ===
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // === Feature 3: Calculate Factorial ===
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }

    // === Feature 4: Count Words in a Sentence ===
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isBlank()) return 0;
        return sentence.trim().split("\\s+").length;
    }

    // === MAIN PROGRAM ===
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Java All-in-One Feature Demo ===");

        while (true) {
            System.out.println("\nChoose a feature:");
            System.out.println("1. Reverse a String");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Calculate Factorial");
            System.out.println("4. Count Words");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter text: ");
                    String text = scanner.nextLine();
                    System.out.println("Reversed: " + reverseString(text));
                }
                case 2 -> {
                    System.out.print("Enter number: ");
                    int num = scanner.nextInt();
                    System.out.println(num + (isPrime(num) ? " is prime." : " is not prime."));
                }
                case 3 -> {
                    System.out.print("Enter number: ");
                    int n = scanner.nextInt();
                    System.out.println("Factorial: " + factorial(n));
                }
                case 4 -> {
                    System.out.print("Enter sentence: ");
                    String sentence = scanner.nextLine();
                    System.out.println("Word count: " + countWords(sentence));
                }
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
