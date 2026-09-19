package questions;

public class q4 {
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println(result);

        int $ = 24; //it will not give any error because $ is a valid identifier in java but it is not recommended to use it as it can create confusion and make the code less readable.
        System.out.println($);
    }
}
