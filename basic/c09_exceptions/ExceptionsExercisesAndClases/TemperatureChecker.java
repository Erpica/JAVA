package c09_exceptions.ExceptionsExercisesAndClases;

//"7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50."

public class TemperatureChecker {
    public TemperatureChecker(double myTemperature) throws TemperatureException{
        if (myTemperature <50 || myTemperature > 50){
            throw new TemperatureException("Temperatura incorrecta.");
        } else {
            System.out.println("Temperatura correcta");
        }
    }
}
