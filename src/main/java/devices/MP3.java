package devices;

public class MP3 implements IConnect{

    public String connect(Stereo stereo) {
        return "I have connected to " + stereo.brandName;
    }
}
