package Service.impl;

import Models.Book;
import Models.Patron;
import Service.InventoryService;
import Service.LendingService;
import Service.PatronService;

public class LendingServiceImpl implements LendingService {

    private final InventoryService inventoryService;
    private final PatronService patronService;

    public LendingServiceImpl(InventoryService inventoryService, PatronService patronService) {
        this.inventoryService = inventoryService;
        this.patronService = patronService;
    }

    @Override
    public void checkout(String patronID, String ISBN) {
        Book book = inventoryService.searchByISBN(ISBN);
        Patron patron = patronService.getPatron(patronID);
        if(book!=null && book.isAvailable()){
            book.setAvailable(false);
            patronService.addPatronBooks(patronID,book);
            System.out.println("Book is issued to"+patron.getName()+"("+patron.getPatronId()+")");
        }else{
            System.out.println("Book is not available");
        }



    }
}
