// To print largest of 3 numbers
// nested if else
// we can also use logical operators to check all conditions in one if else statement but here we are using nested if else statements.


import java.util.Scanner;
class largestOf3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr first nummber: ");
        int a = sc.nextInt();
        System.out.print("Enetr secomd nummber: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a + " is largest.");
            }
            else{
                System.out.println(c + " is largest.");
            }
        }
        else if(b>c){
            System.out.println(b + " is largest.");
        }
        else{
            System .out.println(c + " is largest.");
        }
        sc.close();
    }

}
