package com.cs_is.dsa.collections;
public class Printer<T> {
    T data;
    Printer(T data){
        this.data = data;
    }
    void printValue(){
        System.out.println("Data: " + data);
    }
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(1);
        Printer<String> stringPrinter = new Printer<>("Java");
        Printer<Boolean> booleanPrinter = new Printer<>(true);
        Printer<Double> doublePrinter = new Printer<>(1.34);
        Printer<Float> floatPrinter = new Printer<>(1.2f);
        integerPrinter.printValue();
        stringPrinter.printValue();
        booleanPrinter.printValue();
        floatPrinter.printValue();
        doublePrinter.printValue();
    }
}
