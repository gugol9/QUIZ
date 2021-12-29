package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question {
         String contents;       //tresc
         String a, b, c, d;     //mozliwe odpowiedzi
         String true_answer;
         String user_answer;
         int number_answer;
         boolean score;  // 1 or 0

    void load() throws FileNotFoundException     //this void reads data from a file FileNot... wyjatek
    {

        int line_number = (number_answer-1)*6+1;            //nr statrotwy lini od ktorej bedzimey czytac
        int current_line = 1;                               // aktualny nr lini
        //String line ;                                        // przechowuje biezaca linie z pliku
        File file = new File("pytanie.txt");        // klasa file jest to zaczep do pliku
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext())
        {
            String line = scanner.nextLine();
            System.out.println(line);
                if(current_line == line_number) contents = line;
                if(current_line == line_number + 1) a = line;
                if(current_line == line_number + 2) b = line;
                if(current_line == line_number + 3) c = line;
                if(current_line == line_number + 4) d = line;
                if(current_line == line_number + 5) true_answer = line;
                    current_line++;

        }

    }



    void ask() // asks a question
    {
        System.out.println(contents);
    }
    void check()    // checks a answer
    {

    }
}
