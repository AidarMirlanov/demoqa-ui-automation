package com.digital_nomads.data;

import com.digital_nomads.entities.PracticeForm;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MockDataGeneratorForPractice {
    public static Faker faker = new Faker();

    public static String randomFirstName() {
        return faker.name().firstName();
    }
    public static String randomLastName() {
        return faker.name().lastName();
    }
    public static String randomEmail() {
        return faker.internet().emailAddress();
    }
    public static String randomMobileNumber() {
        return faker.number().digits(10);
    }

    public static String randomDateOfBirth() {
        LocalDate dateOfBirth = faker.date().birthday().toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        return dateOfBirth.format(formatter);
    }

    public static String randomAddress() {
        return faker.address().fullAddress();

    }

    public static PracticeForm randomTextFormPage2() {
        String firstName = randomFirstName();
        String lastName = randomLastName();
        String email = randomEmail();
        String mobilNumber = randomMobileNumber();
        String address = randomAddress();
        PracticeForm practiceForm = new PracticeForm(firstName, lastName, email, mobilNumber,  address);
        return practiceForm;

    }
}

