package basic.c04_conditionals;

public class Conditionals {
    public static void main (String[] args) {
        var age = 26;

        if(age > 18){
            System.out.println(("El usuario es mayor de edad"));
        } else if (age == 18) {
            System.out.println(("El usuario acaba de cumplir 18"));
        } else {
            System.out.println(("El usuario es mnenor de edad"));
        }


        var day = 6;
        switch (day) {
            case 1:
                System.out.println(("Lunes"));
                break;
            case 2:
                System.out.println(("Martes"));
                break;
            case 3:
                System.out.println(("Miércoles"));
                break;
            default:
                System.out.println(("Ya está la semana medio ventilá"));

        }
    }
}
