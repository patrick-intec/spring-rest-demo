package be.infernalwhale.springrestdemo.model;

import java.util.Arrays;

public class Employee {
    private Integer taxNumber;
    private String firstName;
    private String familyName;
    private String[] favouriteMovies;
    private Employee boss;

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

    public String[] getFavouriteMovies() {
        return favouriteMovies;
    }

    public Employee setFavouriteMovies(String[] favouriteMovies) {
        this.favouriteMovies = favouriteMovies;
        return this;
    }

    public Employee getBoss() {
        return boss;
    }

    public Employee setBoss(Employee boss) {
        this.boss = boss;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "taxNumber=" + taxNumber +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", favouriteMovies=" + Arrays.toString(favouriteMovies) +
                ", boss=" + boss +
                '}';
    }
}
