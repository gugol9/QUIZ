package Test;
import com.company.MarkSystem;
import org.junit.Assert;
import org.junit.jupiter.api.*;

public class MarkSystemTest{            //Klasa, którą testuje
    private MarkSystem markSystem;       //instancja klasy MarkSystem

    @BeforeEach                         // @BeforeEach Wykona się zawsze przed testami
    void beforeEach(){                  //metoda void
        markSystem = new MarkSystem();  // utworzenie instacji klasy
    }

    @Test
    public void MarkSystem_IsCorrect_Mark(){         //sprawdzanie poprawności wysawiania ocen zaleznie od ilosci podanych pkt
        //given
        int a = 10;                                  //ilość punktów zdobytych przez gracza
        int b = 9;
        int c = 8;
        int d = 7;
        int e = 6;
        int f = 5;
        int g = 4;
        int h = 3;
        int i = 2;
        int j = 1;
        int k = 0;

        //when
        int result = markSystem.addScore(a);        //zapisanie do zmiennej 'result' oraz wywołanie logiki
        int resultb = markSystem.addScore(b);
        int resultc = markSystem.addScore(c);
        int resultd = markSystem.addScore(d);
        int resulte = markSystem.addScore(e);
        int resultf = markSystem.addScore(f);
        int resultg = markSystem.addScore(g);
        int resulth = markSystem.addScore(h);
        int resulti = markSystem.addScore(i);
        int resultj = markSystem.addScore(j);
        int resultk = markSystem.addScore(k);

        //then
        Assert.assertEquals(5, result);    //sprawdzenie oczekiwany wynik to zwrocenie liczby 4 dla 7 pkt (dla a = 7)  przyjmuje dwa parametry wartość oczekiwaną i wartość rzeczywistą, jeśli są różne rzuca wyjątek,
        Assert.assertEquals(5, resultb);
        Assert.assertEquals(4, resultc);
        Assert.assertEquals(4, resultd);
        Assert.assertEquals(3, resulte);
        Assert.assertEquals(3, resultf);
        Assert.assertEquals(2, resultg);
        Assert.assertEquals(1, resulth);
        Assert.assertEquals(1, resulti);
        Assert.assertEquals(1, resultj);
        Assert.assertEquals(1, resultk);
    }

    //TEST POWTARZALNY  Jeżeli z naszym kodem jest cos nie tak ale od czasu do czasu
    @RepeatedTest(value = 10)       //value = 10 infomujemy ile razy ma sie wykonac kod
    void repeatedTest(TestInfo testInfo){
        System.out.println(testInfo);
    }

   // @RepeatedTest(value = 5)
    @Test
    public void Bettwen_score_Mark_Test() {
        //given
        int a = 12;
        int b = 3;

        //when
        int result = a + b;

        //then
        Assertions.assertEquals(15, result);
    }

}




