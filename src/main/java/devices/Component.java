package devices;

public abstract class Component {

    //instance
    protected String make;
    protected String model;
    protected String song;

    //constructor
    //Make
    //Model

    public Component(String make, String model, String song) {
        this.make = make;
        this.model = model;
        this.song = song;
    }

    //methods
    //create PlaySong
    public String getPlaySong() {
    return this.song;
    }
}