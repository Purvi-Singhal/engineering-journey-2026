package chapter2.questions;

public class q1 {
    public static void main(String args[]){
        int x=2, y=5;
        int exp1 = (x*y / x);
        int exp2 = (x*(y/x)); // in this y/x will give 2 and then 2*2 will give 4

        System.out.print(exp1 + " , ");
        System.out.print(exp2);

    }
}
