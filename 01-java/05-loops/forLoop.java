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
            System.out.println("***");
        }
        sc.close();
    }
}