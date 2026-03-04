package c08_oop;
import c08_oop.ClassesExercisesAndClases.*;
import c08_oop.InheritanceExercisesAndClases.Dog;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {
        System.out.println("1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.");
        var myBook = new Book("Cervantes", "Don Quijote de la Mancha");
        //myBook.Author = "Cervantes";                // Al hacer el tercer ejercicio esto ya no haría falta
        //myBook.title = "Don Quijote de la Mancha"; // Al hacer el tercer ejercicio esto ya no haría falta
        System.out.println(myBook.title + " de " + myBook.Author);

        System.out.println("\n2. Crea una clase Dog con un método bark() que imprima su sonido.");
        var dog = new Dog();
        dog.bark();

        System.out.println("\n3. Añade un constructor a la clase Book que reciba title y author.");

        System.out.println("\n4. Crea una clase Car con atributos brand y model y un método showData().");
        //var myCar = new Car();
        //myCar.brand = "Peugeot";
        //myCar.model = "5008";
        //myCar.ShowData();

        System.out.println("\n5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).");
        var myStudent = new Student ();
        myStudent.score = 40;
        myStudent.examPassed();

        System.out.println("\n6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.");
        var myBankAccount = new BankAccount();
        System.out.println(myBankAccount.balance);
        myBankAccount.deposit(100);
        System.out.println(myBankAccount.balance);
        myBankAccount.deposit(-50);
        System.out.println(myBankAccount.balance);

        System.out.println("\n7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.");
        var myRectangle = new Rectangle();
        myRectangle.base = 2;
        myRectangle.height = 4;
        myRectangle.calculateArea();
        myRectangle.calculatePerimeter();

        System.out.println("\n8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.");
        var oneWorker = new Worker("Anto", 2800);
        oneWorker.showSalary();

        System.out.println("\n9. Crea varios objetos Person y guárdalos en un ArrayList.");
        var onePerson = new Person("Antonio", 46, "123456789A");
        var otherPerson = new Person("Irene", 43, "987654321B");
        var andOtherPerson = new Person("Anto", 10, "000000000c");
        var myArrayOfPersons = new ArrayList<Person>();
        myArrayOfPersons.add(onePerson);
        myArrayOfPersons.add(otherPerson);
        myArrayOfPersons.add(andOtherPerson);
        //          O DE OTRA FORMA MUCHO MEJOR:
/*        var myArrayOfPersons = new ArrayList<Person>(List.of(
                new Person("Antonio", 46),
                new Person("Irene", 43),
                new Person("Anto", 10)
        ));
*/
        for (Person person: myArrayOfPersons){
            person.sayHello();
        }

        System.out.println("\n10. Crea una clase  Crea una clase Product y un método que aplique un descuento sobre su precio. y un método que aplique un descuento sobre su precio.");
        var myProduct = new Product();
        myProduct.price = 200;
        System.out.println("El artículo se te queda en " + myProduct.applyDiscount(25) + " €");

    }
}
