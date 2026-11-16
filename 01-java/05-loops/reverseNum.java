//print reverse of a number

import java.util.Scanner;
public class reverseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number that yoi want to reverse: ");
        int num = sc.nextInt();
        int original = num;
        String rev = "";  //string+number=stringnumber
        while(num>0){
            int lastDigit = num%10; //last digit access
            rev+=lastDigit;  //number reverse
            int n = num/10;  //remove last digit
            num = n;
        }
        System.out.println("reverse of "+original+" is "+rev);
        sc.close();
    }
}

// one more method
// int num = 24564;
// while(num>0){
//     int lastdigit = num%10;
//     System.out.println(lastDigit);
//     num = num/10;

// }

//another method 
// int num = 10998;
// int rev = 0;
// while(num>0){
//     int lastDigit = num%10;
//     rev = (rev*10) + lastDigit;
//     num = num/10;
// }
// System.out.println(rev);