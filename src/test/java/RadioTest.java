import junit.extensions.ActiveTestSuite;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import ru.netology.Radio;

public class RadioTest {


    @Test
    public void shouldSetStation(){
        Radio radio = new Radio();
        radio.currentStation = 5;

        int expected = 15;
        int actual = radio.currentStation;


    }

}
