/**
 * Representa un producto que puede añadirse al carrito de compras.
 */

public class Item {

    private String nombre;
    private double precio;

    private static final double PRECIO_MIN = 0;
    private static final double PRECIO_MAX = 10000;

    /**
     * Constructor del item
     */
    public Item(String nombre, double precio) {

        if (precio < PRECIO_MIN || precio > PRECIO_MAX) {
            throw new IllegalArgumentException("Precio fuera de rango");
        }

        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio < PRECIO_MIN || precio > PRECIO_MAX) {
            throw new IllegalArgumentException("Precio fuera de rango");
        }

        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - €" + precio;
    }
}