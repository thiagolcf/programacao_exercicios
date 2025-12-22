public class Burger {
    private String name;
    private double price;
    private Toppings toppings;
    private Toppings secondToppings;
    private Toppings thirdToppings;
    private boolean isDeluxe;

    public Burger(String name, double price, boolean isDeluxe) {
        
        this.name = name;
        
        this.isDeluxe = isDeluxe;
        if (isDeluxe) {
            this.price = 25.0;
        } else {
            this.price = price;
        }
    }

    public Burger(String name, double price, Toppings toppings, boolean isDeluxe) {
        this(name, isDeluxe);
        this.toppings = toppings;
        if (isDeluxe) {
            this.price = 25.0;
        } else {
            this.price = price + toppings.getPrice();

        }
    }

    public Burger(String name, double price, Toppings toppings, Toppings secondToppings, boolean isDeluxe) {
        this(name, toppings, isDeluxe);
        this.secondToppings = secondToppings;
        if (isDeluxe) {
            this.price = 25.0;
        } else {

            this.price = price + toppings.getPrice() + secondToppings.getPrice();
        }
    }

    public Burger(String name, double price, Toppings toppings, Toppings secondToppings, Toppings thirdToppings, boolean isDeluxe) {
       this(name, toppings, secondToppings, isDeluxe);
       this.thirdToppings = thirdToppings;
        if (isDeluxe) {
            this.price = 25.0;
        } else {

            this.price = price + toppings.getPrice() + secondToppings.getPrice() + thirdToppings.getPrice();
        }
    }

    public double getPrice() {
        return price;
    }
}