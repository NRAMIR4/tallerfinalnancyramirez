public class Ejericio4 {

    public static void main(String[] args) {
        sumarNumerosPares();
    }

    public static void sumarNumerosPares() {
        int sumar = 0;
        for (int i = 2; i <= 100; i += 2) {
            sumar += i;
        }
        System.out.println("La suma  numeros pares son: " + sumar);
    }
}
