//  Display all numbers enter by users except multiple of 10 using continue statement.
//do-while
import java.util.Scanner;
public class useOfcontinue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("number was: "+num);
        } while (true);
    }
}