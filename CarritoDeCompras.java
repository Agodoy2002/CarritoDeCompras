/**
 * Representa un carrito de compras que contiene una lista de items.
 * Permite agregar productos, eliminarlos y calcular el total.
 */

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    private List<Item> items;

    private static final String MONEDA = "€";
    private static final String CABECERA = "Detalles del carrito:";

    public CarritoDeCompras() {
        items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void removerItem(Item item) {

        if (!items.remove(item)) {
            throw new IllegalArgumentException("El item no existe en el carrito");
        }

    }

    /**
     * Calcula el precio total de todos los productos del carrito.
     * @return total de la compra
     */
    public double calcularTotal() {

        double total = 0;

        for (Item item : items) {
            total += item.getPrecio();
        }

        return total;
    }

    public void imprimirDetalle() {

        System.out.println(CABECERA);

        for (Item item : items) {
            System.out.println(item);
        }

        System.out.println("Total: " + MONEDA + calcularTotal());
    }