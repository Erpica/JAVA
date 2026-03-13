package c08_oop.AbstractionExercisesAndClases;

// 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica
//  diferente para calcular el salario.

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(double salary){
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return this.salary * 6;
    }
}
