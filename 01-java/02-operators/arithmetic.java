package chapter2;

public class arithmetic {
    public static void main(String args[]){

        //binary operators
        int a = 10;
        int b = 5;
        System.out.println("add = " + (a+b));
        System.out.println("sub = " + (a-b));
        System.out.println("mul = " + (a*b));
        System.out.println("div = " + (a/b));
        System.out.println("mod = " + (a%b));
 
        //Unary operators
        int x = 10;
        int y = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int p = 10;
        int q = p++;
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("p = " + p);

        int u = 10;
        int v = --u;
        System.out.println("u = " + u);
        System.out.println("v = " + v);

        int c = 10;
        int d = c--;
        System.out.println("c = " + c);
        System.out.println("d = " + d);





    }
}
