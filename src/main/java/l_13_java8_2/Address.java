package l_13_java8_2;

import java.util.List;

class Address {
    private String city;
    private String street;
    private List<String> oldStreetNames;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<String> getOldStreetNames() {
        return oldStreetNames;
    }

    public void setOldStreetNames(List<String> oldStreetNames) {
        this.oldStreetNames = oldStreetNames;
    }
}