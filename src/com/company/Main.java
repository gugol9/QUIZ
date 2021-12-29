package com.company;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Quiz wiedzy o Polsce");
        Question a = new Question();
        a.load();
    }
}
