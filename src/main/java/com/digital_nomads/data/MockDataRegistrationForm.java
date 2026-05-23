package com.digital_nomads.data;

import com.digital_nomads.entities.WebTables;
import com.github.javafaker.Faker;

public class MockDataRegistrationForm {
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
    public static String  randomAge() {
        return faker.number().digits(2);
    }

    public static String  randomSalary() {
        return faker.number().digits(6);
    }

    public static String randomDepartment() {
        return faker.company().bs();
    }


    public static WebTables randomRegistration() {
        String firstName = randomFirstName();
        String lastName = randomLastName();
        String email = randomEmail();
        Integer age = Integer.valueOf(randomAge());
        Integer salary = Integer.valueOf(randomSalary());
        String department = randomDepartment();
        WebTables webTables = new WebTables(firstName, lastName, email, age, salary, department);
        return webTables;
    }
    public static WebTables randomRegistrationEdit() {
        String firstName = randomFirstName();
        String lastName = randomLastName();
        String email = randomEmail();
        Integer age = Integer.valueOf(randomAge());
        Integer salary = Integer.valueOf(randomSalary());
        String department = randomDepartment();
        WebTables webTables = new WebTables(firstName, lastName, email, age, salary, department);
        return webTables;
    }
}
