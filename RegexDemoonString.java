package Regex;

import java.util.regex.*;

public class RegexDemoonString {

	public static void main(String[] args) {
		String input = "Hello, I have 2 cats and 1 dog. 3 more dogs.";

        // Example 1: Matching digits
        String regex1 = "\\d+"; // Matches one or more digits
        Matcher matcher1 = Pattern.compile(regex1).matcher(input);
        while (matcher1.find()) {
            System.out.println("Found a number: " + matcher1.group());
        }

        // Example 2: Matching words that start with 'c'
        String regex2 = "\\bc\\w*"; // Matches words that start with 'c'
        Matcher matcher2 = Pattern.compile(regex2).matcher(input);
        while (matcher2.find()) {
            System.out.println("Found a word starting with 'c': " + matcher2.group());
        }

        // Example 3: Matching sentences that end with a period
        String regex3 = ".*\\.$"; // Matches any string that ends with a period
        Matcher matcher3 = Pattern.compile(regex3).matcher(input);
        if (matcher3.find()) {
            System.out.println("Found a sentence ending with a period: " + matcher3.group());
        }
   }
}
