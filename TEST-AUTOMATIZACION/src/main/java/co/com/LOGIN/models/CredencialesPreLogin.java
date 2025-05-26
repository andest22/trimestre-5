package co.com.LOGIN.models;

public class CredencialesPreLogin {

    private String name;

    private String email;


    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public CredencialesPreLogin(String Name, String email ) {
        this.name = Name;
        this.email = email;
    }
}
