package basic.c08_oop;

public class Person {       // SIEMPRE PUBLIC LA CLASE. no puede ser privada o protected porque entonces no podría acceder desde el programa
    // Atributos
    protected String name;
    private int age;    // private porque solo se podrá meter con el setAge
    final private String id; // Una vez que lo establezca no se puede cambiar ni desde fuera (private) ni desde dentro (final)

    // Constructor
    public Person(String name, int age, String id){
        this.name = name;
        // this.age = age; // Cuando creo un setter para evitar edades negativas tengo que meter la edad con el setter:
        this.setAge(age);
        this.id = id;
    }

    // Métodos
    public void sayHello(){
        System.out.println("Hola, soy " + name + " y tengo " + age + " años y mi id es " + this.id + ".");
    }

    // getter
    public String getId(){
        return id;
    }
    public Integer getage(){
        return age;
    }

    // setter
    public void setAge(int age){
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }
}
