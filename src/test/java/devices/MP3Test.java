package devices;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    private Stereo stereo;
    private Radio radio;
    private RecordDeck recordDeck;
    private TapePlayer tapePlayer;
    private MP3 mp3;


    @Before
    public void before(){
        radio = new Radio ("Panasonic", "P4000", "Firestarter", 252);
        tapePlayer = new TapePlayer("Bush", "v3000", "Yellow Submarine");
        recordDeck = new RecordDeck("Panasonic", "P4000", "Firestarter", 75);
        stereo = new Stereo("JVC", radio, recordDeck, tapePlayer);
        mp3 = new MP3();
    }

    @Test
    public void canConnect(){
        assertEquals("I have connected to JVC", mp3.connect(stereo));
    }

}
