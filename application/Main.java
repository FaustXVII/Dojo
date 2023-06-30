package application;

import application.beans.*;
import application.builder.Location;
import application.builder.LocationFactory;

public class Main {

    public static void main(final String... args){
//        new Application().run();
//        new DependencyInjection(BeanFactory.createBean()).run();
        new DependencyInjection(new JavaBean()).run();
        new DependencyInjection(new BeanMock()).run();
        new DependencyInjection(SingletonBean.getInstance()).run();

        final Location location = Location.builder()
                .adress("2345AP")
                .streetName("Sesam")
                .build();

        final Location kindsLike = LocationFactory.createLocation("Sesam");
        final Location iLike = LocationFactory.createLocation("Rutger");

        System.out.println(kindsLike.getStreetName());

        Person person = new Person();
        person.setAge(20);
        person.setName("Bob");
        person.setGender("NonBinary");


        person.setGender("Female");

//        new DependencyInjection().run();
    }
}
