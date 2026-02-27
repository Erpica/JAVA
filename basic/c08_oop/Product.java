package c08_oop;

public class Product {
    // Crea una clase Product y un método que aplique un descuento sobre su precio.
    double price;
    //double discount;

    public double applyDiscount (int discount) {
        // double finalPrice = this.price-((discount*this.price)/100);
        return this.price - ((discount * this.price) / 100);
    }


}
