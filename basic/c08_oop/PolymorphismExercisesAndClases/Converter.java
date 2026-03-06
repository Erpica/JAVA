package c08_oop.PolymorphismExercisesAndClases;

// 8. Crea una clase Converter con métodos convert(int), convert(double), y
// convert(String) que devuelvan diferentes formatos de texto.

public class Converter {
    public String convert(int intNumber){
        return "Has introducido un entero";
    }

    public String convert(double doubleNumber){
        return "Has introducido un double";
    }

    public String convert(String stringWords){
        return "Has introducido un string";
    }
}
