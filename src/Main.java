import Models.Book;
import Models.Patron;
import Service.InventoryService;
import Service.LendingService;
import Service.PatronService;
import Service.impl.InventoryServiceImpl;
import Service.impl.LendingServiceImpl;
import Service.impl.PatronServiceImpl;

import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryServiceImpl();
        PatronService patronService = new PatronServiceImpl();
        LendingService lendingService = new LendingServiceImpl(inventoryService,patronService);

        patronService.addPatron(new Patron("P1001","Sudhanshu garg","9646341898"));

        inventoryService.addBook(new Book("127687677","Programing in java","Sudhanshu Garg",2025));
        inventoryService.addBook(new Book("127687678","Programing in PHP","Sudhanshu Garg",2025));

        inventoryService.updateBook("127687677",new Book("127687677","Programing in java","Sudhanshu Garg and Naira Garg",2025));

        Map<String ,Book> getBooks =  inventoryService.getAllBooks();

        for (Map.Entry<String, Book> entry : getBooks.entrySet()) {
            System.out.println("ISBN: " + entry.getKey());
            System.out.println(entry.getValue());
        }

        //System.out.println(patronService.getPatron("P1001"));
        System.out.println(inventoryService.searchByISBN("127687678"));

        lendingService.checkout("P1001","127687677");
        lendingService.checkout("P1001","127687677");



    }
}