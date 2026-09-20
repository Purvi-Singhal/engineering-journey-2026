/* if(condition){
        true --> execute 
        } 
    else{
        false --> execute
        }
*/

// to check if a person is adult, minor or teenager
// && operator checks if both conditions are true

import java.util.Scanner;
class ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();  //age input from user
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age>=13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Minor");
        }
        sc.close();
    }
}
