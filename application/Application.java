package application;

import java.util.Scanner;

public class Application {

    public void run(){
        String enteredName = new Scanner(System.in).nextLine();

//        Person person = new Person();
//        person.setAge(32);
//        person.setName("Rutger");
//        person.setGender("Hello!");

        System.out.println("Hello " + enteredName);
    }
}
