package c08_oop.InheritanceExercisesAndClases;

//8. Account tiene un saldo y métodos para deposit() y withdraw().
//SavingsAccount hereda y agrega un método addInterest().

public class SavingsAccount extends Account{
    public void addInterest(int interest){
        this.balance = this.balance+(this.balance*interest/100);
        System.out.println("Ahora tu cuenta asciende a " + this.balance + " €.");
    }
}
