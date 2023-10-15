package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class Day04_FakerTest {

    @Test

    public void fakerTest(){

        Faker faker= new Faker();
        String firstName = faker.name().firstName();
        System.out.println("First Name:" + firstName);

        String lastName = faker.name().lastName();
        System.out.println("Last Name:" + lastName);

        System.out.println(faker.name().fullName());
        System.out.println(faker.funnyName().name());

        System.out.println(faker.address().fullAddress());
        System.out.println(faker.address().city());
        System.out.println(faker.address().streetName());
        System.out.println(faker.address().state());


        System.out.println(faker.phoneNumber().cellPhone());

        System.out.println(faker.number().digit());
        System.out.println(faker.number().randomNumber());

        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.internet().password());
    }
}
