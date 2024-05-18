package Behavioral.ChainofResponsibility;

public class HTTPRequest {
    private String username;
    private String password;

    public HTTPRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
