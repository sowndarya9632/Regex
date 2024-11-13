package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookheadBehind {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.next();
		// Regex pattern
		String regex = "\\d(?= dollars)";
		Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(st);
			if (matcher.matches()) {
				System.out.println();
			} else {
				System.out.println(st + " is NOT a valid last name.");
			}
	}

}
