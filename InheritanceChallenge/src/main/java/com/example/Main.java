package com.example;

public class Main {

    public static void main(String[] args) {
        Employee thiago = new Employee("Thiago", "12/01/1994", "01/01/2020");
        System.out.println(thiago);
        System.out.println("Age = " + thiago.getAge());
        System.out.println("Pay = " + thiago.collectPay());

    }
    
}
