package Parking.Entity;

public class Address {
    String street;
    String block;
    String city;
    String state;
    String country;

    public Address(String street, String block, String city, String state, String country){
        this.street = street;
        this.block = block;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getAddress(){
        String address = this.street + " " + this.block + " " + this.city + " " + this.state + " " + this.country;
        return address;
    }

}
