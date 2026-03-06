package c08_oop.PolymorphismExercisesAndClases;

// 3. Crea una clase Printer con varios métodos print() sobrecargados que
// acepten diferentes tipos de parámetros (String, int, double). Llama a cada
// uno desde main.

public class Printer {
    public Printer(){

    }

    public void print(String myString){
        System.out.printf("Has mandado el string %s.\n", myString);
    }

    public void print(int myInt){
        System.out.printf("Has mandado el entero %d.\n", myInt);
    }

    public void print(double myDouble){
        System.out.printf("Has mandado el decimal %.2f.\n", myDouble);
    }
}
