package Room;

import java.util.ArrayList;
import Guest.Guest;

public abstract class Room {

    private ArrayList<Guest> occupants;

    public Room(ArrayList<Guest> occupants) {
        this.occupants = occupants;
    }




}
