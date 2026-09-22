/*
 * Question 2:
 * Write a Java program to print "You have a fever" if your temperature is above 100 degrees,
 * otherwise print "You don't have a fever".
 *
 * Logic:
 * - If temp > 100.0 -> Fever detected
 * - Otherwise       -> Normal temperature
 */

class q2 {
    public static void main(String[] args) {
        // Temperature value in Fahrenheit
        double temp = 103.5;

        // Check if temperature exceeds normal threshold (100°F)
        if (temp > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You don't have a fever.");
        }
    }
}
