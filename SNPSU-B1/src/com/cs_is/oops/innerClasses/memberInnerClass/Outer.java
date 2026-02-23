package com.cs_is.oops.innerClasses.memberInnerClass;
public class Outer {
    private int x = 10;
    class Inner {
        void display(){
            System.out.println("The value of x is: " + x);
        }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        // OuterClass.InnerClass in_obj = out_obj.new InnerClass();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
