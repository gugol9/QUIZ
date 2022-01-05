package com.company;


public class Question  {

    public static String contents;        //tresc pytania
    public static String a, b, c, d;      //mozliwe odpowiedzi
    public static String true_answer;     //poprawna odpowiedz
    public static String user_answer;     //odpowiedz od uzytkownika
    public  static int number_question;    //numer pytania
    public static int score;              //punkty zdobyte na koniec gry zwiekaszne o 1 gdy gracz odpowie poprawnie
   // public static int sum ;


//Pola są statyczne gdyż są one współdzielone przez wszystkie obiekty tej klasy w przeciwieństwie do pól niestatycznych (instancji), których własne egzemplarze ma każdy obiekt klasy
    //pola statyczne są tworzone jako pojedyncze wartości/obiekty.

    // w skrocie te obiekty statyczne sa dla kazdej klasy takei same a nie osobne wczesniej bez static tworzone były obiekty dla kazdej z kasy osobnno tutaj sa wspolne

//https://kursjava.com/klasy/metody-i-pola-statyczne/
}