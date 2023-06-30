package application.builder;

import java.math.BigInteger;

public class LocationFactory {
    private LocationFactory(){}

    public static Location createLocation(final String type){
        final LocationBuilder builder = Location.builder()
                .longitude(BigInteger.ZERO)
                .latitude(BigInteger.ZERO);

        if("SESAM".equalsIgnoreCase(type)){
            return builder
                    .streetName("SesamStraat")
                    .build();
        }

        if("Rutger".equalsIgnoreCase(type)){
            return builder
                    .city("Veenendaal")
                    .streetName("My street")
                    .build();
        }

        return new Location(null,null,null,0,null,null);
    }
}
