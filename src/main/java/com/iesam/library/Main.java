package com.iesam.library;

import com.iesam.library.features.user.presentation.UserPresentation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int choice;
        do {
            System.out.println("\n/---------Menu Principal--------/");
            System.out.println("1. Ir a Menu de Usuario");
            System.out.println("2. Salir");
            System.out.println("/--------------------------------/");
            System.out.print("> Ingrese su elección: ");
            Scanner sc = new Scanner(System.in);
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    UserPresentation UserMenu  = new UserPresentation(sc);
                    UserMenu.displayUserMenu();
                    break;
                case 2:
                    System.out.println("<Info> Cerrando Programa...");
                    System.out.println("Que tenga una buena lectura.");
                    break;
                default:
                    System.err.println("<!> Opción no valida. Vuelva a intentarlo");
            }
        } while (choice !=2);


    }
}