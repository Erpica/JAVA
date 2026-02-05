public class BeginnerExercises {

    public static void main(String[] args) {
        System.out.println("1. Declara una variable de tipo String y asígnale tu nombre.");
        String MyName = "Anto";

        System.out.println("2. Crea una variable de tipo int y asígnale tu edad.");
        int MyAge = 45;

        System.out.println("3. Crea una variable double con tu altura en metros.");
        double MyHeight = 1.72;

        System.out.println("4. Declara una variable de tipo boolean que indique si te gusta programar.");
        boolean LikePrograming = true;

        System.out.println("5. Declara una constante con tu email.");
        final String MyMail = "AntoPic@Pic.es";

        System.out.println("6. Crea una variable de tipo char y guárdale tu inicial.");
        char MyInitial = 'A';

        System.out.println("7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.");
        String MyPlace = "Cádiz";
        System.out.println(MyPlace);
        MyPlace = "Puerto Real";
        System.out.println(MyPlace);

        System.out.println("8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.");
        int a = 2;
        int b = 5;
        System.out.println(a+b);

        System.out.println("9. Imprime el tipo de dos variables creadas anteriormente.");
        System.out.println(MyPlace.getClass().getSimpleName()); // Siempre que sea una clase, no un dato primitivo
        System.out.println(((Object)LikePrograming).getClass().getSimpleName()); // IMPORTANTE PARA DATOS PRIMITIVOS
        System.out.println("10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.");
        int MyVar;
        MyVar = 4;
        System.out.println(MyVar);
    }
}
