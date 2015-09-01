package pl.wykop.client.client.model;

public class AuthData {
    private String login;
    private char[] password;

    public AuthData() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
