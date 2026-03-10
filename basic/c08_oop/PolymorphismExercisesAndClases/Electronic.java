package c08_oop.PolymorphismExercisesAndClases;

// 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic
// deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de
// Product e imprime el precio final de cada uno.

public class Electronic extends Product{
    public Electronic(String name, double price){
        super(name, price);
    }

    public double getPrice(){
        price = price *0.20;
        return price;
    }
}
