package c08_oop.AbstractionExercisesAndClases;

public class EmployeePayment implements Payable{
    @Override
    public void pay(){
        System.out.println("Nómina abonada correctamente.");
    }
}
