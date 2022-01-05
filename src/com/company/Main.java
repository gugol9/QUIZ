package com.company;

import java.io.FileNotFoundException;

public class Main {
static final int N = 10;     //zadeklarowwany statyczny ostateczy int N ktory jest wielkoscia tablicy(tyle pytan wyswietlonych bedzie )

    public static void main(String[] args) throws FileNotFoundException {

        Question[] questions = new Question[N];
        Loader[] loader = new Loader[N];
        Ask[] ask = new Ask[N];
        Check[] check = new Check[N];

        MarkSystem markSystem = new MarkSystem();

        System.out.println("GRA WIEDZA O POLSCE");
        System.out.println("Wpisz jako dopowiedż: a, b, c lub d");
        int sum = 0;

        for (int i = 0; i < questions.length; i++)
        {
            questions[i] = new Question(); //przypisany obiekt do tablicy gdy tego nie ma nullPointerExeption to probuje wykonac operacje na null tablica jest doyslnie null wypelniona
            loader[i] = new Loader();
            ask[i] = new Ask();
            check[i] = new Check();
          if (questions[i] != null && loader[i] != null && ask[i] != null && check[i] != null)       //sprawdzenie czy tablica nie jet wypełniona wartosciami null
          {
                Question.number_question = i + 1;       //bez tworzenia obiektu static
                Loader.load();
                Ask.ask();
                Check.check();
                sum += Question.score;
           }
          }
        System.out.println("Koniec quizu zdobyte punkty: " + sum);
        System.out.println("Odpowiedziałeś poprawnie na: " + sum + " / 10 pytań");
        System.out.println("Twoja ocena: " + markSystem.addScore(sum));
    }
}