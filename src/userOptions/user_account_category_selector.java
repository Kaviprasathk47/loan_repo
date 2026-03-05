package userOptions;
import ErrorHandlers.AuthError;
import ErrorHandlers.InvalidAmount;
import authentication.UserAuthentication;
import Services.BankServices;
import menu.Menu;
public class user_account_category_selector{
        public  void user_selection(int option) throws AuthError,InvalidAmount {
            if(option==1 || option == 2 || option==3 || option==4) {
                UserAuthentication auth = new UserAuthentication();
                if(auth.authenticate()){
                    BankServices services = new BankServices();
                    if(option == 1){
                            System.out.print("The Balance Amount is :"+ services.checkBalance());
                    }
                    else if(option == 2){
                            services.deposit();
                    }
                    else if(option == 3){
                            services.debit();
                    }
                }
            }
            else {
                System.out.println("Thank You for reaching us..");
            }

        }
    }
