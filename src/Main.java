import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) { // Bucle que se ejecuta mientras la opción no sea 0.
            System.out.println("Menú:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("14. Ejercicio 14");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando el Ejercicio 1...");
                    Ejercicio1(sc);
                    break;
                case 2:
                    System.out.println("Ejecutando el Ejercicio 2...");
                    Ejercicio2(sc);
                    break;
                case 3:
                    System.out.println("Ejecutando el Ejercicio 3...");
                    Ejercicio3(sc);
                    break;
                case 4:
                    System.out.println("Ejecutando el Ejercicio 4...");
                    Ejercicio4(sc);
                    break;
                case 5:
                    System.out.println("Ejecutando el Ejercicio 5...");
                    Ejercicio5(sc);
                    break;
                case 6:
                    System.out.println("Ejecutando el Ejercicio 6...");
                    Ejercicio6();
                    break;
                case 7:
                    System.out.println("Ejecutando el Ejercicio 7...");
                    Ejercicio7(sc);
                    break;
                case 8:
                    System.out.println("Ejecutando el Ejercicio 8...");
                    Ejercicio8(sc);
                    break;
                case 9:
                    System.out.println("Ejecutando el Ejercicio 9...");
                    Ejercicio9(sc);
                    break;
                case 10:
                    System.out.println("Ejecutando el Ejercicio 10...");
                    Ejercicio10(sc);
                    break;
                case 11:
                    System.out.println("Ejecutando el Ejercicio 11...");
                    Ejercicio11(sc);
                    break;
                case 12:
                    System.out.println("Ejecutando el Ejercicio 12...");
                    Ejercicio12(sc);
                    break;
                case 13:
                    System.out.println("Ejecutando el Ejercicio 13...");
                    Ejercicio13(sc);
                    break;
                case 14:
                    System.out.println("Ejecutando el Ejercicio 14...");
                    Ejercicio14(sc);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Elige una opción válida.");
                    break;
            }
        }
        sc.close();
    }

    public static void Ejercicio1(Scanner sc) {
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
    }

    public static void Ejercicio2(Scanner sc) {
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        // Verifica si el número es par o impar usando el operador módulo (%) y lo imprime.
        System.out.println(numero % 2 == 0 ? numero + " es par" : numero + " es impar");
    }

    public static void Ejercicio3(Scanner sc) {
        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();
        double area = Math.PI * radio * radio; // Calcula el área del círculo usando la fórmula de área.
        System.out.println("El área del círculo es: " + area);
    }

    public static void Ejercicio4(Scanner sc) {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int adivinanza;
        do {
            System.out.print("Adivina un número entre 1 y 100: ");
            adivinanza = sc.nextInt();
            if (adivinanza < numeroAleatorio) {
                System.out.println("El número es mayor");
            } else if (adivinanza > numeroAleatorio) {
                System.out.println("El número es menor");
            }
        } while (adivinanza != numeroAleatorio);
        System.out.println("¡Has acertado! máquina, crack, titán, arquitecto, astronauta.");
    }

    public static void Ejercicio5(Scanner sc) {
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void Ejercicio6() {
        int suma = 0;
        // Suma los números del 1 al 100.
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los números es: " + suma);
    }

    public static void Ejercicio7(Scanner sc) {
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        // Imprime la cadena invertida usando StringBuilder.
        System.out.println("Tu cadena al revés es: " + new StringBuilder(cadena).reverse().toString());
    }

    public static void Ejercicio8(Scanner sc) {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        int vocales = 0;
        // Cuenta cuántas vocales hay en la frase ignorando mayúsculas.
        for (char c : frase.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vocales++;
            }
        }
        System.out.println("La frase contiene " + vocales + " vocales.");
    }

    public static void Ejercicio9(Scanner sc) {
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        boolean esPrimo = true;
        // Verifica si el número es primo comprobando si tiene divisores entre 2 y la raíz cuadrada del número.
        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        System.out.println(numero + (esPrimo ? " es primo" : " no es primo"));
    }

    public static void Ejercicio10(Scanner sc) {
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32; // Convierte de Celsius a Fahrenheit usando la fórmula F = C * 9/5 + 32.
        System.out.println(celsius + "°C son " + fahrenheit + "°F");
    }

    public static void Ejercicio11(Scanner sc) {
        System.out.print("¿Cuántos números quieres de la cadena Fibonacci? ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    public static void Ejercicio12(Scanner sc) {
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        // Imprime el número invertido convirtiéndolo primero a cadena y luego invirtiéndolo.
        String invertido = new StringBuilder(Integer.toString(numero)).reverse().toString();
        System.out.println("El número invertido es: " + invertido);
    }

    public static void Ejercicio13(Scanner sc) {
        System.out.print("Introduce el nombre del anime: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la cantidad de episodios: ");
        int episodios = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea
        System.out.print("Introduce el género: ");
        String genero = sc.nextLine();
        System.out.println("Anime: " + nombre + ", Episodios: " + episodios + ", Género: " + genero);
    }

    public static void Ejercicio14(Scanner sc) {
        java.util.List<String> inventario = new java.util.ArrayList<>(); // Define un inventario como una lista mutable de videojuegos.
        int opcion;
        do {
            System.out.println("1. Añadir videojuego");
            System.out.println("2. Eliminar videojuego");
            System.out.println("3. Mostrar inventario");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el título del videojuego: ");
                    String titulo = sc.nextLine();
                    inventario.add(titulo);
                    System.out.println("Videojuego " + titulo + " añadido.");
                    break;
                case 2:
                    System.out.print("Introduce el título del videojuego: ");
                    titulo = sc.nextLine();
                    if (inventario.remove(titulo)) {
                        System.out.println("Videojuego " + titulo + " eliminado.");
                    } else {
                        System.out.println("No se encontró el videojuego " + titulo + ".");
                    }
                    break;
                case 3:
                    System.out.println("Inventario:");
                    for (String juego : inventario) {
                        System.out.println(juego);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }
}