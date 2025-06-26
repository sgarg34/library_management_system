package Service;


import Models.Book;
import Models.Patron;

import java.util.List;
import java.util.Map;

public interface PatronService {
    void addPatron(Patron patron);
    void updatePatron(Patron patron);
    Patron getPatron(String id);
    List<Book> allBorrowedBooks(String patronID);
    void addPatronBooks(String patronID,Book book);
}
