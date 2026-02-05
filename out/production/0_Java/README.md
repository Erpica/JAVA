<<<<<<< HEAD
# Principio: "Write Once, Run Anywhere"

- JVM: Java virtual machine
- Lenguaje compilado (no interpretado):
Se compila en tiempo de ejecución. El código máquina lo crea JVM


## Características:
* POO
* Fuertemente tipado
* Lenguaje compilado y también interpretado
  * El compilador (javac) transforma el código .java en bytecode .class
  * Luego lo ejecuta la JVM
  * Esto garantiza rendimiento y portabilidad

## Uso real:
* Donde más en desarrollo de aplicaciones empresariales por su seguridad.
* Backend
* Aplicaciones de escritorio con javafx (https://openjfx.io/)

## Frameworks
https://hadoop.apache.org/
https://sparkjava.com/
https://kafka.apache.org/

## Versiones - Oficial: Oracle
* Java SE (Standard edition).
* JAva EE (Enterprise Edition): Más herramientoas, mejor rendimiento a veces, más soporte.
* Open JDK. También de oracle, open source

## Editor que vamos a usar:
Jetbrains (Intellij)



# Instalar JDK
## Descarga (dos opciones):
* Desde Oracle:
  https://www.oracle.com/es/java/technologies/downloads/
* Desde Open JDK:
  https://openjdk.org/

## Configuración:
1. Panel de control → Sistema → Configuración avanzada del sistema
2. Botón Variables de entorno
3. En “Variables del sistema”, pulsa Nuevo
4. Nombre: `JAVA_HOME`
5. Valor: `C:\Program Files\Java\jdk-25` (o donde lo hayas instalado)
6. Añadir al Path: `%JAVA_HOME%\bin`

Para comprobar que está OK:
* `java -version`
* `javac -version`
  
# Instalar IDE:
IntelliJ IDEA
JetBrains IDEs

community edition (gratis)

=======
# Principio: "Write Once, Run Anywhere"

- JVM: Java virtual machine
- Lenguaje compilado (no interpretado):
Se compila en tiempo de ejecución. El código máquina lo crea JVM


## Características:
* POO
* Fuertemente tipado
* Lenguaje compilado y también interpretado
  * El compilador (javac) transforma el código .java en bytecode .class
  * Luego lo ejecuta la JVM
  * Esto garantiza rendimiento y portabilidad

## Uso real:
* Donde más en desarrollo de aplicaciones empresariales por su seguridad.
* Backend
* Aplicaciones de escritorio con javafx (https://openjfx.io/)

## Frameworks
https://hadoop.apache.org/
https://sparkjava.com/
https://kafka.apache.org/

## Versiones - Oficial: Oracle
* Java SE (Standard edition).
* JAva EE (Enterprise Edition): Más herramientoas, mejor rendimiento a veces, más soporte.
* Open JDK. También de oracle, open source

## Editor que vamos a usar:
Jetbrains (Intellij)



# Instalar JDK
## Descarga (dos opciones):
* Desde Oracle:
  https://www.oracle.com/es/java/technologies/downloads/
* Desde Open JDK:
  https://openjdk.org/

## Configuración:
1. Panel de control → Sistema → Configuración avanzada del sistema
2. Botón Variables de entorno
3. En “Variables del sistema”, pulsa Nuevo
4. Nombre: `JAVA_HOME`
5. Valor: `C:\Program Files\Java\jdk-25` (o donde lo hayas instalado)
6. Añadir al Path: `%JAVA_HOME%\bin`

Para comprobar que está OK:
* `java -version`
* `javac -version`
  
# Instalar IDE:
IntelliJ IDEA
JetBrains IDEs

community edition (gratis)

# Empezamos:
Una vez creada la carpeta, iniciado git, primer commit y primer push...
Hay que decirle a IntelliJ IDEA que la carpeta es la de los ejecutables. Botón derecho en la carpeta, 
>"Mark Directory Ss"
> 
> "Sources Root"

Creamos el fichero HelloWorld.java y en su interior:
~~~
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hola Java");
  }
}
~~~

Hecho esto ya podemos ejecutar. 
Se creará un .class con el mismo nombre que nosotros no vamos a editar nunca. Lo hacemos siempre en el .java.

## Comentarios:
`// De una línea`

`/* De varias líneas*/`
