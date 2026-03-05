package menu;
import java.util.ArrayList;
import java.util.List;
public class Menu {
    public static void print_the_menu(){
        List<String> items = new ArrayList<>();
        items.add("Create New Account");
        items.add("About your Account");
        items.add("Loan Details");
        items.add("EMI Details");
        items.add("Exit..");
        int index = 1;
        for(String item : items){
            System.out.println(index++ + ". " + item);
        }
    }
    public static void print_new_account_details(){
        List<String> required_details = new ArrayList<>();
        required_details.add("PAN Card");
        required_details.add("Aadhaar Card");
        required_details.add("Photo Card");
        required_details.add("Cell_Phone Card");
        required_details.add("Exit...");
        int index = 1;
        for(String str:required_details){
            System.out.println(index++ +" "+str);
        }
    }
    public static  void print_user_Account_details(){
        List<String> choices = new ArrayList<>();
        choices.add("Check Balance");
        choices.add("Deposit or Credit");
        choices.add("Debit");
        choices.add("Change_password");
        choices.add("Exit...");
        int index = 1;
        for(String str:choices){
            System.out.println(index++ +" "+str);
        }
    }

}
