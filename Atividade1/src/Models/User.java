package Models;

public class User extends Account{

    // This is the class that sustains an user account, it inhereit the properties and attributes from the Account class

    private String name;
    private int password;
    private String email;



    // Attributes encapsulation

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

        //This function sets the user attributes

        this.setName(name);
        this.setPassword(password);
        this.setEmail(email);
        this.setAccountId(account_id);
        this.setBalance(balance);

    }

    public void showProfile(){

        //This function shows the account profile as required by the exercise

        System.out.println("#######################################################");
        System.out.println("#                   ACCOUNT PROFILE                   #");
        System.out.println("#                                                     #");
        System.out.println("#   ACCOUNT ID:  "+this.getAccountId());
        System.out.println("#   USER:  "+this.name);
        System.out.println("#   EMAIL:  "+this.email);
        System.out.println("#   BALANCE:  "+this.getBalance());
        System.out.println("#                                                     #");
        System.out.println("#######################################################");

    }



}
