package c08_oop;

public class BankAccount {
    //Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
    double balance;

    public double deposit (double money){
        this. balance += money;
        return this.balance;
    }

}
