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

    @RepeatedTest(value = 4)        //test powtarzalny sprawdzi 4 razy
    public void MarkSystem_IsCorrect_Mark(){         //sprawdzanie poprawności wysawiania ocen zaleznie od ilosci podanych pkt
        //given
        int a = 16;                                  //ilość punktów zdobytych przez gracza

        //when
        int result = markSystem.addScore(a);        //zapisanie do zmiennej 'result' oraz wywołanie logiki

        //then
        Assert.assertEquals(4, result);    //sprawdzenie oczekiwany wynik to zwrocenie liczby 4 dla 16 pkt (dla a = 16)  przyjmuje dwa parametry wartość oczekiwaną i wartość rzeczywistą, jeśli są różne rzuca wyjątek,

    }







}




