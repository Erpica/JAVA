public class StringsExercises {

    public static void main(String[] args) {
        System.out.println("1. Concatena dos cadenas de texto.");
        var MyFirstString = "Cadena 1";
        var MySecondString = "Cadena 2";
        var ConcatenedStrings = MyFirstString + " " + MySecondString;
        System.out.println(ConcatenedStrings);


        System.out.println("2. Muestra la longitud de una cadena de texto.");
        System.out.println(ConcatenedStrings.length());

        System.out.println("3. Muestra el primer y último carácter de un string.");
        System.out.println(MyFirstString.charAt(0));
        System.out.println(MyFirstString.charAt(MyFirstString.length() - 1));


        System.out.println("4. Convierte a mayúsculas y minúsculas un string.");
        System.out.println(MySecondString.toUpperCase());
        System.out.println(MySecondString.toLowerCase());

        System.out.println("5. Comprueba si una cadena de texto contiene una palabra concreta.");
        System.out.println(MySecondString.contains("2"));

        System.out.println("6. Formatea un string con un entero.");
        System.out.format("Hola este es mi string: %s", 2);

        System.out.println("7. Elimina los espacios en blanco al principio y final de un string.");
        System.out.println(" Hola, tengo espacios ".trim());

        System.out.println("8. Sustituye todos los espacios en blanco de un string por un guión (-).");
        System.out.println(" Hola, tengo espacios ".replace(" ", "-"));

        System.out.println("9. Comprueba si dos strings son iguales.");
        System.out.println(MyFirstString.equals(MySecondString));

        System.out.println("10. Comprueba si dos strings tienen la misma longitud.");
        System.out.println(MyFirstString.length() == MySecondString.length());
    }
}