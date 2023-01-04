package OBC.Funciones;

/**
 * Esta clase contiene una funcion
 * La funcion recibe dos parametros, el precio y IVA del producto
 * Imprime por pantalla el precio con IVA de cada producto
 */
public class FunMain {
    public static void main(String[] args) {

        double narajas = funPrecio(89.2,7.2);
        System.out.println("El precio de las naranjas es: "+narajas);
        double manzanas = funPrecio(78.2,8.2);
        System.out.println("El precio de las manzanas es: "+manzanas);
    }

     static double funPrecio(double precio, double iva) {
        return iva + precio;
    }
}