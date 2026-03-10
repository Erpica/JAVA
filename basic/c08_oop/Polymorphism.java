package c08_oop;

public class Polymorphism {
    // Distintos objetos responden de manera diferente a la misma función (al mismo mensaje, al mismo método, a la misma operación...)
    public static void main(String[] args){
        // Tipos:
        // Polimorfismo por herencia (sobre escritura)
        var myAnimal = new Animal();
        myAnimal.sound();

        var dog = new Dog();
        dog.sound();

        // Polimorfismo por sobrecarga (sobrecarga de métodos: mismo nombre y distintos parámetros)
        var calculator = new Calculator();
        System.out.println(calculator.sum(2, 3));
        System.out.println(calculator.sum(2, 3, 6));
        System.out.println(calculator.sum(2.4, 3));
    }

    // Polimorfismo por herencia (sobre escritura)
    public static class Animal {
        public void sound(){
            System.out.println("Algún sonido");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void sound() {
            System.out.println("Guau");
        }
    }

    // Polimorfismo por sobrecarga (sobrecarga de métodos)
    public static class Calculator{
        public int sum(int a, int b){
            return a + b;
        }

        public int sum(int a, int b, int c){
            return a + b + c;
        }

        public double sum(double a, double b){
            return a + b;
        }
    }
}
