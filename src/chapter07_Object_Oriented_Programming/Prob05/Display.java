package chapter07_Object_Oriented_Programming.Prob05;

public class Display {
    private Book book;
    private User user;
    private int pageNumber = 0;

    public void displayUser(User user) {
        this.user = user;
        refreshUserName();
    }

    public void displayBook(Book book) {
        this.book = book;
        refreshTitle();
        refreshDetails();
        refreshPage();
    }

    public void turnPageForward() {
        pageNumber++;
        refreshPage();
    }
    public void turnPageBackward() {
        pageNumber--;
        refreshPage();
    }

    public void refreshTitle() {}
    public void refreshUserName() {}
    public void refreshDetails() {}
    public void refreshPage() {}
}
