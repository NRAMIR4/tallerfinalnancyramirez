import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la tabla de multiplicar:");
        int numeroTabla = scanner.nextInt();
        scanner.close();
        imprimirTablaMultiplicar(numeroTabla);
    }

    public static void imprimirTablaMultiplicar(int numeroTabla) {
        int contador = 1;
        while (contador <= 20) {
            int resultado = numeroTabla * contador;
            System.out.println("tabla  del " + numeroTabla + " x " + contador + " = " + resultado);
            contador = contador + 1;
        }
    }
}
