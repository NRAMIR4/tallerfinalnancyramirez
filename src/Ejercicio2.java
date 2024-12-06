
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int opcion = scanner.nextInt();
        scanner.close();

        identificarTipoCuenta(opcion);
    }

    public static void identificarTipoCuenta(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Cuenta Corriente");
                break;
            case 2:
                System.out.println("Cuenta de Ahorro");
                break;
            case 3:
                System.out.println("Cuenta Nomina");
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}

