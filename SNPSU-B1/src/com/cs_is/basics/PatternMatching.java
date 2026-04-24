package com.cs_is.basics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatching {
   // anil ANIL - confidential
   public static void main(String[] args) {
       Pattern pattern = Pattern.compile("anil", Pattern.CASE_INSENSITIVE);
       // In some special cases, may be the user will be given access
       Matcher matcher = pattern.matcher("ANIL");
       boolean matchFound = matcher.find();
       System.out.println(matchFound);
   }
}
