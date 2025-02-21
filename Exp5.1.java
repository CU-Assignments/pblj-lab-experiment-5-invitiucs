Question Explanation:

writing a Java program to calculate the sum of a list of integers using autoboxing and unboxing, along with methods to parse strings into their respective wrapper classes (e.g., Integer.parseInt()).

Steps to implement:
1. Create a List of Integers: Initialize a List<Integer> to hold the integers.
2. Autoboxing: Use autoboxing to convert primitive int values to Integer objects automatically when adding to the list.
3. Unboxing: Use unboxing to convert Integer objects back to int for sum calculation.
4. Parse Strings: Create a utility method to parse strings to integers using Integer.parseInt().
5. Calculate the Sum: Use a loop or Java 8 streams to calculate the sum of the list.

  
Java Program:

parseStringToInteger(): This method parses a string into an Integer. It catches any NumberFormatException if the string is not a valid number.
calculateSum(): This method calculates the sum of a list of integers. Java automatically performs unboxing when adding Integer values to sum (an int).

solution


import java.util.*;

public class SumCalculator {
    
    public static int parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return 0; // Returning 0 for invalid inputs
        }
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) { // Unboxing happens here
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10); // Autoboxing
        numbers1.add(20);
        numbers1.add(30);
        numbers1.add(parseStringToInteger("40"));
        numbers1.add(parseStringToInteger("50"));
        System.out.println("The sum of the list is: " + calculateSum(numbers1));
        
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(parseStringToInteger("100"));
        numbers2.add(parseStringToInteger("200"));
        numbers2.add(parseStringToInteger("300"));
        System.out.println("The sum of the list is: " + calculateSum(numbers2));
        
        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(parseStringToInteger("50"));
        numbers3.add(parseStringToInteger("invalid")); // This should print an error message
        numbers3.add(parseStringToInteger("70"));
        System.out.println("The sum of the list is: " + calculateSum(numbers3));
    }
}
