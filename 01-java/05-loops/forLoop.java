// for loop
// for initialisation; condition; updation){
//     code}


//Print square pattern using for loop

import java.util.Scanner;
class forLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side(n) of a square: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("* ".repeat(n)); //instead of '*'*n we can use "*".repeat(n)
        }
        //'*'*n with single quotes takes the ASCII vof '*' and repeats it n times in integer formalue 
        //with double quotes it will give a compilation error because java does not allow * on strings.
        sc.close();
    }
}