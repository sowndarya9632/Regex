package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class toValidatePassword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the password:");
        String l = s.next();
        
        String regex = /*"^(?=.*[A-Z])(?=.*[a-z])"(?=.*\\d)*/"(?=.*[^a-zA-Z\\d]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(l);
        
        if (m.find()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        
        s.close();
    }
}
