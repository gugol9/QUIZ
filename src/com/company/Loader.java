package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loader extends Question  {

  public static void load() throws FileNotFoundException        // funkcja void, która wczytuje plik pytanie.txt oraz wyswietla dane w nim                                           a file FileNotFoundException to wyjatek
    {
        File file = new File("pytanie.txt");           // klasa file jest to zaczep do pliku
        Scanner scanner = new Scanner(file);                    //tworze nowy obiekt scanner klasy Scanner

        String line;                                            // przechowuje biezaca linie z pliku
        int line_number = (number_question - 1) * 6 + 1;        //wzor według którego co 7 linia to pytanie
        int current_line = 1;                                   // aktualny nr linii

        while(scanner.hasNext()) {                              //petla while wykorzystuje obiekt scanner z klasy Scanner i wczytuje dopóki ma nastepna linie do wczytanai przy czym za linie uznaje koniec lini ze znakiem enter
            line = scanner.nextLine();                          //linia to nastepna linia w metodzie scanner
            if (current_line == line_number) contents = line;   //Jezeli nr aktualnie czytanej linii zgadza sie z numerem pierwszej linni dla pytania to tresc to nr linii
            if (current_line == line_number + 1) a = line ;     //w tej linii  wiekszej o 1 jest odpowiedz a
            if (current_line == line_number + 2) b = line;      //w tej linii  wiekszej o 2 jest odpowiedz b
            if (current_line == line_number + 3) c = line;
            if (current_line == line_number + 4) d = line;
            if (current_line == line_number + 5) true_answer = line;
            current_line++;                                     //aktualny nr linii
        }
        scanner.close();                                         //zamknięcie połączenia z plikiem
    }
}
