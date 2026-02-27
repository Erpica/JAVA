package c08_oop;

public class Car2 {
    String brand;
    String model;
    String name;

    public void ShowData (){
        System.out.println("Este coche es de la marca " + this.brand + " y modelo " + this.model);
    }

    public Car2(String name){
        this.name = name;
    }
}
