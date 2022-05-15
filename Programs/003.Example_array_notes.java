/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarreglosnotas;

import java.util.Scanner;

/**
 *
 * @author JANOR
 */
public class Ejemploarreglosnotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nombreAlumnos = new String[2];
        int[] notasUno = new int[2];
        int[] notasDos = new int[2];
        int[] notasTres = new int[2];
        double[] notasFinales = new double[2];
        boolean finalizar = true;
        for(int iAlumno = 0; iAlumno <= nombreAlumnos.length - 1; iAlumno++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite el nombre: ");
            String nombre = sc.nextLine();
            nombreAlumnos[iAlumno] = nombre;
            System.out.print("Digite primera nota: ");
            int notaUno = sc.nextInt();
            if(notaUno >= 0 && notaUno <= 5){
                notasUno[iAlumno] = notaUno;
                System.out.print("Digite segunda nota: ");
                int notaDos = sc.nextInt();
                if(notaDos >= 0 && notaDos <= 5){
                    notasDos[iAlumno] = notaDos;
                    System.out.print("Digite tercera nota: ");
                    int notaTres = sc.nextInt();
                    if(notaTres >= 0 && notaTres <= 5){
                        notasTres[iAlumno] = notaTres;
                    }else{
                        System.out.print("La tercera nota debe estar entre 0 y 5.");
                        finalizar = false;
                    }
                }else{
                    System.out.print("La segunda nota debe estar entre 0 y 5.");
                    finalizar = false;
                }
            }else{
                System.out.print("La primera nota debe estar entre 0 y 5.");
                finalizar = false;
            }
            
            System.out.println("");
        }
        
        if(finalizar){
            for(int iAlumno = 0; iAlumno <= nombreAlumnos.length - 1; iAlumno++){
                notasFinales[iAlumno] = (notasUno[iAlumno] * 20) / 100 + (notasDos[iAlumno] * 20)/100 + (notasTres[iAlumno] * 60) / 100;
            }
        
            for(int iAlumno = 0; iAlumno <= nombreAlumnos.length - 1; iAlumno++){
                System.out.println("El alumno " + nombreAlumnos[iAlumno] + " tiene la nota final: " + notasFinales[iAlumno]);
            }
        }
    }
}
