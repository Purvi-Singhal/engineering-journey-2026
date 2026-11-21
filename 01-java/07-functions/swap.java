//Call by value in swapping

public class swap{
    static void swapping(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a); //20
        System.out.println(b); //10
    }

    public static void main(String[] args){
        int x = 10;
        int y = 20;
        swapping(x,y);
        System.out.println(x);  //10
        System.out.println(y);  //20
    }
}