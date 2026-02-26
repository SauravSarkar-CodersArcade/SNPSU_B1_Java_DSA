package com.cs_is.finalKeyword;
public final class Demo {
}
//class A extends Demo{ Cannot inherit final class
//
//}
class B {
    final void college(){
        System.out.println("SNPSU");
    }
}
class C extends B{
//    void college(){ // Cannot override final method
//
//    }
    final int x = 200;
    // x = 300; Not allowed , x is constant (final)
    void show(final int x){
        // x = 20; // Cannot change the value of a final parameter
    }
}
