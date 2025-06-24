package Models;

public class Patron {

    private final String patronId;
    private String name;
    private String mobile;

    public Patron(String mobile, String patronId, String name) {
        this.mobile = mobile;
        this.patronId = patronId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
