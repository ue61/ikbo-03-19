package com.company.pr.hw2.n1;

public class TestAuthor {
    TestAuthor(){
        Author author = new Author("Mihail", "4901w9402914@gmail.com", 'M');
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.getEmail());
        author.setEmail("pr2@mail.com");
        System.out.println(author.getEmail());
        System.out.println(author.toString());
    }
}
