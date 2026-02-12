package basic.c7_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main (String[] args){
        for (int index = 0; index < 3; index++){
            sendEmail();
            sendEmailToUser("Pic@pica.es");
            sendEmailToUser("Pic@pica.es", "Anto");

            var users = new ArrayList<>(Arrays.asList("Anto@anto.es", "Pic@pic.es"));
            sendEmailToUser(users);

        }
        var state = sendEmailWithState();
        System.out.println(state);
        System.out.println(sendEmailWithState("Estesí@ole.es"));
        System.out.println(sendEmailWithState(""));
    }

    public static void sendEmail(){
        System.out.println("Se envía el email");
    }

    public static void sendEmailToUser(String email){
        System.out.println("Se envía el email a " + email);
    }

    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envía el email a " + email + " a " + name);
    }

    public static void sendEmailToUser(ArrayList<String> users){
        for (String user: users) {
            sendEmailToUser(user);          // => Función que llama a otra función
        }
    }

    public static boolean sendEmailWithState(){
        System.out.println("Se envía el email");
        return true;
    }

    public static boolean sendEmailWithState(String email){
        if (email.isEmpty()){
            return false; // Si entra en el return sale de la función, no hace falta else entonces
        }
        System.out.println("Se envía el email");
        return true;
    }
}
