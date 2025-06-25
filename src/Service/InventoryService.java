package Service;

import Models.Book;

import java.util.List;
import java.util.Map;

public interface InventoryService {
    void addBook(Book book);
    void removeBook(Book book);
    void updateBook(String id,Book book);
    Map<String,Book> getAllBooks();
}
