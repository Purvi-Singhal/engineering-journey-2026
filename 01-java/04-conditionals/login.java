//basic login program using if else statements

import java.util.Scanner;
class login{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String username = "xyz";
        int pass = 1234;
        System.out.print("Enter username: ");
        String inputUsername = sc.next();
        System.out.print("Enter password: ");
        int inputPass = sc.nextInt();
        if(inputUsername.equals(username) && (inputPass == pass)){
            System.out.println("Login succesfull.");
        }else if(inputUsername.equals(username) && (inputPass != pass)){
            System.out.println("Incorrect password.");
        }else if(!inputUsername.equals(username) && (inputPass == pass)){
            System.out.println("Incorrect username.");
        }else{
            System.out.println("Incorrect username and password.");
        }
    }
}