package devices;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private Radio radio;
    private RecordDeck recordDeck;
    private TapePlayer tapePlayer;

    @Before
    public void before(){
        radio = new Radio ("Panasonic", "P4000", "Firestarter", 252);
        tapePlayer = new TapePlayer("Bush", "v3000", "Yellow Submarine");
        recordDeck = new RecordDeck("Panasonic", "P4000", "Firestarter", 75);
        stereo = new Stereo("JVC", radio, recordDeck, tapePlayer);
    }

    @Test
    public void canGetVolume(){
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void canSetVolume(){
        stereo.setVolume(10);
        assertEquals(10, stereo.getVolume());
    }

    @Test
    public void getMake(){
        assertEquals("Bush", tapePlayer.make);
    }

    @Test
    public void hasRadioSong(){
        assertEquals("Firestarter", radio.song);
    }

    @Test
    public void hasStation(){
        assertEquals(252, radio.getStation());
    }

    @Test
    public void hasRecordDeckSong(){
        assertEquals("Firestarter", recordDeck.song);
    }

    @Test
    public void hasRPM(){
        assertEquals(75, recordDeck.getRpm());
    }
}
