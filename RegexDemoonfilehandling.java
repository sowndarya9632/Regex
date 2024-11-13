package Regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.*;

public class RegexDemoonfilehandling {

	public static void main(String[] args) throws IOException {
		/*File f=new File("out.txt");
		System.out.println(f.createNewFile());
		File f1=new File("input.txt");
		System.out.println(f1.createNewFile());*/
      PrintWriter out=new PrintWriter("out.txt");
      Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
      BufferedReader br=new BufferedReader(new FileReader("input.txt"));
      String line=br.readLine();
      while(line!=null) {
    	  Matcher m=p.matcher(line);
    	  while(m.find()) {
    		  out.println(m.group());
    		  
    	  }
    	  line=br.readLine();
      }
      br.close();
      out.flush();
      out.close();
	}

}
