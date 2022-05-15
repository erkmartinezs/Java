package com.mycompany.registro_empleados;

import java.util.Scanner;

public class Registro_empleados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        String nombre_empleado, codi;
        int tiempo, codigo, tipo;

        //1
        System.out.println("por favor ingrese su codigo \n"
                + "Condiciones  \n"
                + "numeros de 3 digitos exeptuando el 000");
        codi = entrada.next();
        codigo = Integer.parseInt(codi);
        //2
        if (codi.length() == 3 && codigo != 000) {
            System.out.println("El codigo ingresado es:" + codi + "\n"
                    + "**********************************************************");
            //3    
        } else {
            System.out.println("Codigo Errado" + "\n"
                    + "**********************************************************");
            System.exit(0);
        }
        //4
        System.out.println("por favor ingrese su Nombre completo\n"
                + "Condiciones  \n"
                + "Longitud del nombre no mayor a 30 carácteres");
        nombre_empleado = entrada.next();
        //5
        if (nombre_empleado.length() <= 30) {
            System.out.println("El nombre registrado es: " + nombre_empleado + "\n"
                    + "**********************************************************");
            //6
        } else {
            System.out.println("Nombre registrado mayor a 30 caracteres" + "\n"
                    + "**********************************************************");
            System.exit(0);
        }
        //7
        System.out.println("Si usted es de planta seleccione 1 \n"
                + "si es a termino definido seleccione 0");
        tipo = entrada.nextInt();
        //8
        if (tipo >= 0 && tipo <= 1) {
            System.out.println("Tipo de empleado seleccionado: " + tipo + "\n"
                    + "**********************************************************");
            //9    
        } else {
            System.out.println("La informacion ingresada es erronea" + "\n"
                    + "**********************************************************");
            System.exit(0);
        }
        //10
        System.out.println("por favor ingrese su tiempo en la institucion\n"
                + "Condiciones  \n"
                + "Dato numerico mayor a 0 y menor a 600");
        tiempo = entrada.nextInt();
        //11
        if (tiempo >= 1 && tiempo <= 600) {
            System.out.println("Su tiempo en la institución es de: " + tiempo + " Meses \n"
                    + "**********************************************************");
            //12   
        } else {
            System.out.println("La informacion ingresada es erronea" + "\n"
                    + "**********************************************************");
            System.exit(0);
        }
        //13
        System.out.println("Registro Exitoso \n"
                + "Codigo empleado: " + codi + "\n"
                + "Nombre:" + nombre_empleado + "\n"
                + "Tipo empleado: " + tipo + "\n"
                + "Tiempo: " + tiempo + " Meses");

    }
}
