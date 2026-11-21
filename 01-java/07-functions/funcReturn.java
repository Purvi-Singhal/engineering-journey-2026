// function with return
// return --> return result to caller or main()

//addition

public class funcReturn{
    static int add(int a, int b){   //static int here means that it will return a integer value.
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args){
        int result = add(10, 30);
        System.out.println(result);
    }
}


//note -> main() method execute hoga then -> add(10,20) call hua then --> sum 10+30=40 --> return 40 in main() 
// method and stroes 40 in result and then print result i.e 40.

