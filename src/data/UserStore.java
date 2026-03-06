package data;
import model.User;
import model.Account;
import java.util.HashMap;
import java.util.Map;
public class UserStore {
    private final Map<Long,User> users = new HashMap<>();
    public UserStore(){
        users.put(345212123L,
                new User(
                        345212123L,
                        "firstAccount",
                        "FirstUser",
                        new Account(1000,"Savings")
                ));
        users.put(3455412123L,
                new User(
                        3455412123L,
                        "secondAccount",
                        "SecondUser",
                        new Account(45000,"Savings")
                ));
    }
    public boolean addUserData(long accountNumber,String password,String name,int amount,String type){
        if(users.containsKey(accountNumber)) return false;
        users.put(accountNumber,new User(
                accountNumber,
                password,
                name,
                new Account(amount,type)
        ));
        return true;
    }
    public User getUsers(long accountNumber){
        return users.get(accountNumber);
    }
}