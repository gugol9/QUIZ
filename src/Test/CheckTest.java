package Test;
import com.company.Check;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckTest {


    @Test
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

   /* public void analyzeCheckReturnTure() {

       //given
        Boolean user_answer = true;
        Boolean true_answer = true ;
        Check checker = new Check();

        //when
      // checker.analyzeCheckReturnTure(user_answer, true_answer);
    }

    */
}


