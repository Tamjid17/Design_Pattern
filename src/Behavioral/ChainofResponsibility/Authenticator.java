package Behavioral.ChainofResponsibility;

public class Authenticator {
    public boolean authenticate(HTTPRequest request){
        var isValid = (request.getUsername() == "admin" && request.getPassword() == "1234");
        System.out.println("Authentication");
        return isValid;
    }
}
