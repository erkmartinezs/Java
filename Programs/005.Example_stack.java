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

}
