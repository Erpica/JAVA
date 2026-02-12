package basic.c5_structures;

import java.util.HashMap;

public class Maps {
    public static void main (String[] args){
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        System.out.println(names.size());

        names.put("Pic", "Pic@Pic.es");
        names.put("Anto", "Anto@Pic.es");
        names.put("Erpica", "Erpica@Pic.es");

        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.get("Pic"));
        System.out.println(names.get("Pica")); // null

        System.out.println(names.containsKey("Pic"));
        System.out.println(names.containsValue("Pic@Pic.es"));

        names.remove("Pic");  // Elimina y devuelve el valor eliminado asociado a la clave que se le pasa.
        // names.clear(); // Me lo cargo entero

        names.replace("Anto", "NewAnto"); // Como put pero solo cambia el valor si existe
        names.putIfAbsent("Pic", "NewPic"); // Solo lo añade si no existe

        System.out.println(names);
        System.out.println(names.values());


    }
}
