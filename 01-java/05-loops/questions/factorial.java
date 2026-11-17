//  Write a program to find the  factorial of  the number entered by user.

import java.util.Scanner;

public class factorial{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:  ");
        int num = sc.nextInt();
        int mul = 1;
        if(num==0){
            System.out.println("factorial of 0 is: 1");
        }else{
            for(int i=1; i<=num; i++){
                mul*=i;
            }
            System.out.println("Factorial of "+" is "+ mul);
        }
        sc.close();
        
    }
}

