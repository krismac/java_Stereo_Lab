package devices;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapePlayerTest {

    TapePlayer tapeplayer;

    @Before
    public void before() { tapeplayer = new TapePlayer("Bush", "v3000", "Yellow Submarine");}

    @Test
    public void getMake(){
        assertEquals("Bush", tapeplayer.make);
    }
}


