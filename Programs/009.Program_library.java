package com.mycompany.programa_biblioteca;

import java.util.Scanner;

public class Programa_biblioteca {

    public static final int CODIGO = 0;
    public static final int NOMBRE = 1;
    public static final int AUTOR = 2;
    public static final int MATERIA = 3;
    public static final int PAGINAS = 4;

    public static void main(String[] args) {
        System.out.print("Digite la cantidad de libros a ingresar: ");

        Scanner sc = new Scanner(System.in);

        int cantLibros = sc.nextInt();

        String[][] libros = new String[cantLibros][5];

        System.out.println("");

        for (int iLibro = 0; iLibro <= cantLibros - 1; iLibro++) {
            System.out.print("Digite el codigo del libro: ");
            String codigoLibro = sc.next();
            libros[iLibro][CODIGO] = codigoLibro;
            System.out.print("Digite el nombre del libro: ");
            String nombreLibro = sc.next();
            libros[iLibro][NOMBRE] = nombreLibro;
            System.out.print("Digite el autor del libro: ");
            String autorLibro = sc.next();
            libros[iLibro][AUTOR] = autorLibro;
            System.out.print("Digite la materia del libro: ");
            String materiaLibro = sc.next();
            libros[iLibro][MATERIA] = materiaLibro;
            System.out.print("Digite el numero de paginas del libro: ");
            String paginasLibro = sc.next();
            libros[iLibro][PAGINAS] = paginasLibro;
            System.out.println("\n");

        }

        System.out.println("Libros Ingresados: ");

        for (int iLibro = 0; iLibro <= cantLibros - 1; iLibro++) {
            System.out.println(libros[iLibro][CODIGO] + ", " + libros[iLibro][NOMBRE] + ", "
                    + libros[iLibro][AUTOR] + ", " + libros[iLibro][MATERIA] + ", " + libros[iLibro][PAGINAS]);
        }

        System.out.println("");
        System.out.println("\n |-------------------------------------|");
        System.out.println(" |              ° MENU °               |");
        System.out.println(" |------------------|------------------|");
        System.out.println(" | 1. Actualizar    | 2. Eliminar      |");
        System.out.println(" | 3. Buscar        | 4. Ordenar       |");
        System.out.println(" | 5. Salir         |                  |");
        System.out.println(" |------------------|------------------|");
        System.out.print(" Chose an option: ");
        String opcion = sc.next();
        System.out.println("");

        switch (opcion) {
            case "3":
                
                System.out.println("");
                System.out.println("Introduzca el codigo del libro a buscar: ");
                String campo = sc.next();
                System.out.println("");
            {
                String[] iLibro = null;
                int index = busquedaLineal(iLibro, campo);
            }
            {
                int iLibro = 0;
                imprimir(campo, iLibro);
            }
                         

            case "4":
                System.out.println("");
                System.out.println("\n |-------------------------------------|");
                System.out.println(" |              ° MENU °               |");
                System.out.println(" |------------------|------------------|");
                System.out.println(" | 1. Codigo        | 2. Nombre        |");
                System.out.println(" | 3. Autor         | 4. Materia       |");
                System.out.println(" | 5. No. Paginas   | 6. Exit          |");
                System.out.println(" |------------------|------------------|");
                System.out.print(" Chose an option: ");
                String campo = sc.next();
                System.out.println("");
            switch (campo) {
                case "1":
                    libros = ordenarBurbuja(libros, CODIGO);
                    System.out.println("\nLibros ordenadas por codigo: \n");
                    for (int iLibro = 0; iLibro <= cantLibros - 1; iLibro++) {
                        System.out.println(libros[iLibro][CODIGO] + ", " + libros[iLibro][NOMBRE] + ", " + libros[iLibro][AUTOR]
                                + "; " + ", " + libros[iLibro][MATERIA] + ", " + libros[iLibro][PAGINAS]);
                    }
                    break;
                case "2":
                    libros = ordenarBurbuja(libros, NOMBRE);
                    System.out.println("\nLibros ordenados por codigo: \n");
                    for (int iLibro = 0; iLibro <= cantLibros - 1; iLibro++) {
                        System.out.println(libros[iLibro][CODIGO] + ", " + libros[iLibro][NOMBRE] + ", " + libros[iLibro][AUTOR]
                                + "; " + ", " + libros[iLibro][MATERIA] + ", " + libros[iLibro][PAGINAS]);
                    }
                    break;
                case "3":
                    libros = ordenarBurbuja(libros, AUTOR);
                    System.out.println("\nLibros ordenados por Autor: \n");
                    for (int iLibro = 0; iLibro <= cantLibros - 1; iLibro++) {
                        System.out.println(libros[iLibro][CODIGO] + ", " + libros[iLibro][NOMBRE] + ", " + libros[iLibro][AUTOR]
                                + "; " + ", " + libros[iLibro][MATERIA] + ", " + libros[iLibro][PAGINAS]);
                    }
                    break;
                case "4":
                    libros = ordenarBurbuja(libros, MATERIA);
                    System.out.println("\nLibros ordenados por Materia: \n");
                    for (int iLibro = 0; iLibro <= cantLibros - 1; iLibro++) {
                        System.out.println(libros[iLibro][CODIGO] + ", " + libros[iLibro][NOMBRE] + ", " + libros[iLibro][AUTOR]
                                + "; " + ", " + libros[iLibro][MATERIA] + ", " + libros[iLibro][PAGINAS]);
                    }
                    break;
                case "5":
                    libros = ordenarBurbuja(libros, PAGINAS);
                    System.out.println("\nLibros ordenados por No. Paginas: \n");
                    for (int iLibro = 0; iLibro <= cantLibros - 1; iLibro++) {
                        System.out.println(libros[iLibro][CODIGO] + ", " + libros[iLibro][NOMBRE] + ", " + libros[iLibro][AUTOR]
                                + "; " + ", " + libros[iLibro][MATERIA] + ", " + libros[iLibro][PAGINAS]);
                    }
                    break;
                case "6":
                    System.out.println("\nAdios! \n");
                    break;
                default:
                    break;
            }
break;

            case "5":
                System.out.println("\nAdios! \n");
                break;
            default:
                break;
        }

    }

    public static String[][] ordenarBurbuja(String[][] arreglo, int indiceCampo) {
        String auxiliar[] = new String[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j][indiceCampo].compareTo(arreglo[j + 1][indiceCampo]) > 0) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }

        System.out.println(arreglo);
        return arreglo;
    }

     public static int busquedaLineal(String arr[], String elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index].equals(elementToSearch)) {
                return index;
            }
        }
        return -1;
    }

    public static void imprimir(String elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + "Not Found.");
        } else {
            System.out.println(elementToSearch + "Found at index: " + index);

        }
    }


}
