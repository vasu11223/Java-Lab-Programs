import java.util.*;
import java.util.StringTokenizer;
 class SumOfIntegers {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        // Read a line of integers
        String inputLine = sc.nextLine();

        // Use StringTokenizer to tokenize the line
        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        // Variables to store individual integers and the sum
        int currentNumber, sum = 0;

        // Process each token (integer)
        while (tokenizer.hasMoreTokens()) {
            // Convert the token to an integer
            currentNumber = Integer.parseInt(tokenizer.nextToken());

            // Display the current integer
            System.out.println("Current Integer: " + currentNumber);

            // Add the current integer to the sum
            sum += currentNumber;
        }

        // Display the sum of all integers
        System.out.println("Sum of Integers: " + sum);
    }
}