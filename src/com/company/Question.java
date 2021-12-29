package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Question {
         String contents;       //tresc
         String a, b, c, d;     //mozliwe odpowiedzi
         String true_answer;
         String user_answer;
         int number_pytania;
         int score;  // 1 or 0

    void load() throws FileNotFoundException     //this void reads data from a file FileNot... wyjatek
    {
        File file = new File("pytanie.txt");        // klasa file jest to zaczep do pliku
        Scanner scanner = new Scanner(file);        //tworze nowy obiekt scanner klasy Scanner

       String line;                                        // przechowuje biezaca linie z pliku
        int line_number = (number_pytania+1);//-1)*6+1;            //nr statrotwy lini od ktorej bedzimey czytac
        int current_line = 1;                               // aktualny nr lini

// TU JEST PROBLEM
        while(scanner.hasNext())
       {
           line = scanner.nextLine();
          //System.out.println(line);

           if(current_line == line_number) contents = line;
           if(current_line == line_number + 1) a = line;
           if(current_line == line_number + 2) b = line;
           if(current_line == line_number + 3) c = line;
           if(current_line == line_number + 4) d = line;
           if(current_line == line_number + 5) true_answer = line;
           current_line++;
        }
        scanner.close();
    }



    void ask() // asks a question
    {
        Scanner scan = new Scanner(System.in);  //mozliwosc wprwoadzenia danych
        System.out.println("Pytanie: "+contents);
        System.out.println("a) " + a);
        System.out.println("b) " + b);
        System.out.println("c) " + c);
        System.out.println("d) " + d);
        System.out.println("-------------");
        System.out.println(true_answer);
         user_answer = scan.nextLine();         //wprowadzenie odp
    }
    void check()    // checks a answer
    {
        if(Objects.equals(user_answer, true_answer)) // porownywanie stringow jednen rowny drugiemu 
        {
            score = 1;
        }else score = 0;

        System.out.println(score);
    }


}
