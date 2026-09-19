package chapter2.questions;

public class q3 {
    public static void main(String args[]){
        int x, y, z;
        x=y=z=2;
        x += y;
        y -= z;
        z /= (x+y); //it will give 0 because 2/4 = 0.5 and ans will be in int so 0

        System.out.println(x + " " + y + " " +z);
    }
}
