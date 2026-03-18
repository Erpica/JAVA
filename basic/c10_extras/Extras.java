package c10_extras;
import c08_oop.Person;

import java.util.Scanner;

public class Extras {
    static String globalName = "ErPica";

    public void main (String[] args) {
        // Extras
        // ctrl + espacio: Si ya escribí el punto y se quitaron las sugerencias, así salen otra vez
        // si escribo sout + enter me hace el System.out.println();

        // null: ausencia de valor, solo se puede usar con objetos, no con tipos de datos primitivos
        String name = "Pica";
        name = null;
        if (name != null) {
            System.out.println(name.toUpperCase());
        }

        // import
        new Person("Anto", 45, "123456");

        // Scanner: Para que el usuario meta datos (entre otras muchas cosas):
        var scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("La edad es " + age);

        test();

    }
        // Scope
        public static void test(){
            System.out.println(globalName);

            // static: que pertenece a la clase y no a la instancia
        }




}
