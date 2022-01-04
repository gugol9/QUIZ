package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loader extends Question {


    public Loader() {

    }

    void load() throws FileNotFoundException                     // funkcja void, która wczytuje plik pytanie.txt oraz wyswietla dane w nim a file FileNotFoundException to wyjatek
    {
        File file = new File("pytanie.txt");           // klasa file jest to zaczep do pliku
        Scanner scanner = new Scanner(file);                    //tworze nowy obiekt scanner klasy Scanner

        String line;                                            // przechowuje biezaca linie z pliku ??
        int line_number = (number_question - 1) * 6 + 1;        //wzor według którego co 7 linia to pytanie
        int current_line = 1;                                   // aktualny nr lini

        while (scanner.hasNext()) {       //petla while wykorzustuje obiekt scanner z klasy scanner i wczytuje dopuki manastepna linie do wczytanai przy czym za linie uznaje koniec lini ze znakiem enter
            line = scanner.nextLine();      //linia to nastepna linia w metodzie scanner ???

            if (current_line == line_number) contents = line;
            if (current_line == line_number + 1) a = line;
            if (current_line == line_number + 2) b = line;
            if (current_line == line_number + 3) c = line;
            if (current_line == line_number + 4) d = line;
            if (current_line == line_number + 5) true_answer = line;
            current_line++;

        }
        scanner.close();
    }
}
