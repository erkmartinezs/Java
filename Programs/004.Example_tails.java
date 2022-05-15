package com.mycompany.ejemplo_colas;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author erk
 */
public class Ejemplo_colas {

    public static void main(String[] args) {
        Ejemplo_colas cl = new Ejemplo_colas();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Igrese el tamano del vector");
        int maximoVector = teclado.nextInt();
        System.out.println("Ingrese la cantidad de elementos a registrar");
        int cantElementos = teclado.nextInt();
        if (cantElementos <= maximoVector) {
            int[] vector = new int[maximoVector];
            int base = (int) Math.floor(Math.random() * maximoVector);
            int tope = base;

            cl.generar(cantElementos, maximoVector, base, tope, vector);
            System.out.println("Maximos elementos de la cola " + maximoVector);
            System.out.println("No elementos de la cola " + cantElementos);
            System.out.println("<---- Elementos de la cola ---->");
            cl.imprimir(cantElementos, maximoVector, base, tope, vector);
            System.out.println("Base de la cola " + base);
            System.out.println("El Promedio de la cola es " + cl.prom);
        } else {
            System.out.println("El Maximo no puede ser menor al No Elementos");
        }
    }

    /**
     *
     * @author erk
     */
    public float prom = 0, suma = 0;

    public void generar(int cantidadElementos, int totalCola, int baseCola, int topeCola, int[] vectorElementos) {
        int cont = 0;

        while (cont < cantidadElementos) {
            topeCola++;
            if (topeCola > totalCola - 1) {
                topeCola = 0;
            }
            cont++;
            vectorElementos[topeCola] = (int) Math.floor(Math.random() * 100);
            suma = suma + vectorElementos[topeCola];
        }
        prom = suma / cantidadElementos;
    }

    /**
     *
     * @author erk
     */
    public void imprimir(int cantidadElementos, int totalCola, int baseCola, int topeCola, int[]vectorElementos) {
        int cont = 0, elemento = baseCola;

        while (cont < cantidadElementos) {
            elemento++;
            if (elemento > totalCola - 1) {
                elemento = 0;
            }
            cont++;
            System.out.println("Elemento: " + vectorElementos[elemento] + " Posicion: " + elemento);
        }
        System.out.println("Tope de la cola " + elemento);

    }
}
