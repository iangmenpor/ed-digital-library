package com.iesam.library.features.user.presentation;

import com.iesam.library.features.user.data.UserDataRepository;
import com.iesam.library.features.user.domain.SaveUserUseCase;
import com.iesam.library.features.user.domain.User;

import java.util.Scanner;

public class UserPresentation {

    private static Scanner sc;

    public UserPresentation(Scanner sc){
        this.sc=sc;
    }

    public void displayUsermenu() {
        int choice;
        do {
            System.out.println("\n+--------Menú de Usuario--------+");
            System.out.println("1. Crear usuario");
            System.out.println("2. Volver a menú principal");
            System.out.println("+--------------------------------+");
            System.out.print("> Ingrese su elección: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea después del entero

            switch (choice) {
                case 1:
                    saveUser();
                    break;
                case 2:
                    System.out.println("<Info> Volviendo a menu principal...");
                    break;
                default:
                    System.err.println("<!> Opción no valida. Vuelva a intentarlo");
            }
        } while (choice != 2);
    }

    private static void saveUser() {
        SaveUserUseCase saveUserUseCase = new SaveUserUseCase(new UserDataRepository());
        int id;
        String dni, name, surname;
        System.out.print("-> Introduce un código de identificación (id): ");
        id = sc.nextInt();
        sc.nextLine(); //Consumo
        System.out.print("-> Introduce el DNI: ");
        dni = sc.nextLine();
        System.out.print("-> Introduce el Nombre: ");
        name = sc.nextLine();
        System.out.print("-> Introduce el Apellido: ");
        surname = sc.nextLine();
        User newUser = new User (id,dni,name,surname);
        saveUserUseCase.execute(newUser);
        System.out.println("<Info> Se ha guardado el usuario "+ newUser.toString());

        sc.nextLine(); //Consumir nueva linea
    }
}