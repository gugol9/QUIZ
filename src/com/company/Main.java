package com.company;

import java.io.FileNotFoundException;

public class Main {

    static int N = 6;

    public static void main(String[] args) throws FileNotFoundException {

        Question questions[] = new Question[N];
        Loader loader[] = new Loader[N];
        Ask ask[] = new Ask[N];
        Check check[] = new Check[N];


        int sum = 0;
        System.out.println("GRA WIEDZA O POLSCE");

        for (int i = 0; i < questions.length; i++)
        {
            questions[i] = new Question(); //przypisany obiekt do tablicy gdy tego nie ma nullPointerExeption to probuje wykonac operacje na null tablica jest doyslnie null wypelniona
            loader[i] = new Loader();
            ask[i] = new Ask();
            check[i] = new Check();
            if (questions[i] != null && loader[i] != null && ask[i] != null && check[i] != null)       //sprawdzenie czy tablica nie jet wypełniona wartosciami null
            {
                questions[i].number_question = i + 1;
                loader[i].load();
                ask[i].ask();
                check[i].check();
                sum += questions[i].score;
            }
        }
        System.out.println("Koniec quizu zdobyte punkty: " + sum);
        System.out.println("Odpowiedziałeś poprawnie na: " + sum + " / 6 pytań");
    }
}