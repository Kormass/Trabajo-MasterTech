/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Producto {
    private String nombre;
    private double precio;
    private int referencia;
    private int cantidad;
    private String categoria;

    public Producto(String nombre, double precio, int referencia, int cantidad, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getReferencia() {
        return referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: $" + precio + ", Referencia: " + referencia + ", Cantidad: " + cantidad;
    }
}
