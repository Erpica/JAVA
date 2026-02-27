package c08_oop;

public class Rectangle {
    // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.

    double base;
    double height;
    double sideTwo;
    double sideThree;

    public void calculateArea () {
        System.out.println("El área del triángulo es " + (this.base*this.height)/2 + " metros cuadrados.");
    }

    public void calculatePerimeter (){
        System.out.println("El perímetro del triángulo es " + (this.base+this.sideTwo+this.sideThree) + " metros cuadrados.");
    }
}
