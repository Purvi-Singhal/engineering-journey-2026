// Reurn the factorial of any number.

import java.util.*;

public class funcFactorial{
    static int factorial(int num){
        int mul = 1;
        if(num==0){
            System.out.println("Factorial of 0 is: 1");
        }
        for(int i=1; i<=num; i++){
            mul*=i;
        }
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int result = factorial(a);
        System.out.println("Factorial of "+a+" is "+result);
    }
}