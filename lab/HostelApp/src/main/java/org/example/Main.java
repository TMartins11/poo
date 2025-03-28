package org.example;

public class Main {
    public static void main(String[] args) {

        Guest saul = new Guest();

        saul.setTitle("Mr");
        saul.setFirstName("Saul");
        saul.setLastName("Hudson");
        saul.setEmail("slash@gmail.com");
        saul.setPhone("(213) 555-7890");
        saul.setCity("Los Angeles");
        saul.setState("California");
        saul.setCountry("United States");
        saul.setZipCode("90046");


        System.out.println("Title: " + saul.getTitle());
        System.out.println("First Name: " + saul.getFirstName());
        System.out.println("Last Name: " + saul.getLastName());
        System.out.println("Email: " + saul.getEmail());
        System.out.println("Phone Number: " + saul.getPhone());
        System.out.println("City: " + saul.getCity());
        System.out.println("State: " + saul.getState());
        System.out.println("Country: " + saul.getCountry());
        System.out.println("ZipCode: " + saul.getZipCode());

    }
}