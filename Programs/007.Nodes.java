package com.mycompany.ejemplo_pila;
import java.util.Scanner;
/**
 *
 * @author erk
 */
public class ejercicio_3 {
    
    public void ingresarNodo(){
      nodo nuevo = new nodo (); 
      System.out.print("Enter the data to be stored in the new node: ");
      nuevo.dato = teclado.nextInt();
      
      nuevo.siguiente = primero;
      primero =  nuevo;
      System.out.println("\n Node entered successfully \n");
    }  
    
    
    public void buscarNodo(){
        nodo actual = new nodo();
        actual = primero;
        boolean encontrado = false;
        
        System.out.print("Enter the node to search: ");
        int nodoBuscado = teclado.nextInt();
        if (primero != null){
            while(actual != null && encontrado != true){
                if (actual.dato  == nodoBuscado){
                    System.out.println("\n Node with data " + nodoBuscado + " found. \n");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado){
                System.out.println("\n Node not found in stack\n");
            }
        }else{
            System.out.println("\n The stack is empty \n");
        }
    }
    
    
    public void modificarNodo(){
        nodo actual = new nodo();
        actual = primero;
        boolean encontrado = false;
        
        System.out.print("Enter the node to search for to modify: ");
        int nodoBuscado = teclado.nextInt();
        if (primero != null){
            while(actual != null && encontrado != true){
                if (actual.dato  == nodoBuscado){
                    System.out.println("\n Node with data " + nodoBuscado + " found. \n");
                    System.out.println("Insert new data for the node");
                    actual.dato = teclado.nextInt();
                    System.out.println("\n Modified node \n");
                    encontrado = true;
                }
                actual = actual.siguiente;
            }
            if (!encontrado){
                System.out.println("\n Node not found in stack\n");
            }
        }else{
            System.out.println("\n The stack is empty \n");
        }
        
    }
    
    
    public void eliminarNodo(){
        nodo actual = new nodo();
        actual = primero;
        nodo anterior = new nodo();
        anterior = null;
        boolean encontrado = false;
        System.out.print("Enter the node to delete: ");
        int nodoBuscado = teclado.nextInt();
        if (primero != null){
            while(actual != null && encontrado != true){
                if (actual.dato  == nodoBuscado){
                    if (actual == primero){
                        primero = primero.siguiente;
                    }else{
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("\n Node with data " + actual.dato + " removed. \n");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if (!encontrado){
                System.out.println("\n Node not found in stack\n");
            }
        }else{
            System.out.println("\n The stack is empty \n");
        }        
    }
    
    
    int tope = -1, maximo, npar = 0, nimpar = 0;
    public void generar(int cantidadElementos, int totalPila, int[] vectorElementos){
        maximo = totalPila;
        for (int i =0; i< cantidadElementos; i++){
            tope++;
            vectorElementos[tope] = (int) Math.floor(Math.random()*100);
            if (vectorElementos[tope] % 2 == 0) {
                npar++;
            }else{
                nimpar++;
            }
        }
    }   
    
    public void imprimir (int[] vectorImpresion){
        System.out.println("Elementos que estan en la pila");
        for (int i =0; i < tope; i++){
            System.out.println("Posicion: " + i + " con valor: " + vectorImpresion[i]);
        }
    System.out.println("El tope de la pila es " + tope + "\n"
        + "El maximo de la pila es " + maximo);
    }
    
    public void mostrar(){
        System.out.println("El numero de elementos pares son: " + npar);   
        System.out.println("El numero de elementos impares son: " + nimpar);
    }        

    public static void main(String[] args) {
        Ejemplo_pila pila1 = new Ejemplo_pila();
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int maximoVector = teclado.nextInt();
        System.out.println("ingrese la cantidad de elementos a registrar");
        int cantElementos = teclado.nextInt();
        if (cantElementos <= maximoVector){
            int[] vector = new int[maximoVector];
            pila1.generar(cantElementos, maximoVector, vector);
            pila1.imprimir(vector);
            pila1.mostrar();
        }else{
            System.out.println("el vector no puede ser menor que la cantidad"
                + "de elementos a guardar");
        }
        
    }

    
}


