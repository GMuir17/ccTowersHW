package Room.RoomType;

import Room.Room;
import Guest.Guest;

public class Bedroom extends Room {

    private String roomNumber;
    private int capacity;
    private int nightlyRate;

    public Bedroom(String roomNumber, int capacity, int nightlyRate) {
        super();
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
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

    public int getNightlyRate() {
        return this.nightlyRate;
    }
}
