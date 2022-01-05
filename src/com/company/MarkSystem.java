package com.company;

public class MarkSystem extends Question{

   public int addScore(int sum)
    {
        if(sum <= 20 && sum >= 17) return 5;

        if(sum <= 16 && sum >= 13) return 4;

        if(sum <= 12 && sum >= 10) return 3;

        if(sum <= 9 && sum >= 5) return 2;

        if(sum <= 4) return 1;


        return sum;
    }
}
