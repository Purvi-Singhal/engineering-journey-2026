import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * FastIODemo.java
 * 
 * Demonstrates:
 * 1. Fast I/O using BufferedReader and InputStreamReader (8KB buffer)
 * 2. Token parsing with StringTokenizer (space-separated stream processing)
 * 3. Why this is the industry standard for competitive programming & large datasets
 */
public class FastIODemo {
    public static void main(String[] args) {
        // Wrapped in try-with-resources to automatically close streams and handle IOException
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("==================================================");
            System.out.println("            FAST I/O (BUFFERED READER)            ");
            System.out.println("==================================================");

            // 1. Reading an entire line of text directly
            System.out.print("Enter your Project Title: ");
            String title = br.readLine();

            // 2. Reading multiple numbers on a single line separated by spaces
            // Example input: "10 25 50 100"
            System.out.print("Enter 4 integers separated by spaces (e.g., 10 20 30 40): ");
            String numbersLine = br.readLine();

            if (numbersLine != null && !numbersLine.trim().isEmpty()) {
                StringTokenizer st = new StringTokenizer(numbersLine);
                int count = 0;
                long sum = 0;

                System.out.print("Parsed Tokens: ");
                while (st.hasMoreTokens()) {
                    int num = Integer.parseInt(st.nextToken());
                    sum += num;
                    count++;
                    System.out.print("[" + num + "] ");
                }

                System.out.println("\n--------------------------------------------------");
                System.out.println("Project Title : " + title);
                System.out.println("Numbers Count : " + count);
                System.out.println("Sum of Tokens : " + sum);
                System.out.println("Average       : " + (count > 0 ? ((double) sum / count) : 0));
            }
            System.out.println("==================================================");

        } catch (IOException e) {
            System.err.println("I/O Error encountered: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format entered: " + e.getMessage());
        }
    }
}
