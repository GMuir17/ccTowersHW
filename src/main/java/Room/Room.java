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

    public int numberOfOccupants() {
        return getOccupants().size();
    }

    public void addGuest(Guest guest) {
        occupants.add(guest);
    }

    public void removeGuest() {
        if (occupants.size() > 0) {
            occupants.remove(0);
        }
    }

    public void emptyRoom() {
        occupants.clear();
    }
}
