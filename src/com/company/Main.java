package com.company;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static int N = 5;

    public static void main(String[] args) throws FileNotFoundException {

        Question questions[] = new Question[N];
        int sum = 0;
        System.out.println("GRA WIEDZA O POLSCE");

        for (int i = 0; i < questions.length; i++)
        {
            questions[i] = new Question(); //przypisany obiekt do tablicy gdy tego nie ma nullPointerExeption to probuje wykonac operacje na null tablica jest doyslnie null wypelniona
            if (questions[i] != null)       //sprawdzenie czy tablica nie jet wypełniona wartosciami null
            {
                questions[i].number_question = i + 1;
                questions[i].load();
                questions[i].ask();
                questions[i].check();
                sum += questions[i].score;
            }
        }
        System.out.println("Koniec quizu zdobyte punkty: " + sum);
        System.out.println("Odpowiedziałeś poprawnie na: " + sum + " / 6 pytań");
    }
}