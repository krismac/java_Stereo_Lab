package devices;

public class Radio  extends Component{

    //instance
    private int station;

    //constructor
    public Radio (String make, String model, String song, int station){
        super(make, model, song);
        this.station = station;
    }

    //methods

    public int getStation(){
        return this.station;
    }


}
