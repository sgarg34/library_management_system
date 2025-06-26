package Service.impl;

import Models.Book;
import Models.Patron;
import Service.PatronService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatronServiceImpl implements PatronService {

    Map<String,Patron> mp = new HashMap<>();

    private Map<String,List<Book>> borrowedBooks = new HashMap<>();

    @Override
    public void addPatron(Patron patron) {
        if(!mp.containsKey(patron.getPatronId())){
            mp.put(patron.getPatronId(),patron);
        }else {
            System.out.println("Patron with same details exists");
        }
    }

    @Override
    public void updatePatron(Patron patron) {
            mp.put(patron.getPatronId(),patron);
    }

    @Override
    public Patron getPatron(String id) {
        return mp.get(id);
    }

    @Override
    public  List<Book> allBorrowedBooks(String patronID) {
        return borrowedBooks.get(patronID);
    }

    @Override
    public void addPatronBooks(String patronID,Book book){
        borrowedBooks.computeIfAbsent(patronID,k->new ArrayList<>()).add(book);
    }

    @Override
    public void removeBook(String patronID,Book book){
        borrowedBooks.get(patronID).remove(book);
    }
}
