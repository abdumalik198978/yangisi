package seleniumIntro.weekend;

import com.github.javafaker.Faker;

public class JavaFakerEx {
    public static void main(String[] args) {
 Faker faker = new Faker();
 String fullname = faker.name().fullName();
 String firstname = faker.name().firstName();
 String dogName = faker.dog().name();

        System.out.println("Fullname "+ fullname);
        System.out.println("firstName "+ firstname);
        System.out.println("dog name "+ dogName);
    }
}
