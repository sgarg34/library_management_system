package Service.impl;

import Models.Book;
import Service.InventoryService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryServiceImpl implements InventoryService {

   Map<String,Book> mp = new HashMap<>();

    @Override
    public void addBook(Book book) {
        if(!mp.containsKey(book.getIsbn())){
            mp.put(book.getIsbn(), book);
        }else{
            System.out.println("Book with same isbn exists");
        }



    }

    @Override
    public void removeBook(Book book) {
        Book removed = mp.remove(book.getIsbn());
        if (removed == null) {
            System.out.println("Book not found to remove");
        }
    }

    @Override
    public void updateBook(String isbn,Book updateBook) {
        if (mp.containsKey(isbn)) {
            mp.put(isbn, updateBook);
        } else {
            System.out.println("No book found with ISBN: " + isbn + " to update");
        }

        //System.out.println("No value to update");
    }

    @Override
    public  Map<String,Book> getAllBooks() {
        return mp;
    }

    @Override
    public Book searchByISBN(String ISBN) {
        return mp.get(ISBN);
    }
}
