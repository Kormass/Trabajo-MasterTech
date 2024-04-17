/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    private List<Producto> inventario;
    private List<String> categorias;

    public Inventario() {
        inventario = new ArrayList<>();
        categorias = new ArrayList<>();
        inicializarCategorias();
    }

    private void inicializarCategorias() {
        categorias.add("Computadores");
        categorias.add("Celulares");
        categorias.add("Electrodomésticos");
        categorias.add("TV");
        categorias.add("Accesorios");
        categorias.add("Videojuegos");
        categorias.add("Audio y video");
    }

    public void mostrarInventario() {
        System.out.println("\n--- Inventario ---");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

    public void agregarProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el número de referencia del producto: ");
        int referencia = scanner.nextInt();

        scanner.nextLine();
        
        System.out.print("Ingrese la cantidad disponible del producto: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("\n--- Categorías ---\n");
        System.out.print("0. Computadores\n");
        System.out.print("1. Celulares\n");
        System.out.print("2. Electrodomésticos\n");
        System.out.print("3. TV\n");
        System.out.print("4. Accesorios\n");
        System.out.print("5. Videojuegos\n");
        System.out.print("6. Audio y video\n\n");
                                        
        System.out.print("Ingrese la categoría del producto (número: ): ");
        int categoria = scanner.nextInt();

        Producto producto = new Producto(nombre, precio, referencia, cantidad, categorias.get(categoria));
        agregarProducto(producto);
    }

    public void agregarProducto(Producto producto) {
        if (existeReferencia(producto.getReferencia())) {
            System.out.println("Error: Ya existe un producto con el mismo número de referencia.");
        } else if (categoriaNoExiste(producto.getCategoria())) {
            System.out.println("Error: La categoría especificada no existe.");
        } else {
            inventario.add(producto);
            System.out.println("Producto agregado con éxito.");
        }
    }

    private boolean existeReferencia(int referencia) {
        for (Producto producto : inventario) {
            if (producto.getReferencia() == referencia) {
                return true;
            }
        }
        return false;
    }

    private boolean categoriaNoExiste(String categoria) {
        return !categorias.contains(categoria);
    }

    public void eliminarProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de referencia del producto a eliminar: ");
        int referencia = scanner.nextInt();

        if (existeReferencia(referencia)) {
            eliminarProductoPorReferencia(referencia);
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("Error: No existe un producto con el número de referencia especificado.");
        }
    }

    private void eliminarProductoPorReferencia(int referencia) {
        Producto productoAEliminar = null;
        for (Producto producto : inventario) {
            if (producto.getReferencia() == referencia) {
                productoAEliminar = producto;
                break;
            }
        }
        inventario.remove(productoAEliminar);
    }

    public void mostrarCategorias() {
        System.out.println("\n--- Categorías ---");
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println(i + ". " + categorias.get(i));
        }
    }

    public void agregarCategoria() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la nueva categoría: ");
        String nuevaCategoria = scanner.nextLine();

        if (categorias.contains(nuevaCategoria)) {
            System.out.println("Error: La categoría ya existe.");
        } else {
            categorias.add(nuevaCategoria);
            System.out.println("Categoría agregada con éxito.");
        }
    }

    public void eliminarCategoria() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de la categoría a eliminar: ");
        int numeroCategoria = scanner.nextInt();

        if (numeroCategoria >= 0 && numeroCategoria < categorias.size()) {
            categorias.remove(numeroCategoria);
            System.out.println("Categoría eliminada con éxito.");
        } else {
            System.out.println("Error: No existe una categoría con el número especificado.");
        }
    }
}
