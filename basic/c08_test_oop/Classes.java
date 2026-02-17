package basic.c08_test_oop;

import basic.c08_oop.Person;

public class Classes {
    public static void main(String[] args){
        var person = new Person("Antonio", 45, "123456789A");

        //person.name = "Anto"; // Ya no se puede porque es private. Si fuera protected solo podría desde dentro del paquete (c08_oop) y no desde aquí.
        //person.age = 45;
        person.sayHello();

        // System.out.println(person.name); // => Al hacerlo privado ya no puedo acceder así

/*        var person2 = new Person("Irene", 43, "123456789B");
        person2.sayHello();*/

    }
}

