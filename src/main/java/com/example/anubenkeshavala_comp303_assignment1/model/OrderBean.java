package com.example.anubenkeshavala_comp303_assignment1.model;

public class OrderBean {

    private String firstName;

    private String middleName;

    private String lastName;

    private String email;

    private String contactNumber;

    private String streetAddress;

    private String streetAddressLine2;

    private String city;

    private String province;

    private String postalCode;

    private String country;

    private String productNumber;

    private String phoneBrand;

    private String phoneModel;

    private int quantity;

    private int areaCode;
    
    private double price;

    public OrderBean() {
    }


    public OrderBean(String firstName, String middleName, String lastName, String email, String contactNumber, int areaCode, String streetAddress, String streetAddressLine2, String city, String province, String postalCode, String country, String productNumber, String phoneBrand, String phoneModel, int quantity, double price) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.streetAddress = streetAddress;
        this.streetAddressLine2 = streetAddressLine2;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.country = country;
        this.productNumber = productNumber;
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.quantity = quantity;
        this.areaCode = areaCode;
        this.price = price;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddressLine2() {
        return streetAddressLine2;
    }

    public void setStreetAddressLine2(String streetAddressLine2) {
        this.streetAddressLine2 = streetAddressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getAreaCode(){
        return areaCode;
    }

    public void setAreaCode(int areaCode){
        this.areaCode = areaCode;
    }
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "OrderBean{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", streetAddress='" + streetAddress + '\'' +
                ", streetAddressLine2='" + streetAddressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", phoneBrand='" + phoneBrand + '\'' +
                ", phoneModel='" + phoneModel + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +

                '}';
    }
}
