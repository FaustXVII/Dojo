package application.builder;

import java.math.BigInteger;

public class Location {
    private final BigInteger latitude;
    private final BigInteger longitude;
    private final String adress;
    private final int houseNumber;
    private final String streetName;
    private final String city;

    public Location(final BigInteger latitude, final BigInteger longitude, final String adress,
    final int houseNumber, final String streetName, final String city){
        this.latitude = latitude;
        this.longitude = longitude;
        this.adress = adress;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
    }

    public static LocationBuilder builder(){
        return new LocationBuilder();
    }

    public BigInteger getLatitude() {
        return latitude;
    }

    public BigInteger getLongitude() {
        return longitude;
    }

    public String getAdress() {
        return adress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }
}
