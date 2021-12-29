package com.company;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Question a = new Question();
        a.load();
        a.ask();
        a.check();
        System.out.println("Koniec quizu zdobyte punkty: " + a.score);
    }
}
