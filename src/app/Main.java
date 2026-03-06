package app;
import java.util.Scanner;
import controller.MenuController;


public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        MenuController menuController = new MenuController();
        menuController.start();
    }
}
