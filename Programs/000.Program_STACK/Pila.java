package com.mycompany.pilas;
import java.util.Scanner;
/**
 *
 * @author erk
 */
public class Pila {
    Scanner teclado = new Scanner(System.in);
    nodo primero;
    
    public Pila(){
        primero = null;
    }
    

    
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
    
    public void desplegarPila(){
        nodo actual = new nodo();
        actual = primero;
        if (primero != null){
            while(actual != null){
                System.out.println(" " + actual.dato);
                actual = actual.siguiente;
            }
        }else{
            System.out.println("\n The stack is empty  \n");
        }
    }
}

    