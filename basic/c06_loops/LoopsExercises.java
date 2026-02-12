package basic.c06_loops;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;

public class LoopsExercises {
    // LOS CORCHETES SON EXCLUSIVOS PARA LOS ARRAY      <=======
    public static void main(String[] args) {
        System.out.println("1. Imprime los números del 1 al 10 usando while.");
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("\n2. Usa do-while para mostrar todos los valores de un ArrayList.");
        // var myArrayList = new ArrayList<String>();
        var myArrayList = new ArrayList<String>(List.of("a", "e", "i", "o", "u"));
        //var myArrayList = new ArrayList<String>(List.of("a"; "e"; "i"; "o"; "u"));
        i = 0;
        do {
            System.out.println(myArrayList.get(i));
            i++;
        } while (i < myArrayList.size());

        System.out.println("\n3. Imprime los múltiplos de 5 del 1 al 50 usando for.");
        for (i = 1; i <= 50; i++){
            if (i % 5 ==0){
                System.out.println(i);
            }
        }

        System.out.println("\n4. Recorre un Array de 5 números e imprime la suma total.");
        // int[] myArray = new int[]{3, 5, 23, 3, 1}; // => De otra forma
        int[] myArray = {3, 5, 23, -5, 3, 1};
        var sum = 0;
        for (int number: myArray){
            sum += number;

        }
        System.out.println(sum);

        System.out.println("\n5. Usa un for para recorrer un Array y mostrar sus valores.");
        for (i = 0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println("\n6. Usa for-each para recorrer un HashSet y un HashMap.");
        // LOS CORCHETES SON EXCLUSIVOS PARA LOS ARRAY      <=======
        var myHashSet = new HashSet<String>(Set.of("uno", "dos", "tres"));
        for (String element: myHashSet){
            System.out.println(element);
        }

        var myMap = new HashMap<String, Integer>(Map.of(
                "Anto", 10,
                "Alba", 7,
                "Sara", 3
        ));

        for (Map.Entry<String, Integer> NameAge : myMap.entrySet() ) {
            System.out.println(NameAge.getKey() + ": " + NameAge.getValue());
        }

        // for(Map.Entry entry: map.entrySet())  // <== el foreach del map

        System.out.println("\n7. Imprime los números del 10 al 1 (descendiente) con un bucle for.");
        for (i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("\n8. Usa continue para saltar los múltiplos de 3 del 1 al 20.");
        for (i = 1; i <= 20; i++){
            if (!(i % 3 == 0)){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n9. Usa break para detener un bucle cuando encuentres un número negativo en un array.");
        for (int number: myArray){
            if (number < 0){
                System.out.println("Encontré un número negativo: " + number);
                break;
            }
        }

        System.out.println("\n10. Crea un programa que calcule el factorial de un número dado.");
        int number = 5;
        int factorial = 1;
        for (i = number; i >= 1; i++){
            factorial *= number;
        }
        System.out.println(factorial);
    }
}
