package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
   
    Pattern p=Pattern.compile("[abc]");
    Matcher m=p.matcher("adbaabab");
    while(m.find()) {
    	//count++;
    	System.out.println( m.start()+" "+m.group());
    }
   // System.out.println("the total :"+count);
	}

}
