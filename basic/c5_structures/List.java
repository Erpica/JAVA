package basic.c5_structures;

import java.util.ArrayList;

public class List {
    public static void main (String[] args) {
        // ArrayList<String> names = new ArrayList<String>(); // Sería redundante, ya se puso al inicio
        ArrayList<String> names = new ArrayList<>();                                  //  => Más clásico
        // var number = new ArrayList<int>(); // Error: No puede ser un tipo de dato primitivo
        // Todos los tipos de datos primitivos en java tienen su equivalente en una clase. Por ejemplo: int -> Integer
        var number = new ArrayList<Integer>();                                          //  => Más moderno. Recomendado

        System.out.println((names.size()));
        // names[0] = "Pica"; // => Error
        names.add("Anto");
        System.out.println((names.size()));
        names.add("Erpica");
        names.add("Pic");
        System.out.println((names.size()));
        System.out.println((names.get(1)));
        System.out.println((names.getFirst()));
        System.out.println((names.getLast()));

        System.out.println((names.set(2, "Anto@Pic.es")));
        System.out.println((names));
        System.out.println((names.get(2)));

        names.remove(2);
        // System.out.println((names.get(2))); // => Error, solo tengo 2 elementos: el 0 y el 1

        System.out.println(names.contains(("Erpica")));
        names.clear();
        System.out.println((names.size()));

    }
}
