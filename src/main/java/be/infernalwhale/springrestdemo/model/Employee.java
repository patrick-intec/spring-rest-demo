package be.infernalwhale.springrestdemo.model;

public class Employee {
    private Integer taxNumber;
    private String firstName;
    private String familyName;

    public Employee(Integer taxNumber, String firstName, String familyName) {
        this.taxNumber = taxNumber;
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public Integer getTaxNumber() {
        return taxNumber;
    }

    public Employee setTaxNumber(Integer taxNumber) {
        this.taxNumber = taxNumber;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Employee setFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }
}
