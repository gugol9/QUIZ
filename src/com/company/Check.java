package com.company;

import java.util.Objects;

public class Check extends Question {




  public static void check() // checks a answer
    {
        if(Objects.equals(user_answer, true_answer))   // porownywanie stringow jednen rowny drugiemu
        {
            score = 1;
            System.out.println("To poprawna odpowiedż !!!");
        } else {
            score = 0;
            System.out.println("Zła odpowiedż ");
        }
    }
}
