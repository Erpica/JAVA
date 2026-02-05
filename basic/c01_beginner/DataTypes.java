public class DataTypes {
    public static void main (String[] args){
        int myInt = 45;
        System.out.println(myInt);

        double myDouble = 1.72;
        System.out.println(myDouble);
        // float, long, byte

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean =true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola Pica";      // Aquí, en java, on es primitivo
        System.out.println(myString);

        // Ver el tipo de dato
        System.out.println(myString.getClass().getSimpleName()); // Siempre que sea una clase, no un dato primitivo
    }
}