package c08_oop.AbstractionExercisesAndClases;

// 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment,
//  cada una mostrando un mensaje de pago diferente.

public class Invoice implements Payable{
    @Override
    public void pay(){
        System.out.println("Factura abonada correctamente.");
    }

}
