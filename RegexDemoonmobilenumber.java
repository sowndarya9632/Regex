package Regex;

import java.util.regex.*;

public class RegexDemoonmobilenumber {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		//Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(args[0]);
		if (m.find() && m.group().equals(args[0])) {
			System.out.println("valid email");
		} else {
			System.out.println("invalid email");
		}

	}
}
