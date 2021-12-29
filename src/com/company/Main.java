package com.company;

import java.io.FileNotFoundException;

public class Main {
    static int N = 5;

    public static void main(String[] args) throws FileNotFoundException {

        Question questions[] = new Question[N];
       // questions[0] = new int(1);

        //Question q = new Question();
        int sum = 0;

        for(int i = 0; i < questions.length ;i++)
        {
            questions[i].number_question = i + 1;
            questions[i].load();
            questions[i].ask();
            questions[i].check();
            sum+= questions[i].score;


        }
        System.out.println("Koniec quizu zdobyte punkty: " + sum);
    }
}
