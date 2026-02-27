package c08_oop;
import java.awt.*;

public class InheritanceExercises {

    public static void main(String[] args) {
        System.out.println("""
        1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car
        que herede de Vehicle y agrega el método honk().""");
        var myCar = new Car("myCar");
        myCar.honk();

        System.out.println("""
        \n2. Define una clase Person con los atributos name y age. Luego crea una clase
        Student que agregue el atributo grade y un método study().""");
        var myStudent = new Student();
        myStudent.study();

        System.out.println("""
        \n3. Crea una clase Animal con el método makeSound(). Haz que Dog diga Woof y
        Cat diga Meow sobrescribiendo ese método.""");
        var myDog = new Dog();
        myDog.makeSound();
        var myCat = new Cat();
        myCat.makeSound();

        System.out.println("""
        \n4. La clase Employee tiene los atributos name y salary. Manager hereda de
        Employee y agrega el atributo department.""");
        //var theManager = new Manager();
        // Manager theManager = new Manager(); // => otra manera, mejor
        //theManager.salary = 1000;
        //System.out.println(theManager.salary);

        System.out.println("""
        \n5. Crea una clase abstracta Shape con un método calculateArea(). Luego
        implementa ese método en Circle y Rectangle.""");
        //var myCircle = new Circle(20);
        //myCircle.calculateArea();
        //var myRectangle = new Rectangle(20, 30);
        //myRectangle.calculateArea();

        System.out.println("""
        \n6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba
        fly() pero también llame al método original con super.fly().""");
        //var myBird = new Inheritance.Bird();
        //myBird.fly();
        //var myEagle = new Eagle();
        //myEagle.fly();

        System.out.println("""
        \n7. Haz una clase Device con un constructor que imprima "Device created".
        Luego crea Phone que herede de Device y en su constructor imprima "Phone
        ready".""");
        //var myDevice = new Device();
        //var myPhone = new Phone();

        System.out.println("""
        \n8. Account tiene un saldo y métodos para deposit() y withdraw().
        SavingsAccount hereda y agrega un método addInterest().""");
        //var myAccount = new Account();
        //System.out.println(myAccount.balance);
        //myAccount.deposit(50);
        //System.out.println(myAccount.balance);
        //myAccount.withDraw(25);
        //System.out.println(myAccount.balance);
        //var mySavingAccount = new SavingsAccount();
        //mySavingAccount.deposit(100);
        //mySavingAccount.withDraw(50);
        //mySavingAccount.addInterest(25);


        System.out.println("""
        \n9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con
        un método describe() sobrescrito.""");
        var myNewCar = new Car("myNewCar");
        myNewCar.describe();
        //var myBike = new Exercises_Inheritance.Bike();
        //myBike.move();




        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
        // Recorre la lista y llama a makeSound().
    }
}
