// Print if a number is odd or even
//if a number gives remainder 0 after ddividing by 2 is said to be even otherwise odd.
//% is the modulo operator which gives remainder of a division.
import java.util.Scanner;
public class oddOreven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is even.");
        }else{
            System.out.println(num + " is odd.");
        }
        sc.close();
    }
}