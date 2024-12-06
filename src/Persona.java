public class Persona {

    private String nombre;
    private int edad;
    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void imprimirDatos() {
        System.out.println("El nombre  es :  " + nombre);
        System.out.println("La edad  es :  " + edad);
        System.out.println("La altura es :  " + altura);
    }

public static void main(String[] args) {

    Persona persona = new Persona("diana", 40, 1.69);

    System.out.println("Datos de la persona:");
    persona.imprimirDatos();
}
}
