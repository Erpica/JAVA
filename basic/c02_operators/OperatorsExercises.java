public class OperatorsExercises {

    public static void main(String[] args) {
        System.out.println("1. Crea una variable con el resultado de cada operación aritmética.");
        System.out.println("2. Crea una variable para cada tipo de operación de asignación.");
        int a = 2;
        int b = 4;
        var Plus = a + b;
        var Minus = a - b;
        var Multiply = a * b;
        var Div = a / b;
        var Remainder = a % b;

        System.out.println("3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.");
        System.out.println(2 == 2);
        System.out.println(3 < 5);
        System.out.println(3 != 4);

        System.out.println("4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.");
        System.out.println(3 <= 1);

        System.out.println("5. Utiliza el operador lógico and.");
        System.out.println(3 <= 10 && 4 == 4);

        System.out.println("6. Utiliza el operador lógico or.");
        System.out.println(3 <= 10 || 4 <= 4);

        System.out.println("7. Combina ambos operadores lógicos.");
        System.out.println(true || false && true);

        System.out.println("8. Añade alguna negación.");
        System.out.println(true || !false && true);

        System.out.println("9. Imprime 3 ejemplos de uso de operadores unarios.");
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(--a);

        System.out.println("10. Combina operadores aritméticos, de comparación y lógicos.");
        System.out.println( a < b || b == a && b < a);
    }
}