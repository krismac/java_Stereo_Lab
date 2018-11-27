package devices;

public class RecordDeck extends Component{

    //instance
    private int rpm;

    //constructor
    public RecordDeck(String make, String model, String song, int rpm){

        super(make, model, song);
        this.rpm = rpm;
    }

    //methods

    public int getRpm(){
        return this.rpm;
    }


}
