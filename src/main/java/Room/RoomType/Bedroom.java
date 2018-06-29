package Room.RoomType;

import Room.Room;
import Guest.Guest;

public class Bedroom extends Room {

    private String roomNumber;
    private int capacity;

    public Bedroom(String roomNumber, int capacity) {
        super();
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void addGuest(Guest guest) {
        if (this.numberOfOccupants() < capacity) {
            this.getOccupants().add(guest);
        }
    }

}
