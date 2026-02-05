public class Operators {
    public static void main (String[] args){
        double a = 5;
        var b = 3;

        // Aritméticos
        System.out.println(a/b);
        System.out.println(a%b);

        // De asignación
        a = b;
        b += 1;
        System.out.println(a);
        System.out.println(b);
        b *= 2;
        System.out.println(b);
        b /= 2;
        System.out.println(b);
        b %= 2;
        System.out.println(b);

        // De comparación o relacionales
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);

        // lógicos
        System.out.println(true && true);
        System.out.println(3 > 2 && 5 == 5);
        System.out.println(true || false);
        System.out.println(3 > 2 || 6 < 5);
        System.out.println(!(3>2) || 6<5);

        // Operadores unarios:
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        ++b;
        System.out.println(b);

    }
}