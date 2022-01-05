package Test;
import com.company.Check;
import com.company.MarkSystem;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MarkSystemTest{            //Klasa, którą testuje

    public MarkSystem markSystem;       //instancja klasy MarkSystem

    @BeforeEach                         // @BeforeEach Wykona się zawsze przed testami
    void beforeEach(){                  //metoda void
        markSystem = new MarkSystem();  // utworzenie instacji klasy
    }




    @Test
    public void MarkSystem_IsCorrect_Mark()         //sprawdzanie poprawności wysawiania ocen
    {
        //given
        int a = 4;                                  //ilość punktów zdobytych przez gracza

        //when
        int result = markSystem.addScore(a);        //zapisanie do zmiennej 'result' oraz wywołanie logiki

        //then
        Assert.assertEquals(2, result);    //sprawdzenie oczekiwany wynik to zwrocenie liczby 4 dla 7 pkt (dla a = 7)
    }



}


   /* @Test
    public void simpleTest()
    {
        //given
        int a = 2;
        int b = 3;

        //when
        int result = 12 + 3;

        //then
        Assertions.assertEquals(15, result);
    }


    */