// Print numbers from 1 to n using while loop

import java.util.Scanner;

class while1TOn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num to print 1 to n: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}