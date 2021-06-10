import java.util.Scanner;

public class Ejercicio5J2 {

    public static void main(String[] args) {
        // variables a utilizar
        Scanner scanner = new Scanner(System.in);

        int contadorMujeres = 0;
        int contadorHombres = 0;
        int HM;
        int personas;
        int edades;

        System.out.print("Cuantos Personas ingresaran? ");
        personas = scanner.nextInt();

        for (int i = 0; i < personas; i++) {

            System.out.print("Ingrese si es Hombre 1 y Mujer 2: ");
            HM = scanner.nextInt();
            System.out.print("Ingrese la edad: ");
            edades = scanner.nextInt();

            if (edades < 18 && HM == 1) {

                contadorHombres++;
            }
            if (edades >= 18 && HM == 2) {

                contadorMujeres++;

            }

        }

        System.out.println("Hay " + contadorHombres + " Hombres menores de edad.");
        System.out.println("Hay " + contadorMujeres + " Mujeres mayores de edad.");
    }
}