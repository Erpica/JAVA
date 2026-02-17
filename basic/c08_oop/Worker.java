package basic.c08_oop;

public class Worker  {
    String name;
    double salary;
    // Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
    public Worker (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void showSalary (){

        System.out.println("El salario es " + this.salary + " €");

    }
}
