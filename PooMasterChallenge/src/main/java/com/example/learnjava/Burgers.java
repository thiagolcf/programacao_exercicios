package com.example.learnjava;

public class Burgers {
    private String cheeseburger;
    private String baconCheeseburger;
    private String bbqBurger;
    private String blueCheeseBurger;
    private String turkeyBurger;
    private String veggieBurger;

    public Burgers(String burger) {
       String  stringToLowerCase = burger.toLowerCase();
        if (stringToLowerCase.contains("blue")) {
            this.blueCheeseBurger = burger;
        }        
        if (stringToLowerCase.contains("bacon")) {
            this.baconCheeseburger = burger;
        }
        if 

    }

}