package c09_exceptions;

public class Exceptions {
    public static void main (String[] args){
        // Manejo de execpciones

        // try catch
        try {
            var result = 10 / 5;
            System.out.println(result);

        } catch(ArithmeticException e){ // Hay que tener muy claro que solo puede ocurrir este tipo de excepción, si no => Exception (general)
            System.out.println("Error: " + e.getMessage());
        }

        // try con múltiples catch
        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Anto";
            name = null;
            System.out.println("Nombre: " + name.toUpperCase());

        } catch(ArithmeticException e){ // Hay que tener muy claro que solo puede ocurrir este tipo de excepción, si no => Exception (general)
            System.out.println("Cuidado con dividir algo que no es correcto: " + e.getMessage());
        } catch(NullPointerException e){
            System.out.println("Ha ocurrido un null pointer");
        } catch (Exception e){
            System.out.println("Se ha producido un error no esperado");
        }

        // finally
        try {
            var result = 10 / 0;
            System.out.println(result);

        } catch(ArithmeticException e){ // Hay que tener muy claro que solo puede ocurrir este tipo de excepción, si no => Exception (general)
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del bloque catch");
        }

        // throw
        var throwExample = new ThrowExample();
        try {
            throwExample.checkAge(19);
        } catch (IllegalArgumentException e){
            System.out.println("Error revisando la edad. " + e.getMessage());
        }

        // Excepción personalizada
        try {
            throwExample.checkScore(450);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuación: " + e.getMessage());
        }


        System.out.println("Fin");
    }

}
