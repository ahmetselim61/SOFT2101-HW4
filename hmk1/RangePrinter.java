import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        
        System.out.println("Numbers between " + start + " and " + end + ":");
        for (int i = start + 1; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
