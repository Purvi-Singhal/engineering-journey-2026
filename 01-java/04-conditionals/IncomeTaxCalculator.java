// Income Tax Calculator using else-if ladder
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income (in INR): ");
        double income = sc.nextDouble();
        double tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = income * 0.20; // 20% tax
        } else {
            tax = income * 0.30; // 30% tax
        }

        System.out.println("Your calculated income tax is: Rs. " + tax);
        sc.close();
    }
}
