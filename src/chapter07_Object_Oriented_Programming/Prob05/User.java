package chapter07_Object_Oriented_Programming.Prob05;

public class User {
    private int userID;
    private String details;
    private int accountType;

    public User(int userID, String details, int accountType) {
        this.userID = userID;
        this.details = details;
        this.accountType = accountType;
    }

    public void renewMembership() {}

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }
}
