package devices;

public class Stereo {

    protected String brandName;
    private Radio radio;
    private RecordDeck recordDeck;
    private TapePlayer tapePlayer;
    private int volume;

    public Stereo(String brandName, Radio radio, RecordDeck recordDeck, TapePlayer tapePlayer){
        this.brandName = brandName;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.tapePlayer = tapePlayer;
        this.volume = 5;
    }

    public int getVolume(){
        return this.volume;
    }

    public int setVolume(int volume){
        return this.volume = volume;
    }

}
