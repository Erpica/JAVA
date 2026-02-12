package basic.c5_structures;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {
public static void main (String[] args){
        System.out.println("1. Crea un Array con 5 valores e imprime su longitud.");
        int [] numbers = new int [5];
        System.out.println("Resultado: " + numbers.length + "\n");

        System.out.println("2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.");
        System.out.println("Antes de modificarlo: " + numbers[0]);
        numbers[0] = 100;
        System.out.println("Después de modificarlo: " + numbers[0] + "\n");

        System.out.println("3. Crea un ArrayList vacío.");
        var numbersList = new ArrayList<Integer>();
        System.out.println(numbersList + "\n");

        System.out.println("4. Añade 4 valores al ArrayList y elimina uno a continuación.");
        numbersList.add(2);
        numbersList.add(4);
        numbersList.add(6);
        numbersList.add(8);
        System.out.println(numbersList);
        numbersList.remove(3);
        System.out.println(numbersList + "\n");

        System.out.println("5. Crea un HashSet con 2 valores diferentes.");
        var myHashSet = new HashSet<String>();
        myHashSet.add("Hola");
        myHashSet.add("adios");
        System.out.println(myHashSet + "\n");

        System.out.println("6. Añade un nuevo valor repetido y otro sin repetir al HashSet.");
        myHashSet.add("Hola");
        myHashSet.add(" que tal ");
        System.out.println(myHashSet + "\n");


        System.out.println("7. Elimina uno de los elementos del HashSet.");
        myHashSet.remove("Hola");
        System.out.println(myHashSet + "\n");

        System.out.println("8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.");
        var myHashMap = new HashMap<String, Integer>();
        myHashMap.put("Antonio", 123);
        myHashMap.put("Pica", 456);
        myHashMap.put("ErPica", 789);

        System.out.println("9. Modifica uno de los contactos y elimina otro.");
        System.out.println(myHashMap);
        myHashMap.remove("Pica");
        System.out.println(myHashMap);
        myHashMap.replace("ErPica", 000);
        System.out.println(myHashMap + "\n");

        System.out.println("10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.");
        Integer[] firstArray = {1, 2, 3};
        System.out.println("Array: " + firstArray);
        ArrayList<Integer> firstArrayList = new ArrayList<>(Arrays.asList(firstArray));
        System.out.println("ArrayList: " + firstArrayList);

        HashSet<Integer> firstHashSet = new HashSet<>(Arrays.asList(firstArray));
        System.out.println("HashSet: " + firstHashSet);

        //HashMap<Integer, Integer> firstHashMap = new HashMap<>(Map.of(1; 100; 2; 200));
        HashMap<Integer, Integer> firstHashMap = new HashMap<>();
        for (int i = 0; i < firstArray.length; i++){
                firstHashMap.put(firstArray[i], firstArray[i]);
        }
        System.out.println("HashSet: " + firstHashMap);
    }
}


