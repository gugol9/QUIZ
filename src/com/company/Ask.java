package com.company;


import java.util.Scanner;

public class Ask extends Question {

    public void ask() // asks a question
    {

        Scanner scan = new Scanner(System.in);          //mozliwosc wprwoadzenia danych dzieki klasie Scanner
        System.out.println();                           //odstęp od góry od wyświetlanej tresci
        System.out.println("Pytanie "+ contents);
        System.out.println("a) " + a);
        System.out.println("b) " + b);
        System.out.println("c) " + c);
        System.out.println("d) " + d);
        System.out.println();                           //odstęp odpowiedzi od mozliwych opcji wyobru
        System.out.print("Odpowiedż: ");
        user_answer = scan.nextLine();                  //uzytkownik wprowadza odpwiedz
    }


}
