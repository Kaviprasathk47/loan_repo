package ErrorHandlers;

public class AuthError extends Exception {
    public AuthError(String message){
        super(message);
    }
}

