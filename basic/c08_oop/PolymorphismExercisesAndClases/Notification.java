package c08_oop.PolymorphismExercisesAndClases;

// 6. Crea una clase Notification con método send(), y subclases
// EmailNotification, SMSNotification. Luego crea una función
// sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

public class Notification {
    String message;

    public Notification (String message){
        this.message = message;
        //System.out.println("Notificación simple creada");
    }

    public void send(){
        System.out.printf("Notificación enviada: %s\n", this.message);
    }

    public void sendNotification(Notification n){
        n.send();

    }
}
