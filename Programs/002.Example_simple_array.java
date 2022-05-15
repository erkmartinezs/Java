package com.mycompany.ejemplo_arreglo_simple;
import java.util.Scanner;
/**
 *
 * @author erk
 */
public class Ejemplo_arreglo_simple {

    public static void main(String[] args) {
        //instanciar paquete scanner
        Scanner teclado = new Scanner(System.in);
        // Declarar variable de tipo entero
        int cantidadMaterias = 0;
        System.out.println("Ingrese la cantidad de materias a ingresar:");
        // Se garda la cantidad de materias en la variable
        cantidadMaterias = Integer.parseInt(teclado.nextLine());
        // Se crea el venctor dimensionandolo por la cantidad ingresada
        String[] listadoMateria = new String[cantidadMaterias];
        // se utiliza un ciclo FOR para edor el nombre de cada materia 
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.println("ingrese el nombre de la materia No." + i);
            //Se le asigna el valor del texto a cada posicion del vector 
            listadoMateria[i] = teclado.nextLine();
        }
        System.out.println("Este es el listado de materias: ");
        // se imprime el vector utilizando un FOR
        for (int j = 0; j < listadoMateria.length; j++){
            System.out.println("materia No. " + j + " es: " + listadoMateria[j]);
        }

    }
}
