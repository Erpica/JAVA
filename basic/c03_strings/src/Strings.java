package basic.c03_strings;

public class Strings {
    public static void main (String[] args) {
        String name = "Anto";
        var surname = new String ("Pic"); // No se usa. Sería instanciando la clase String

        // Operaciones básicas
        System.out.println(name + " " + surname);
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(name.length() - 1)); // dame el último caracter

        // Subcadena
        System.out.println(name.substring(1, 3)); // Excluye el último

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Comprobar si contiene
        System.out.println("Hola Java".contains("Ja"));

        // Comparación
        System.out.println(name.equals("Anto"));
        System.out.println(name.equalsIgnoreCase("anto"));

        // == vs. equals
        var a = "Anto";
        var b = "Anto";
        var c = new String ("Anto");
        System.out.println(a == b);
        System.out.println(a == c); // Distinto porque es un nuevo objeto creado. Por eso se usa .equals que compara contenidos

        // Trim y replace
        System.out.println((" Hola, me llamo Anto ".trim())); // Quito los espacios
        System.out.println((" Hola, me llamo Anto ".replace(" ","")));
        System.out.println((" Hola, me llamo Anto ".replace("Anto","Pica")));

        // Format
        var age = 45;
        System.out.println(String.format("Hola, me llamo %s. Tengo %d años.", name, age));

    }
}