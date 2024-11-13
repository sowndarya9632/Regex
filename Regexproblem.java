package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexproblem {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".\\");
		Matcher m = p.matcher("abcbd09.8chab.12");
		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}

	}

}
