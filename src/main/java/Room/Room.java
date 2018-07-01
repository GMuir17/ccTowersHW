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
        this.occupants.add(guest);
    }

    public int getGuestIndex(Guest guest) {
        return this.occupants.indexOf(guest);
    }

    public void removeGuest(Guest guest) {
        int index = getGuestIndex(guest);
        if (this.occupants.size() > 0) {
            this.occupants.remove(index);
        }
    }

    public void emptyRoom() {
        this.occupants.clear();
    }
}
