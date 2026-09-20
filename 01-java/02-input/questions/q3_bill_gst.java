import java.util.Scanner;

public class q3_bill_gst {
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
