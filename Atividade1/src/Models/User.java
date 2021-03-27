package Models;

public class User extends Account{

    private String name;
    private int password;
    private String email;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void createUser(String name, int password, String email, int account_id, int balance){

        this.setName(name);
        this.setPassword(password);
        this.setEmail(email);
        this.setAccount_id(account_id);
        this.setBalance(balance);

    }



}
