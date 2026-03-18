package c10_extras;

//6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
// 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.

public class User {
    static final String myVar = "Hola desde la clase. ";
    static final String APP_NAME = "Pic";

    static String username = "Anto";

    public static void printParameters(){
        System.out.println(APP_NAME);
        System.out.println(username);
    }
}
