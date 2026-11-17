// Print the pattern: 
// A
// A B
// A B C
// A B C D

public class q3{
    public static void main(String[] args){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)('A'+j-1)+ " ");
            }
            System.out.println();
        }
    }
}
