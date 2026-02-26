package com.cs_is.strings;
public class StringBaseExample {
    public static void main(String[] args) {
        char[] letters = {'A','N','U','P'};
        // String name = letters.toString(); // Wrapper Classes
        String name = new String(letters);
        System.out.println(name); //
        String jumbled = "Harsha1Is1From1ISE1B1Section";
        // {"Harsha","Is","From","ISE","B","Section"}
        String[] words = jumbled.split("1");
        System.out.println(words[5]);
        for (Object o : words){
            System.out.print(o + " ");
        }
        System.out.println();
        String data = "      SNPSU    ISE     ";
        System.out.println(data.trim());
    }
}
