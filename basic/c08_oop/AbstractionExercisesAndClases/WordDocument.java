package c08_oop.AbstractionExercisesAndClases;

// 9. Crea una clase abstracta Document con el método print().
//  "Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.

public class WordDocument extends Document{
    public void print(){
        System.out.println("Los documentos de Word se imprimen así");
    }
}
