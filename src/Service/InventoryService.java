package Service;

import Models.Book;

import java.util.List;

public interface InventoryService {
    void addBook(Book book);
    void removeBook(Book book);
    void updateBook(Book book);
    List<Book> getAllBooks();
}
