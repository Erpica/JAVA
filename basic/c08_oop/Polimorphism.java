package c08_oop;

public class Polimorphism {
    // Distintos objetos responden de manera diferente a la misma función
    public static void main(String[] args){
        // Tipos:
        // Polimorfismo por herencia (sobreescritura)
        var myAnimal = new Animal();
        myAnimal.sound();

        var dog = new Dog();
        dog.sound();

        // Polimorfismo por sobrecarga (sobrecarga de métodos)
        var calculator = new Calculator();
        System.out.println(calculator.sum(2, 3));
        System.out.println(calculator.sum(2, 3, 6));
        System.out.println(calculator.sum(2.4, 3.2));
    }

    // Polimorfismo por herencia (sobreescritura)
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
