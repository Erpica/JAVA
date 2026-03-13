package c08_oop.AbstractionExercisesAndClases;

// 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica
//  diferente para calcular el salario.

public abstract class Employee {
    double hourlyWage;
    double salary;

    public abstract double calculateSalary();

}
