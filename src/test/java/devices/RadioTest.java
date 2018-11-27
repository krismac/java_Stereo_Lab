package devices;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class RadioTest {

        Radio radio;

        @Before
        public void before(){
            radio = new Radio ("Panasonic", "P4000", "Firestarter", 252);
        }

        @Test
        public void hasSong(){
            assertEquals("Firestarter", radio.song);
        }

        @Test
        public void hasStation(){
            assertEquals(252, radio.getStation());
        }
    }
