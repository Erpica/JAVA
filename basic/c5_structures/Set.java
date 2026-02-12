package basic.c5_structures;

import java.util.HashSet;

public class Set {
    public static void main (String[] args){
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        System.out.println(names.size());

        names.add("Anto");
        names.add("Erpica");
        names.add("Pic");
        names.add("Anto@Pic.es");
        System.out.println((names.size()));
        System.out.println((names));

        names.remove("Anto@Pic.es");
        System.out.println((names.size()));
        System.out.println((names));


        System.out.println(names.contains("Pic"));

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println((numbers));

        // names.add(numbers); // Error por tipo de dato incompatible

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Chequia");
        countries.add("Argentina");
        countries.add("Pic");

        names.addAll(countries);
        System.out.println(names);

        //names.removeAll(countries);
        // System.out.println(names);
        names.retainAll(countries); // Intersección
        System.out.println(names);

    }
}
