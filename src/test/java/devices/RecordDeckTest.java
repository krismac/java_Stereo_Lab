package devices;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Panasonic", "P4000", "Firestarter", 75);
    }

    @Test
    public void hasSong(){
        assertEquals("Firestarter", recordDeck.song);
    }

    @Test
    public void hasRPM(){
        assertEquals(75, recordDeck.getRpm());
    }


}
