package c08_oop;

public class Classes {
    public static void main(String[] args){
        var person = new Person("Antonio", -45, "123456789A");
        person.sayHello();
        person.setAge(45);
        person.sayHello();

        person.name = "Anto"; // Ya no se puede porque es private. Si fuera protected solo podría desde dentro del paquete (c08_oop)
        //person.age = 45;
        person.sayHello();

        //person.id = "123456789A";
        // System.out.println(person.name); // => Al hacerlo privado ya no puedo acceder así
        System.out.println("getAge:" + person.getage());



        var person2 = new Person("Irene", 42, "123456789B");
        person2.sayHello();

        System.out.println(person.getId());

    }
}

