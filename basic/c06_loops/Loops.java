package basic.c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main (String[] args){
        for (int index =0; index < 5; index++){
            System.out.println("Hola Pic");
        }

        String[] names = {"Anto", "Pic", "Erpica"};
        for (int index =0; index < names.length; index++){
            System.out.println(names[index]);
        }

        // foreach
        for (String name: names){
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (Integer number:numbers){
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Pic", "Pic@Pic.es");
        emails.put("Anto", "Anto@Pic.es");
        emails.put("Erpica", "Erpica@Pic.es");
        for (Map.Entry<String, String> email:emails.entrySet()){
            System.out.println(email);
            System.out.println(email.getKey() + " -> " + email.getValue());
        }

        int index = 0;
        while (index < 5){
            System.out.println("Hola Pic");
            index++;
        }

        index = 0;
        while (index < names.length){
            System.out.println(names[index]);
            index++;
        }

        index = 0;
        boolean find = false;
        while (!find){
            System.out.println(names[index]);
            if (names[index].equals("Pic")){
                find = true;
            }
            index++;
        }

        index = 0;
        do {
            System.out.println("Pic");
            index ++;
        } while (index < 5);

        // Control de bucles: break y continue
        for (String name: names){
            if (name.equals("Pic")){
                break;      // Ya no escribe Pic
            }
            System.out.println(name);
        }

        for (int i = 0; i < 5 ;  i ++){
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
