import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * q5_fast_stream_sum.java
 * 
 * Reads multiple space-separated numbers rapidly using BufferedReader and StringTokenizer,
 * calculating count, total sum, min, and max.
 */
public class q5_fast_stream_sum {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("====== FAST I/O STREAM PROCESSOR ======");
            System.out.println("Enter a line of space-separated integers (e.g., '15 42 8 99 23 4'):");

            String line = br.readLine();
            if (line == null || line.trim().isEmpty()) {
                System.out.println("No input provided. Exiting.");
                return;
            }

            StringTokenizer st = new StringTokenizer(line);
            int count = 0;
            long sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while (st.hasMoreTokens()) {
                int val = Integer.parseInt(st.nextToken());
                sum += val;
                count++;
                if (val < min) min = val;
                if (val > max) max = val;
            }

            System.out.println("\n========== COMPUTED METRICS ==========");
            System.out.println("Total Numbers : " + count);
            System.out.println("Grand Sum     : " + sum);
            System.out.println("Minimum Value : " + (count > 0 ? min : "N/A"));
            System.out.println("Maximum Value : " + (count > 0 ? max : "N/A"));
            System.out.println("Average       : " + (count > 0 ? String.format("%.2f", (double) sum / count) : "N/A"));
            System.out.println("======================================");

        } catch (IOException e) {
            System.err.println("I/O Exception: " + e.getMessage());
        }
    }
}
