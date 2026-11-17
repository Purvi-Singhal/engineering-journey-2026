// Write a program that reads a set of integers and then prints the sum of the even and odd integers.

import java.util.Scanner;
public class integers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        do{
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num%2==0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }
            System.out.print("Do you want to continue enter numbers(if yes then press 1 and if no then 0):  ");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("Sum of even numbers are: " + evenSum);
        System.out.println("Sum of odd numbers are: "+  oddSum);

        sc.close();
    }
}