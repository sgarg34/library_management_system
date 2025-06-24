package Service.impl;

import Models.Book;
import Service.InventoryService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryServiceImpl implements InventoryService {

   Map<String,List<Book>> mp = new HashMap<>();

    @Override
    public void addBook(Book book) {
       mp.computeIfAbsent(book.getIsbn(),k->new ArrayList<>())
               .add(book);

    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public void updateBook(String isbn,Book updateBook) {
        List<Book> getBook = mp.get(isbn);
        if(getBook!=null){
            for(int i=0;i<getBook.size();i++){
                Book current = getBook.get(i);

                if(current.getTitle().equals(updateBook.getTitle())){
                    getBook.set(i,updateBook);
                }
            }
        }

        System.out.println("No value to update");
    }

    @Override
    public  Map<String,List<Book>> getAllBooks() {
        return mp;
    }
}
