import java.util.*;

public class typec {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int a = 23;
        // float b = a;

// float val = sc.nextFloat();
// System.out.println(val);

//It is possible to convert a char into number in java. It is done by type casting. When we type cast a char into int, it gives us the ASCII value of that character.
char ch = 'A';
int num = ch;
System.out.println(num);

//type casting

float a = 23.5f;
int b = (int)a;
System.out.println(b);


//type Promotion in java

char a1 = 'a';
char b1 = 'b';
System.out.println((int)a1); //it gives us the ASCII value of a1
System.out.println((int)b1); //it gives us the ASCII value of b1
System.out.println(a1+b1); //it gives us the sum of the ASCII values of a1 and b1. It is because of type promotion in java. When we perform any operation on two different data types, java promotes the smaller data type to the larger data type. In this case, char is promoted to int and then the operation is performed.

short x = 5;
byte y = 25;
char z = 'c';
int bt = x+y+z; //it gives us the sum of the ASCII value of z and the values of x and y. It is because of type promotion in java. When we perform any operation on two different data types, java promotes the smaller data type to the larger data type. In this case, short and byte are promoted to int and char is promoted to int and then the operation is performed.

char E = 'A';
int A = 10;
Float B = 20.2f;
long C = 2233;
double D = 123.456;
double ans = A+B+C+D+E; //it gives us the sum of A, B, C, D and E. It is because of type promotion in java. When we perform any operation on two different data types, java promotes the smaller data type to the larger data type. In this case, int, float,long  and char are promoted to double and then the operation is performed.
System.out.println(ans);

byte p = 23;
byte q = (byte)(p*2);
System.out.println(q); //it gives us the value of p*2. It is because of type promotion in java. When we perform any operation on two different data types, java promotes the smaller data type to the larger data type. In this case, byte is promoted to int and then the operation is performed. The result is then assigned back to byte which causes an error because int cannot be assigned to byte without explicit type casting. To fix this error, we need to type cast the result back to byte.
    }

 
    
}
