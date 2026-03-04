package c08_oop.InheritanceExercisesAndClases;

//8. Account tiene un saldo y métodos para deposit() y withdraw().
//SavingsAccount hereda y agrega un método addInterest().

public class Account {
    public double balance;

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Ahora tu cuenta asciende a " + this.balance + " €.");
    }

    public void withDraw(double amount){
        this.balance -= amount;
        System.out.println("Ahora tu cuenta asciende a " + this.balance + " €.");
    }
}
