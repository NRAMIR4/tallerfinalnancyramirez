import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println(" el total de su compra es :  ");
                double totalCompra = scanner.nextDouble();
                scanner.close();
                aplicarUnDescuento(total);
        public static void aplicarUnDescuento (double total) {
            double descuento = 0;
            if (total >= 1000) {
                System.out.println("tiene el 20%  de descuento ");
                descuento = total * (20/100);
            } else if (total >= 500 && total < 1000) {
                System.out.println("tiene el 20%  de descuento ");
                descuento = total * (10/100);
            }else if(total<=500){
                    System.out.println("no le aplica descuento ");
                }
            double totalConDescuento = total - descuento ;
            System.out.println("Total: " + total);
            System.out.println("Descuento: " + descuento);
            System.out.println("Total del descuento: " + totalConDescuento);
    }
}
}



