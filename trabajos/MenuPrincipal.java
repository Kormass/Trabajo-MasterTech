/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajos;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MenuPrincipal {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 6) {
            mostrarMenu();
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    computadores();
                break;
                case 2:
                    celulares();
                break;
                case 3:
                    electrodomesticos();
                break;
                case 4:
                    tv();
                break;
                case 5:
                    accesorios();
                break;
                case 6:
                    Videojuegos();
                break;
                default:
                    System.out.println("Elije una opcion correcta");
                break;
            }
        }
    }

    void mostrarMenu() {
        System.out.println("----Bienvenido al Menu----");
        System.out.println("1. Computadores");
        System.out.println("2. Celulares");
        System.out.println("3. Electrodomesticos");
        System.out.println("4. TV");
        System.out.println("5. Accesorios");
        System.out.println("6. Videojuegos");
        System.out.println("7. Audio y video");
        System.out.println("8. Salir");

    }
    
    private void computadores() {
        System.out.println("Ha elegido la opción 1 (Computadores)");
    }

    private void celulares() {
        System.out.println("Ha elegido la opción 2 (Computadores)");
    }

    private void electrodomesticos() {
        System.out.println("Ha elegido la opción 3 (Celulares)");
    }

    private void tv() {
        System.out.println("Ha elegido la opción 4 (Modificar película)");
    }
    
    private void accesorios() {
        System.out.println("Ha elegido la opción 5 (Eliminar película)");
    }
    
    private void Videojuegos() {
        System.out.println("Ha elegido la opción 5 (Eliminar película)");
    }
    
    private void audiovideo() {
        System.out.println("Ha elegido la opción 5 (Eliminar película)");
    }
}
