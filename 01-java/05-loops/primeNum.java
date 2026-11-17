//Check whether a num enter by user is prime or not
import java.util.*;
public class primeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if(num<2){
                System.out.println(num+" is not a prime number.");
            }
            else if(num==2){
                System.out.println(num+" is a prime number");
            }
            else{
                boolean isPrime = true;
                for(int i=2; i<=num-1; i++){ //you can also write i=2; i<=Math.sqrt(num); i++
                    if(num%i==0){
                        isPrime = false;
                    }
                }
                if(isPrime == true){
                System.out.println(num+" is a prime number.");
            }
            else{
                System.out.println(num+" is not a prime number.");
            }
            }

            
        }
    }
}