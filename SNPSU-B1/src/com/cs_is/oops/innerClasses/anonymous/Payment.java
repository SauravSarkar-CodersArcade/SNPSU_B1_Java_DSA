package com.cs_is.oops.innerClasses.anonymous;
public interface Payment {
    void pay();
}
class PaymentDemo {
    public static void main(String[] args) {
        // Boilerplate Code
        Payment p = new Payment(){
            public void pay(){
                System.out.println("Payment done using Credit Card.");
            }
        };
        p.pay();
        // SCALA - Java 8 (Streams, Annotations, Lambdas, Reflection)
        Payment p1 = () -> System.out.println("Cash Payment");
        p1.pay();

    }
}
/*
ℹ Points to remember:
⭐ One-time implementation
⭐ No need to create separate class
⭐ It is used in events & callback functions
 */
