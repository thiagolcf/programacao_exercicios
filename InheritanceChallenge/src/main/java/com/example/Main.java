package com.example;

public class Main {

    public static void main(String[] args) {
        Employee thiago = new Employee("Thiago", "12/03/1999", "01/01/2020");
        System.out.println(thiago);
        System.out.println("Age = " + thiago.getAge());
        System.out.println("Pay = " + thiago.collectPay());

        SalariedEmployee joe = new  SalariedEmployee("Joe", "11/02/1980", "03/03/2020", 35000);
        
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retired();
        System.out.println("Joe's Pension check - $" + joe.collectPay());


        HourlyEmploee mary = new HourlyEmploee("Mary","05/05/1970" , "03/03/2021",15);

        System.out.println(mary);
        System.out.println("Mar's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
    
}
