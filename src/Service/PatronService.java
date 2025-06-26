package Service;


import Models.Book;
import Models.Patron;

import java.util.List;

public interface PatronService {
    void addPatron(Patron patron);
    void updatePatron(Patron patron);
    Patron getPatron(String id);
    List<Book> allBorrowedBooks(Book book);
    void addPatronBooks(Book book);
}
