// Java always use call by value. but not call by reference
// a parameter holds a copy of the variable passed to the method.
// the parameter only holds a copy, changing the parameter inside the function does not change the original variable in main().

public class callByValue{
    static void change(int x){
        x = 100;
        System.out.println(x);  //100
    } 

    public static void main(String[] args){
        int a = 10;
        change(a);
        System.out.println(a);  //10
    }
}
