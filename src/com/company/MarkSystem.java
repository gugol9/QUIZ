package com.company;

public class MarkSystem extends Question{

   public int addScore(int sum)                     //metoda dodaj punkt przyjmuje parametr  typu int o nazwie sum
    {
        if(sum <= 20 && sum >= 18) return 5;        //jeżeli wynik gracza jest pomiedzy 20 a 18 to zwróc 5

        if(sum <= 16 && sum >= 14) return 4;        //jeżeli wynik gracza jest pomiedzy 16 a 14 to zwróc 4

        if(sum <= 12 && sum >= 10) return 3;        //jeżeli wynik gracza jest pomiedzy 12 a 10 to zwróc 3

        if(sum <= 8 && sum >= 6) return 2;          //jeżeli wynik gracza jest pomiedzy 8 a 6 to zwróc 2

        if(sum <= 4) return 1;                       //jeżeli wynik gracza jest mniejszy niz 4 do zwroc 1

        return sum;                                 // zwraca sume
    }
}
