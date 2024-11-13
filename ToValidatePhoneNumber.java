package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToValidatePhoneNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the mobile number");
		String l=s.nextLine();
		String regex="(0|91)\\s[7-9][0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(l);
		if (m.find() && m.group().equals(l)) {
			System.out.println("valid number");
		} else {
			System.out.println("invalid number");
		}
	}

}
