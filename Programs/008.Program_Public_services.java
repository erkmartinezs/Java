package com.mycompany.programa_servicios_publicos;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author erk
 */
public class Programa_Servicios_publicos {



    public static void main(String[] args) {
        Programa_Servicios_publicos pila = new Programa_Servicios_publicos();
        Scanner teclado = new Scanner(System.in);
        int cantidadFamilias = 0;
        System.out.println("Ingrese la cantidad de familias a ingresar:");
        cantidadFamilias = Integer.parseInt(teclado.nextLine());
        String[] estrato = new String[cantidadFamilias];
        String[] agua = new String[cantidadFamilias];
        String[] luz = new String[cantidadFamilias];
        String[] gas = new String[cantidadFamilias];
        
        for (int i = 0; i < cantidadFamilias; i++) {
            System.out.println("ingrese el Estrato de la Familia No." + i);
            estrato[i] = teclado.nextLine();
            System.out.println("ingrese el valor Servicio Agua de la familia No." + i);
            agua[i] = teclado.nextLine();
            System.out.println("ingrese el valor Servicio Luz de la familia No." + i);
            luz[i] = teclado.nextLine();
            System.out.println("ingrese el valor Servicio Gas de la familia No." + i);
            gas[i] = teclado.nextLine();

        }
        System.out.println("Resumen de servicios publicos: ");
        for (int j = 0; j < estrato.length; j++) {
            System.out.println("Familia " + j + "\n"
                    + "Estrato: " + estrato[j] +"\n"
                    + "Valor Agua: " + agua[j] + "\n"
                    + "Valor Luz: " + agua[j] + "\n"
                    + "Valor Gas: " + agua[j] + "\n");

        }

    }
}



