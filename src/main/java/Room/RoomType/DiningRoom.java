package Room.RoomType;

import Guest.Guest;
import Room.Room;

import java.util.ArrayList;

public class DiningRoom extends Room {

    public DiningRoom() {
        super();
    }

    public int numberOfOccupants() {
        return getOccupants().size();
    }



}
