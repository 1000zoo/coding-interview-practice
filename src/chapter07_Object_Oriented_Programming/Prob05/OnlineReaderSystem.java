package chapter07_Object_Oriented_Programming.Prob05;

public class OnlineReaderSystem {
    private Library library;
    private UserManager userManager;
    private Display display;

    private Book book;
    private User user;

    public OnlineReaderSystem(Library library, UserManager userManager, Display display) {
        this.library = library;
        this.userManager = userManager;
        this.display = display;
    }

    public Library getLibrary() {
        return library;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public Display getDisplay() {
        return display;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
