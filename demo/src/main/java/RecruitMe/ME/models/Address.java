package RecruitMe.ME.models;

public class Address {
    private String street;
    private String city;
    private String zipCode;
    private String state;

    public Address(String street, String city, String zipCode, String state) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipCode;
    }

    public void setZipcode(String zipcode){
        this.zipCode = zipcode;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
