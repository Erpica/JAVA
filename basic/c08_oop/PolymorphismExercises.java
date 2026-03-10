package c08_oop;

import c08_oop.PolymorphismExercisesAndClases.*;
import c08_oop.PolymorphismExercisesAndClases.Character;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismExercises {

    public static void main(String[] args) {

        System.out.println("""
        \n1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog,
        Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método
        desde una lista de Animal.
        """);
        var animalList = new ArrayList<Animal>(List.of(
                new Dog("perro"),
                new Cat("gato"),
                new Cow("vaca")
        ));
        for (Animal animal : animalList){
            animal.makeSound();
        }

        System.out.println("""
        \n2. Crea una clase Shape con el método calculateArea(). Luego implementa
        subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape
        para recorrer e imprimir el área de varias figuras.
        """);
        //var myCircle = new Circle(4);
        //var myRectangle = new Rectangle(3,3);
        var listShape = new ArrayList<Shape>(List.of(
                new Circle(3),
                new Rectangle(3,3)
        ));
        for (Shape shape : listShape){
            shape.calculateArea();
        }

        System.out.println("""
        \n3. Crea una clase Printer con varios métodos print() sobrecargados que
        acepten diferentes tipos de parámetros (String, int, double). Llama a cada
        uno desde main.
        """);
        var thePrinter = new Printer();
        thePrinter.print("hola");
        thePrinter.print(2);
        thePrinter.print(2.5);

        System.out.println("""
        \n4. Crea una clase Greeter con dos métodos greet(): uno que salude con
        // "Hello", y otro que reciba un nombre y salude con "Hello, [nombre]".
        """);
        var theGreat = new Greeter();
        theGreat.greet();
        theGreat.greet("Anto");

        System.out.println("""
        \n5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck
        // que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar
        // a start() en cada uno.
        """);
        var myVehiclesArray = new ArrayList<Vehicle>(List.of(
                new Car(),
                new Bike(),
                new Truck()
        ));
        for (Vehicle vehicle : myVehiclesArray){
            vehicle.start();
        }

        System.out.println("""
        \n6. Crea una clase Notification con método send(), y subclases
        // EmailNotification, SMSNotification. Luego crea una función
        // sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        """);
        var oneNotification = new Notification("Notificación simple");
        oneNotification.send();
        var myEmailNotification = new EmailNotification("Al mail");
        myEmailNotification.sendNotification(myEmailNotification);
        var mySMSNotification = new SMSNotification("Por SMS");
        mySMSNotification.sendNotification(mySMSNotification);

        System.out.println("""
        \n7. Crea una función showAnimalType(Animal animal) que imprima el tipo de
        animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
        su tipo con su propio getType() sobrescrito.
        """);
        var myCat = new Cat("gatito");
        myCat.showAnimalType(myCat);

        System.out.println("""
        \n8. Crea una clase Converter con métodos convert(int), convert(double), y
        convert(String) que devuelvan diferentes formatos de texto.
        """);
        var myConvert = new Converter();
        System.out.println(myConvert.convert(3));
        System.out.println(myConvert.convert(3.2));
        System.out.println(myConvert.convert("3"));


        System.out.println("""
        \n9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic
        deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de
        Product e imprime el precio final de cada uno.
        """);
        var myProductsArray = new ArrayList<Product>(List.of(
                new Product("Libro 1", 40),
                new Product("Electronico 2", 20)
        )

        );
        for (Product product : myProductsArray){
            System.out.println(product.getPrice());
        }

        System.out.println("""
        \n10. Crea una clase Character con método attack(). Luego crea subclases
        Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
        Character y llama a attack() para cada uno.
        """);

        var myCharactersArray = new ArrayList<Character>(List.of(
                new Warrior(),
                new Archer(),
                new Mage()
        ));
        for (Character character : myCharactersArray){
            character.attack();
        }
    }
}
