package com.company;

public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author person = new Author("Grigorii Levchenko", "wiharo@gmail.com", 'M');
        System.out.println(person);
        person.setEmail("wiharoNew@yandex.ru");
        System.out.println(person);
    }
}
