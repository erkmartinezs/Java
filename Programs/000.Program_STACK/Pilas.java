package com.mycompany.pilas;
import java.util.Scanner;
public class Pilas {

        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pila p = new Pila();
        int opcionMenu = 0;
        
        do
            {
                System.out.println("\n |-------------------------------------|");
                System.out.println(" |         ° STACK °                   |");
                System.out.println(" |------------------|------------------|");
                System.out.println(" | 1. Insert        | 4. Delete        |");
                System.out.println(" | 2. Search        | 5. Deploy        |");
                System.out.println(" | 3. Modify        | 6. Exit          |");
                System.out.println(" |------------------|------------------|");
                System.out.print(" Chose an option: ");
                opcionMenu = teclado.nextInt();
                switch (opcionMenu)
                {
                    case 1:
                        System.out.println("\n\n PUSH NODE ON STACK \n");
                        p.ingresarNodo();
                        break;
                    case 2:
                        System.out.println("\n\n FIND NODE IN STACK \n");
                        p.buscarNodo();
                        break;
                    case 3:
                        System.out.println("\n\n MODIFY NODE IN STACK \n");
                        p.modificarNodo();
                        break;
                    case 4:
                        System.out.println("\n\n DELETE NODE IN STACK \n");
                        p.eliminarNodo();
                        break;
                    case 5:
                        System.out.println("\n\n DEPLOY NODE STACK \n");
                        p.desplegarPila();
                        break;
                    case 6:
                        System.out.println("\n\n PROGRAM FINISHED... \n");
                        break;
                    default:
                        System.out.println("\n\n INVALID OPTION \n");
                        break;
                }
            }
            while (opcionMenu != 6);
        }
}




      