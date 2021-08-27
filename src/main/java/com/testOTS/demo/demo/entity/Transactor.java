package com.testOTS.demo.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="transactor")
public class Transactor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="company_name")
    private String companyName;

    @Column(name="email")
    private String email;

    @Column(name="tin")
    private long tin;

    @Column(name="doy")
    private String doy;

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="postal_code")
    private String postalCode;

    @Column(name="transactor_type")
    private boolean transactorType;

    @Column(name="is_abroad")
    private boolean isAbroad;

    @OneToMany(mappedBy="transactor")
    private List<Invoice> invoices;

    //Empty constructor
    public Transactor() {

    }

    //Constructor without id

    public Transactor(String firstName, String lastName, String companyName, String email, long tin, String doy, String address, String city, String phoneNumber, String postalCode, boolean transactorType, boolean isAbroad, List<Invoice> invoices) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.email = email;
        this.tin = tin;
        this.doy = doy;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.transactorType = transactorType;
        this.isAbroad = isAbroad;
        this.invoices = invoices;
    }


    //Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTin() {
        return tin;
    }

    public void setTin(long tin) {
        this.tin = tin;
    }

    public String getDoy() {
        return doy;
    }

    public void setDoy(String doy) {
        this.doy = doy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public boolean isTransactorType() {
        return transactorType;
    }

    public void setTransactorType(boolean transactorType) {
        this.transactorType = transactorType;
    }

    public boolean isAbroad() {
        return isAbroad;
    }

    public void setAbroad(boolean abroad) {
        isAbroad = abroad;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    //toString Method

    @Override
    public String toString() {
        return "Transactor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", email='" + email + '\'' +
                ", tin=" + tin +
                ", doy='" + doy + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", transactorType=" + transactorType +
                ", isAbroad=" + isAbroad +
                ", invoices=" + invoices +
                '}';
    }
}
