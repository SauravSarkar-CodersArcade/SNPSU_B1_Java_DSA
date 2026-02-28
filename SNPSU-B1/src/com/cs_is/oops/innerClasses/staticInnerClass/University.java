package com.cs_is.oops.innerClasses.staticInnerClass;
public class University {
    static class Admission {
        static boolean isEligible(int marks){
            return marks >= 60;
        }
    }
    public static void main(String[] args) {
        boolean result = University.Admission.isEligible(45);
        System.out.println(result);
        boolean result2 = University.Admission.isEligible(63);
        System.out.println(result2);
    }
}
/*
ℹ Points to remember:
⭐ No University object needed - No heap memory needed
⭐ Logical grouping of data -> improves readability
⭐ Similar to creating utility-helper classes
 */
