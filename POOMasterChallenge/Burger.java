public class Burger {
    private String name;
    private double price;
    private Toppings toppings;
    private Toppings secondToppings;
    private Toppings thirdToppings;

    
    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public Burger(String name, double price, Toppings toppings) {
        this.name = name;
        this.toppings = toppings;
        this.price = price * toppings.getPrice();
    }


    public Burger(String name, double price, Toppings toppings, Toppings secondToppings) {
        this.name = name;
        this.toppings = toppings;
        this.secondToppings = secondToppings;
        this.price = price * toppings.getPrice() * secondToppings.getPrice();
    }


    public Burger(String name, double price, Toppings toppings, Toppings secondToppings, Toppings thirdToppings) {
        this.name = name;
        this.toppings = toppings;
        this.secondToppings = secondToppings;
        this.thirdToppings = thirdToppings;
        this.price = price * toppings.getPrice() * secondToppings.getPrice() * thirdToppings.getPrice();
    }

}
