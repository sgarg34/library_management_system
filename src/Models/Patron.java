package Models;

public class Patron {

    private final String patronId;
    private String name;
    private String mobile;

    public Patron(String patronId, String name, String mobile) {
        this.mobile = mobile;
        this.patronId = patronId;
        this.name = name;
    }

    public String getPatronId() {
        return patronId;
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

    @Override
    public String toString() {
        return "Patron{" +
                "patronId='" + patronId + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
