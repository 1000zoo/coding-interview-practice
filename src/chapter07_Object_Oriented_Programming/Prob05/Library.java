package chapter07_Object_Oriented_Programming.Prob05;

import java.util.*;

public class Library {
    HashMap<Integer, Book> bookMap;

    public Library() {
        bookMap = new HashMap<>();
    }

    public Book addBook(int id, String details) {
        if (bookMap.containsKey(id)) return null;
        Book book = new Book(id, details);
        bookMap.put(id, book);
        return book;
    }

    public boolean remove(int id) {
        if (!bookMap.containsKey(id)) return false;
        bookMap.remove(id);
        return true;
    }
    public boolean remove(Book book) {
        return remove(book.id);
    }
    public Book find(int id) {
        return bookMap.get(id);
    }
}
