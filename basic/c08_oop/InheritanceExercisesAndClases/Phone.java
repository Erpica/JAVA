package c08_oop.InheritanceExercisesAndClases;

//n7. Haz una clase Device con un constructor que imprima "Device created".
//Luego crea Phone que herede de Device y en su constructor imprima "Phone
//ready".

public class Phone extends Device{
    public Phone(){
        System.out.println("\"Phone ready\"");
    }
}
