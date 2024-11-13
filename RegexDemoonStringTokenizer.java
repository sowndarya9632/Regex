package Regex;

import java.util.StringTokenizer;
import java.util.regex.*;

public class RegexDemoonStringTokenizer {

	public static void main(String[] args) {
       /* Pattern p=Pattern.compile("\\.");
        String [] s=p.split("durga .software. solution");*/
		/*String s="durga .software. solution";
		String [ ] s1=s.split("a");
        for(String s2:s1) {
        	System.out.println(s2);
        }*/
		StringTokenizer s=new StringTokenizer("durga software solution","a");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
        
	}

}
