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

        System.out.println("QUIZ WIEDZY O POLSCE");
        System.out.println("Wpisz jako dopowiedż: a, b, c lub d");
        int sum = 0;
        int ile = 0;

        for (int i = 0; i < questions.length; i++)
        {
            questions[i] = new Question(); //przypisany obiekt do tablicy
            loader[i] = new Loader();
            ask[i] = new Ask();
            check[i] = new Check();
          if (questions[i] != null && loader[i] != null && ask[i] != null && check[i] != null)       //sprawdzenie czy tablica nie jet wypełniona wartosciami null
          {
                Question.number_question = i + 1;       //bez tworzenia obiektu static
                Loader.load();
                Ask.ask();
                Check.check();
                sum += Question.score ;         //dodaje 2pkt za kazda dobra odpowiedz do zmiennej suma
                ile = sum/2;                //liczy na ile pytań dobrze odpowiedzial gracz
          }
          }
        System.out.println("Odpowiedziałeś poprawnie na: " + ile + " / " + N + " pytań");
        System.out.println("Twoja ocena: " + markSystem.addScore(sum));
        System.out.println("Gratuluje zdobyłeś: "+ sum + " pkt" );
        System.out.println("ocena 5 - 20/18 pkt");
        System.out.println("ocena 4 - 16/14 pkt");
        System.out.println("ocena 3 - 12/10 pkt");
        System.out.println("ocena 2 - 8/6 pkt");
        System.out.println("ocena 1 - < 4 pkt");
    }
}