package com.mycompany.ejemplo_pila;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author erk
 */
public class Ejemplo_pila {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ejemplo_pila pila1 = new Ejemplo_pila();
        int opcionMenu = 0;

        do {
            System.out.println("\n |------------------|");
            System.out.println(" |     ° STACK °    |");
            System.out.println(" |------------------|");
            System.out.println(" | 1. Run           |");
            System.out.println(" | 2. Insert        |");
            System.out.println(" | 3. Search        |");
            System.out.println(" | 4. Modify        |");
            System.out.println(" | 5. Delete        |");
            System.out.println(" | 6. Exit          |");
            System.out.println(" |------------------|");
            System.out.print(" Chose an option: ");
            opcionMenu = teclado.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n\n RUN \n");
                    System.out.println("ingrese el tamaño del vector");
                    int maximoVector = teclado.nextInt();
                    System.out.println("ingrese la cantidad de elementos a registrar");
                    int cantElementos = teclado.nextInt();
                    if (cantElementos <= maximoVector) {
                        int[] vector = new int[maximoVector];
                        pila1.generar(cantElementos, maximoVector, vector);
                        pila1.imprimir(vector);
                        pila1.mostrar();
                    } else {
                        System.out.println("el vector no puede ser menor que la cantidad"
                                + "de elementos a guardar");
                    }
                    break;
                case 2:
                    System.out.println("\n\n PUSH NODE ON STACK \n");
                    //p.ingresarNodo();
                    break;
                case 3:
                    System.out.println("\n\n FIND NODE IN STACK \n");
                        pila1.imprimir(vector);
                        pila1.mostrar();
                        pila1.existeEnArreglo();
                    break;
                case 4:
                    System.out.println("\n\n MODIFY NODE IN STACK \n");
                    //p.modificarNodo();
                    break;
                case 5:
                    System.out.println("\n\n DELETE NODE IN STACK \n");
                    //p.eliminarNodo();
                    break;
                case 6:
                    System.out.println("\n\n PROGRAM FINISHED... \n");
                    break;
                default:
                    System.out.println("\n\n INVALID OPTION \n");
                    break;
            }
        } while (opcionMenu != 6);

    }

    int tope = -1, maximo, npar = 0, nimpar = 0;

    public void generar(int cantidadElementos, int totalPila, int[] vectorElementos) {
        maximo = totalPila;
        for (int i = 0; i < cantidadElementos; i++) {
            tope++;
            vectorElementos[tope] = (int) Math.floor(Math.random() * 100);
            if (vectorElementos[tope] % 2 == 0) {
                npar++;
            } else {
                nimpar++;
            }
        }
    }

    public void imprimir(int[] vectorImpresion) {
        System.out.println("Elementos que estan en la pila");
        for (int i = 0; i < tope; i++) {
            System.out.println("Posicion: " + i + " con valor: " + vectorImpresion[i]);
        }
        System.out.println("El tope de la pila es " + tope + "\n"
                + "El maximo de la pila es " + maximo);
    }

    public void mostrar() {
        System.out.println("El numero de elementos pares son: " + npar);
        System.out.println("El numero de elementos impares son: " + nimpar);
    }

    public static int existeEnArreglo(int[] arreglo, int busqueda) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == busqueda) {
                return i;
            }
        }
        return -1;
    }

}
