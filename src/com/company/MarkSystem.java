package com.company;

public class MarkSystem extends Question{

   public int addScore(int sum)
    {
        if(sum == 10 || sum == 9) return 5;

        if(sum == 8 || sum == 7) return 4;

        if(sum == 5 || sum == 6) return 3;

        if(sum == 4) return 2;

        if(sum < 3) return 1;


        return sum;
    }
}
