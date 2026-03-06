package app;
import menu.Menu;
import userOptions.user_account_category_selector;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while(true) {
            System.out.println();
            Menu.print_the_menu();
            System.out.print("Enter the choice:");
            int choice = Main.in.nextInt();
            if (choice == 1) {
                Menu.print_new_account_details();
            } else if (choice == 2) {
                Menu.print_user_Account_details();
                System.out.print("Enter the Option");
                int option = in.nextInt();
                user_account_category_selector userOption = new user_account_category_selector();
                userOption.user_selection(option);
            } else {
                System.out.print("Thanks For reaching Us....");
                break;
            }
        }
    }
}
