// Write a program to print the multiplication of a number.

import java.util.Scanner;

public class multiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of which you want a multiplaication table: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + " * "+i+ " = " + num*i);
        }
        sc.close();
    }
}