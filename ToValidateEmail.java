package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToValidateEmail {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the email");
		String st=s.next();
		// E.g. abc.xyz@bl.co.in
		//String regex = "[a-zA-Z0-9]+[a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+([.][a-zA-Z]+)+";
        String regex = "[a-zA-Z0-9]+[a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+([.][a-zA-Z]+)?";
		Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(st);
			if (matcher.find()&&matcher.group().equals(st)) {
				System.out.println(st +   "--> is a valid email");
			} else {
				System.out.println(st + " -->is NOT a valid email");
			}
	}

}
