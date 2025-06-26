package Service;


public interface LendingService {

    void checkout(String patronID, String ISBN);
    void returnBook(String patronID, String ISBN);

}
