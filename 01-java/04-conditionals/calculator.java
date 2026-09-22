// Simple Calculator using switch statement

import java.util.Scanner;
class c{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = sc.nextDouble();

        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        System.out.print("Enter the operation you want to perform(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
                break;

            case '-' :
                System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
                break;
            
            case '*':
                System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
                break;

            case '/':
                if(b!=0){
                    System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
                }
                else{
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            
            case '%':
                if(b!=0){
                    System.out.println("Remainder of "+a+" and "+b+" is: "+(a%b));
                }
                else{
                    System.out.println("Error: Modulo by zero is not defined.");
                }
                break;

            default:
                System.out.println("operation you choose is not valid.");
        }
        sc.close();
    }
}