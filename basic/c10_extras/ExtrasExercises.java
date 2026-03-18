package c10_extras;

import java.util.Scanner;
import java.util.Random;

public class ExtrasExercises {
    static String message = "prueba fuera"; // Al hacerla estática puedo acceder desde dentro de main aunque haya otra
    // variable que se llame igual

    public static void main(String[] args) {
        System.out.println("1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.");
        String myString = null;
        if (myString != null){
            System.out.println(myString);
        }

        System.out.println("2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.");
        var scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        //var name = scanner.next();
        var name = "Anto";
        scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        //var age = scanner.next();
        var age = 45;
        // System.out.println(name);
        // System.out.println(age);

        System.out.println("3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.");
        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE);

        System.out.println("4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.");
        String message = "prueba dentro";
        System.out.println(message);

        System.out.println(ExtrasExercises.message);

        System.out.println("5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.");

        try {
            var scanner5 = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            //var myNumber = scanner5.nextInt();
            var myNumber = 0;

            if (myNumber < 0){
                System.out.println("El número es negativo");
            } else if (myNumber > 0){
                System.out.println("El número es positivo");
            } else {
                System.out.println("Has introducido el cero");
            }
        } catch (Exception e) {
            System.out.println("Debe ser un número entero positivo o negativo");
        }

        System.out.println("6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.");
        System.out.println(User.myVar);

        System.out.println("7. Importa java.util.Random y genera un número aleatorio del 1 al 10.");
        Random random = new Random();
        int myRandomNumber = random.nextInt(10)+1;
        System.out.println(myRandomNumber);

        // Se podía hacer también sin importar random
        //int myRandomNumber = (int)(Math.random()*10)+1;
        //System.out.println(myRandomNumber);

        System.out.println("8. Crea una clase con comentarios adecuados explicando cada sección del código.");

        System.out.println("9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.");
        User.printParameters();

        System.out.println("10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.");
    }
}
