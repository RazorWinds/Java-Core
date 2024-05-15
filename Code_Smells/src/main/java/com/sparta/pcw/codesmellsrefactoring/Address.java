
package com.sparta.pcw.codesmellsrefactoring;

public class Address {

    private int houseNo = 0;
    private String street = "";
    private String town = "";

    public Address(int houseNumber, String street, String town) {
        this.houseNo = houseNumber;
        this.street = street;
        this.town = town;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }
 
    
    public String getFullAddress() {
        var addressString = "Address: " + houseNo + " " + street + ", " + town;
        if (addressString.equals("Address: 0 , ")) {
            addressString = "Address: <no address set>";
        }
        return addressString;
    }
}
