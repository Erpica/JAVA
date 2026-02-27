package c08_oop;

public class Student {

    //System.out.println("\n5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).");

    int score;
    public void examPassed (){
        if (this.score >= 60){
            System.out.println("Has aprobado el examen con un " + this.score);
            return;
        }
        System.out.println("Has suspendido el examen con un " + this.score);
    }

    public void study(){
        System.out.println("Estoy estudiando.");
    }
}
