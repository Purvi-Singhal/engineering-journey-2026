// ternary operator
// variable = condition ? value if true : value if false

// to check if a number  is even or odd 
import java.util.Scanner;
class ternary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println(result);
        sc.close();
        }
}  