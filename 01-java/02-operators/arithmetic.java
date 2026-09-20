

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
        //Pre Increment 
        int x = 10;
        int y = ++x;
        System.out.println("x = " + x);     // x = 11
        System.out.println("y = " + y);     // y = 11
 
        //Post Increment
        int p = 10;
        int q = p++;
        System.out.println("p = " + p);     // p = 11
        System.out.println("q = " + q);     // q = 10
        System.out.println("p = " + p);     // p = 11

        //pre decrement
        int u = 10;
        int v = --u;
        System.out.println("u = " + u);    // u = 9
        System.out.println("v = " + v);    // v = 9

        int c = 10;
        int d = c--;
        System.out.println("c = " + c);    // c = 9
        System.out.println("d = " + d);    // d = 10





    }
}
