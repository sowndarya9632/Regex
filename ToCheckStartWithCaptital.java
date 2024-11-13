package Regex;

import java.util.Scanner;
import java.util.regex.*;

public class ToCheckStartWithCaptital {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.next();
		// Regex pattern
		String regex = "^[A-Z][A-Za-z]{2}$";
		Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(st);
			if (matcher.matches()) {
				System.out.println(st + " is a valid first name.");
			} else {
				System.out.println(st + " is NOT a valid first name.");
			}
		}
	}


