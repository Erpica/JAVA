package basic.c04_conditionals;

public class ConditionalsExercises {

    public static void main(String[] args) {
        System.out.println("1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).");
        var age = 19;
        if (age >= 18){
            System.out.println("Puede usted votar");
        } else {
            System.out.println("Todavía no puede usted votar");
        }

        System.out.println("2. Declara dos números y muestra cuál es mayor, o si son iguales.");
        var numberOne = 2;
        var numberTwo = 3;
        if (numberOne > numberTwo) {
            System.out.println("Es mayor el número " + numberOne);
        } else if (numberOne < numberTwo) {
                System.out.println("Es mayor el número " + numberTwo);
            } else {
            System.out.println("Son iguales");
        }


        System.out.println("3. Dado un número, verifica si es positivo, negativo o cero.");

        if (numberOne > 0) {
            System.out.println("El número es negativo");
        } else if (numberOne < 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("Es 0");
        }

        System.out.println("4. Crea un programa que diga si un número es par o impar.");
        if (numberOne % 2 ==0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        System.out.println("5. Verifica si un número está en el rango de 1 a 100.");
        if (numberOne > 1 && numberOne < 100){
            System.out.format("El número %d está entre 0 y 100", numberOne);
        }

        System.out.println("6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.");
        var day = 1;

        switch (day){
            case 1: {
                System.out.println("Lunes");
                break;
            }
            case 2: {
                System.out.println("Martes");
                break;
            }
            case 3: {
                System.out.println("Miércoles");
                break;
            }
            case 4: {
                System.out.println("Jueves");
                break;
            }
            case 5: {
                System.out.println("Viernes");
                break;
            }
            case 6: {
                System.out.println("Sábado");
                break;
            }
            case 7: {
                System.out.println("Domingo");
                break;
            }
            }

        System.out.println("7. Simula un sistema de notas: muestra \"Sobresaliente\", \"Aprobado\" o \"Suspenso\" según la nota (0-100).");
        var calification = 5;
        if (calification >= 0 && calification <50){
            System.out.println("Suspenso");
        } else if (calification >= 50 && calification <850){
            System.out.println("Aprobado");
        } System.out.println("Sobresaliente");

        System.out.println("8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.");
        var accompanied = true;
        if (age >= 15 || accompanied == true){
            System.out.println("Puedes pasar");
        } else{
            System.out.println("Debes tener al menos 15 o venir acompañado");
        }

        System.out.println("9. Crea un programa que diga si una letra es vocal o consonante.");
        char character ='s';
        if (Character.toLowerCase(character) == 'a' || Character.toLowerCase(character) == 'e' || Character.toLowerCase(character) == 'i' || Character.toLowerCase(character) == 'o' || Character.toLowerCase(character) == 'u'){
            System.out.println(character + " es una vocal");
        } else if (Character.isLetter(character)){
            System.out.println(character + " es una consonante");
        } else {
            System.out.println("No es u na letra");
        }



        System.out.println("10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.");
        var a = 1;
        var b = 2;
        var c = 3;

        if (a > b && a > c) {
            System.out.println(a + " es la mayor");
        } else if (b > c){
                System.out.println(b + " es la mayor");
        } else {
            System.out.println(c + " es la mayor");
        }


        

    }
}