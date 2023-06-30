package application.builder;

import java.math.BigInteger;

public class LocationBuilder {
    BigInteger latitude;
    BigInteger longitude;
    String adress;
    int houseNumber;
    String streetName;
    String city;

    public LocationBuilder latitude(final BigInteger latitude){
        this.latitude = latitude;

        return this;
    }

    public LocationBuilder longitude(final BigInteger longitude){
        this.longitude = longitude;

        return this;
    }

    public LocationBuilder adress(final String adress){
        this.adress = adress;

        return this;
    }

    public LocationBuilder houseNumber(final int houseNumber){
        this.houseNumber = houseNumber;

        return this;
    }

    public LocationBuilder streetName(final String streetName){
        this.streetName = streetName;

        return this;
    }

    public LocationBuilder city(final String city){
        this.city = city;

        return this;
    }


    public Location build(){
        return new Location(latitude, longitude, adress, houseNumber, streetName, city);
    }
}
