package Service;


import Models.Patron;

public interface PatronService {
    void addPatron(Patron patron);
    void updatePatron(Patron patron);
    Patron getPatron(String id);
}
