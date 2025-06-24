import Models.Book;
import Service.InventoryService;
import Service.impl.InventoryServiceImpl;

import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryServiceImpl();

        inventoryService.addBook(new Book("127687677","Programing in java","Sudhanshu Garg",2025));
        inventoryService.updateBook("127687677",new Book("127687677","Programing in java","Sudhanshu Garg and Naira Garg",2025));

        Map<String , List<Book>> getBooks =  inventoryService.getAllBooks();

        for (Map.Entry<String, List<Book>> entry : getBooks.entrySet()) {
            System.out.println("ISBN: " + entry.getKey());
            for (Book book : entry.getValue()) {
                System.out.println(" - " + book);
            }
        }


    }
}