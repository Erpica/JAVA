package basic.c5_structures;

public class Arrays {
    public static void main (String[] args){
        int[] numbers = new int[3];
        System.out.println(numbers.length);

        String[] names = {"Anto", "Pic", "Erpica"};
        System.out.println(names);

        System.out.println(numbers[1]);
        System.out.println(names[1]);

        numbers[0] = 3;
        numbers[1] = 30;
        System.out.println(numbers[1]);

        names[1] = null; // Así borro un carácter en un array de strings.
        // En un int no puedo meterle un null porque es un dato primitivo.


    }
}