// addition of 2 numbers
//(int a, int b) --> parameters 
public class functionParameter{
    static void add(int a, int b){
        int sum = a+b;
        System.out.println("Sum of "+ a + " and "+b+" is "+ sum);
    }

    public static void main(String[] args){
        add(10, 20);  // (10,20) --> arguments
        add(40,9);
    }
}