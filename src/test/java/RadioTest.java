import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {


    @Test
    public void shouldSetStationWithinLimit(){
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getCurrentStation());

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUnderLimit(){
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation() - 1);

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveLimit(){
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() + 1);

        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationWithinLimit(){
        Radio radio = new Radio();
        int currentStation = radio.getCurrentStation();

        radio.setNextStation();

        int expected = currentStation + 1;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAboveLimit(){
        Radio radio = new Radio(1000);
        radio.setCurrentStation(radio.getMaxStation() + 1);
        radio.setNextStation();

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationUnderLimit() {
        Radio radio = new Radio(1000);
        radio.setCurrentStation(radio.getMinStation() - 1);
        radio.setPrevStation();

        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationWithinLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setPrevStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeWithinLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeAboveLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume() + 1);

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume() - 1);

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheVolume() {
        Radio radio = new Radio();
        int currentVolume = radio.getCurrentVolume();
        radio.increaseVolume();

        int expected = currentVolume + 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.reduceVolume();

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnDownTheVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void verifyQuantityStation() {
        Radio radio = new Radio(15);

        Assertions.assertEquals(15, radio.getQuantityStation());

    }
}
