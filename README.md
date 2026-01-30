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

Prueba para github
