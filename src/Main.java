
public class Main {
    public static void main(String[] args) {
        double precio = 220.20;

        System.out.println(calcularPrecioConIva(precio));
    }
    private static double calcularPrecioConIva(double precio) {
        return precio + (precio * 12 / 100);
    }
}