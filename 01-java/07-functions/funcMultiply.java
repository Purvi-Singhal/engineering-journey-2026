//Product of 2 numbers and return it.

import java.util.*;

public class funcMultiply{

    static int product(int num1, int num2){
        int multiply = num1*num2;
        return multiply;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int result = product(a,b);
        System.out.println("Product of "+a+ " and "+b+" is "+result);
    }
}