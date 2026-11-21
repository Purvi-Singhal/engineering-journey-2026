// Addition of two numbers using Scanner and function

import java.util.*;

public class funcAdd{

    static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int result = add(a,b);
        System.out.println("Sum of "+a+" and "+b+" is "+ result);
    }
}