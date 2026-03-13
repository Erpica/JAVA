package c08_oop;

public class Abstraction {

    public static void main(String[] args) {

        // Abstracción

        // - Clase abstracta: No se pueden crear objetos de ella, es decir, no se puede instanciar.
        // También se puede usar para obligar a las subclases a definir un método, por ejemplo: "public abstract void sound();".

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface
        // Solo definimos los métodos a nivel declaración, sin la implementación.
        // La clase que implementa a la interface está obligada a sobreescribir TODOS los métodos de la interface.
    }

    // - Clase abstracta

    public static abstract class Animal {

        public abstract void sound();

        public void sleep() {
            System.out.println("El animal está durmiendo");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }

        @Override
        public void sleep() {
            System.out.println("El perro está durmiendo");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("Miau");
        }
    }

    // - Interface

    public interface Flying {

        void fly();
    }

    public static class Bird extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Pio pio");
        }

        @Override
        public void fly() {
            System.out.println("El pájaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Soy batman!");
        }

        @Override
        public void fly() {
            System.out.println("El murciélago vuela");
        }
    }
}
