package com.cs_is.oops.innerClasses.localInnerClass;
import java.time.LocalDate;
public class Exam {
    void evaluate(int marks){
        class GradeCalculator{
            String calculate(){
                if(marks >= 75) return "Distinction";
                else if(marks >= 60) return "First Class";
                else return "Pass";
            }
        }
        GradeCalculator gc = new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExamDate(){
        LocalDate date = LocalDate.now().plusDays(5);
        System.out.println("The exam date is: " + date);
    }
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.evaluate(67);
        exam.evaluate(89);
        exam.displayExamDate();
    }
}
/*
ℹ Points to remember
⭐ Grade logic is scoped to the "evaluate" method
⭐ It avoids polluting the class with helper methods
⭐ It helps in designing the codebase in a cleaner way
 */
