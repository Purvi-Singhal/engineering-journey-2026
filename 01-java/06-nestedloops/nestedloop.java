// print a pattern in which there are 3 rows and in each row there should 5 stars.

public class nestedloop{
    public static void main(String[] args){
        for(int i=1; i<=3; i++){  //outer loop -> controls the number of rows that is 3
            for(int j=1; j<=5; j++){  // inner loop controls the number of times one thing has to print in that particular row
                System.out.print("*"); // it represent what to print
            }
            System.out.println();  //add a next line after each row
        }
    }
}

// note --> inner loop complete its whole iteration in one iteration of outer loop.