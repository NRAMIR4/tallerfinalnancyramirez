import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumarNota = 0;
        int contadorNotas = 0;
        do {
            System.out.println("Ingrese la nota:  ");
            double nota = scanner.nextDouble();

            if (nota != -1) {
                sumarNota += nota;
                contadorNotas++;
            }
        } while (nota !=-1);
        scanner.close();

        if (contadorNotas > 0) {
            double promedioNotas = sumarNota / contadorNotas;
            System.out.println("El promedio de las notas ingresadas es: " + promedioNotas);
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}
