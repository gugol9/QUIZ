package com.company;

import java.util.Objects;

public class Check extends Question {

    public static void check(){                                  //metoda statyczna sprawdza odpowiedz gracza na pytanie

        if(Objects.equals(user_answer, true_answer))             // porownywanie Stringow czy pierwszy jest równy drugiemu
        {
            score = 2;                                          //jeżeli równe to do punktów przypisz 2
            System.out.println("To poprawna odpowiedż !!!");    //wyświetl poprawna odpowiedz
        } else {
            score = 0;                                          //w przeciwnym wypadku do punktów przypisz 0
            System.out.println("Zła odpowiedż ");               //wyświetl zła odpowiedz
        }
    }
}
