/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uts.pilas;

import java.util.Scanner;

/**
 *
 * @author killu
 */
public class Pilas {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        
        do
        {
            System.out.println("MENU PILAS");
            
            System.out.println("1. Tamano de pila");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Imprimir pila");
            System.out.println("5. Salir");
            
            System.out.print("Seleccione la opcion: ");
            op = sc.nextInt();
            
            System.out.println("");
            
            Opciones(op, sc);
            
            sc.nextLine();
            System.out.print("\n\nPRESIONE ENTER PARA CONTINUAR...");
            sc.nextLine();
        }while ( op != 5 );
        
        sc.close();
    }
    static void Opciones(int op, Scanner sc)
    {
        switch (op) 
        {
            case 1:
                System.out.print("En proceso..");
                break; 
            case 2:
                System.out.print("En proceso..");
                break;
            case 3:
                System.out.print("En proceso..");
                break;
            case 4:
                System.out.print("En proceso..");
                break;
            case 5:
                System.out.println("Saliendo..");
                break;
            default:
                System.out.println("Opcion no valida. Por favor, seleccione una de las opciones del menu.");
        }
    }
}
