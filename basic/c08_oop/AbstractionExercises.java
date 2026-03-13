package c08_oop;
import c08_oop.AbstractionExercisesAndClases.*;
import c08_oop.AbstractionExercisesAndClases.Rectangle;

import java.util.ArrayList;
import java.util.List;


public class AbstractionExercises {

    public static void main(String[] args) {
        System.out.println("""
        1. Crea una clase abstracta Shape con el método calculateArea().
        Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        """);
        var myCircle = new Circle(5);
        System.out.println(myCircle.calculateArea());
        var myRectangle = new Rectangle(5);
        System.out.println(myRectangle.calculateArea());

        System.out.println("""
        2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano.
        Cada una debe mostrar un mensaje diferente al ejecutarse.
        """);
        var myGuitar = new Guitar();
        myGuitar.play();
        var myPiano = new Piano();
        myPiano.play();

        System.out.println("""
        3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos.
        Crea un array de Animal para mostrar polimorfismo.
        """);
        var animalArray = new ArrayList<Animal>(List.of(
           new Dog(),
           new Cat()
        ));
        for (Animal animal : animalArray){
            animal.makeSound();
        }

        System.out.println("4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().");
        myCircle.draw();
        var mySquare = new Square();
        mySquare.draw();
        var myTriangle = new Triangle();
        myTriangle.draw();

        System.out.println("""
        5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica
        diferente para calcular el salario.
        """);
        var fullTime = new FullTimeEmployee(50);
        var partTime = new PartTimeEmployee(20);
        System.out.println(fullTime.calculateSalary());
        System.out.println(partTime.calculateSalary());

        System.out.println("6. Crea una interfaz Movable con el método move(). " +
                "Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.");
        var myCar = new Car();
        myCar.move();
        var myRobot = new Robot();
        myRobot.move();

        System.out.println("7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). " +
                        "Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.");
        var myTv = new TV();
        System.out.println(myTv.status());
        myTv.turnOn();
        System.out.println(myTv.status());

        System.out.println("8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente " +
                        "ambas interfaces y muestre cómo puede volar y nadar.");
        var myDuck = new Duck();
        myDuck.fly();
        myDuck.swim();


        System.out.println("9. Crea una clase abstracta Document con el método print(). " +
                        "Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.");
        var myPDFDocument = new PDFDocument();
        myPDFDocument.print();
        var myWordDocument = new WordDocument();
        myWordDocument.print();


        System.out.println("10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment," +
          "cada una mostrando un mensaje de pago diferente.");
        var theInvoice = new Invoice();
        var theEmployeePayment = new EmployeePayment();
        theInvoice.pay();
        theEmployeePayment.pay();


    }
}
