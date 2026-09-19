package questions;

import java.util.Scanner;

/**
 * Question 3: Total Cost with 18% GST
 * 
 * Problem Statement:
 * Enter cost of 3 items from the user (using float data type) - a pencil, a pen,
 * and an eraser. You have to output the total cost of the items back to the user
 * as their bill.
 * (Add on : You can also try adding 18% GST tax to the items in the bill as an advanced problem)
 * 
 * Calculation:
 * - total = pencil + pen + eraser
 * - gst = total * 0.18
 * - finalPrice = total + gst
 */
public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        float gst = (total * 18) / 100;
        float finalPrice = total + gst;

        System.out.println("--- Bill Summary ---");
        System.out.println("Subtotal: $" + total);
        System.out.println("18% GST:  $" + gst);
        System.out.println("Total:    $" + finalPrice);

        sc.close();
    }
}
