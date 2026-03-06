package c08_oop.PolymorphismExercisesAndClases;

// 6. Crea una clase Notification con método send(), y subclases
// EmailNotification, SMSNotification. Luego crea una función
// sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

public class EmailNotification extends Notification{
    //String message;

    public EmailNotification(String message){
        super(message);
    }

    public void send(){
        System.out.println("Mensaje enviado por mail");
    }



}
