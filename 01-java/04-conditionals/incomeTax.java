// Income Tax calculator
/* 
income < 5L  --> 0% tax
income between 5-10L --> 20% tax
income > 10L -->  30% tax.
*/

import java.util.Scanner;
public class incomeTax{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your income: ");
    int income = sc.nextInt();
    int tax;
    if(income<500000){
        tax = 0;
    }
    else if((income>=500000) && (income<1000000)){
        tax = (int) (income*0.2);
    }

    else{
        tax = (int) (income*0.3);
    }

    System.out.println("Your tax is: " + tax);
    sc.close();
    }
    
}