// Calculate the sum of first n natural numbers

import java.util.Scanner;

class sumOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     //taking input from user

        System.out.print("Enter n to which you want to find sum: ");
        int n = sc.nextInt();

        int sum = 0;   //initialize sum as 0 
        int i = 1;   
        while (i <= n) {
            sum += i;        //sum = sum+i
            i++;
        }

        System.out.println("Sum of first " + n + " natural number is: " + sum);
        sc.close();
    }
}