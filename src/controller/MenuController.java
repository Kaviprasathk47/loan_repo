package controller;

import ErrorHandlers.AuthError;
import ErrorHandlers.InvalidAmount;
import model.User;
import util.InputReader;
import menu.Menu;

public class MenuController {
    public void start() throws AuthError, InvalidAmount {
        UserDetailsController userDetailsController = new UserDetailsController();
        while (true) {
            System.out.println();
            Menu.print_the_menu();
            System.out.println("Enter the Choice");
            int choice = InputReader.in.nextInt();
            if (choice == 1) {
                System.out.println();
                System.out.println("Enter the Account Number:");
                long accountNumber = InputReader.in.nextLong();
                System.out.println("Enter the Amount:");
                int amount = InputReader.in.nextInt();
                System.out.println("Enter the  password:");
                String password = InputReader.in.next();
                System.out.println("Enter the Name:");
                String name = InputReader.in.next();
                System.out.println("Enter the Type Account:");
                String type = InputReader.in.next();
                System.out.println(userDetailsController.insertNewUser(accountNumber, password, amount, name, type));
            } else if (choice == 2) {
                System.out.println("Enter the Account Number:");
                long accountNumber = InputReader.in.nextLong();
                System.out.println("Enter the  password:");
                String password = InputReader.in.next();
                while(true){
                    Menu.print_user_Account_details();
                    System.out.println("Enter the Option:");
                    int option = InputReader.in.nextInt();
                    if (option == 1) {
                        System.out.println();
                        System.out.print(userDetailsController.checkBalance(accountNumber,password));
                    } else if (option == 2) {
                        System.out.println();
                        System.out.print("Enter the Amount:");
                        int amount = InputReader.in.nextInt();
                        userDetailsController.updateAmount(accountNumber,password,amount,option);
                    } else if (option == 3) {
                        System.out.println();
                        System.out.print("Enter the Amount:");
                        int amount = InputReader.in.nextInt();
                        userDetailsController.updateAmount(accountNumber,password,amount,option);
                    } else if (option == 4) {
                        System.out.print("Is currently Unavailable try Again later");
                    }
                    else{
                        break;
                    }
                }
            } else if (choice == 3) {
                System.out.print("Is currently Unavailable try Again later");
            } else if (choice == 4) {
                System.out.print("Is currently Unavailable try Again later");
            } else {
                System.out.println("Exited...");
                break;
            }
        }
    }
}
