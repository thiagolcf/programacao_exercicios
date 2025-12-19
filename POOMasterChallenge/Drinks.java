public class Drinks {
    private String name;
    private int size;
    private double price;

    public Drinks(String name, int size, double price) {
        this.name = name;
        this.size = size;
        if (size == 1) {
            this.price = price * 0.75;
        }
        if (size == 3) {
            this.price = price * 1.25;
        } else {
            this.price = price;
        }

    }

}
