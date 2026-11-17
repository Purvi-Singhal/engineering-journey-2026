// keep taking input from users and break loop as they enter a multiple of 10
//do-while 
import java.util.Scanner;

public class useOfbreak{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num%10 == 0){
                break;
            }
            System.out.println(num);
        }while(true);
        sc.close();
    }
}