
public class Ejercicio3 {

    public static void main(String[] args) {
        operacionesBasicas();
    }
    public static void operacionesBasicas() {
        double variablea = 12.2;
        double variableb = 4.33;
        double variablec = 5.5;

        try {
            double suma = variablea + variableb + variablec;
            double resta = variablea - variableb - variablec;
            double multiplicacion = variablea * variableb * variablec;
            double division = variablea + variableb / variablec;

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}

