package Room;

import java.util.ArrayList;
import Guest.Guest;

public abstract class Room {

    private ArrayList<Guest> occupants;

    public Room() {
        this.occupants = new ArrayList<>();
    }

    public ArrayList<Guest> getOccupants() {
        return this.occupants;
    }




}
