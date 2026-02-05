public class VariablesAndContants {
    public static void main(String[] args){
        String name = "Pica"; // String es una clase
        System.out.println(name);
        int age = 45;            // int es datos primitivo, por eso va en minúsculas
        System.out.println(age);
        name ="ErPica";
        System.out.println(name);

        var email = "Pica@pic.es";  // Se va a dar cuenta de que es un String (inferencia de tipos)
        // Contantes - Con final y en MAYÚSCULAS
        final String EMAIL = "ErPica@pica.es";
        System.out.println(EMAIL);
        System.out.println(email);
    }
}