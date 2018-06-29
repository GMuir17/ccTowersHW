package Room.RoomType;

import Room.Room;
import Guest.Guest;

public class Bedroom extends Room {

    private String roomNumber;
    private BedRoomType type;
    private int nightlyRate;

    public Bedroom(String roomNumber, BedRoomType type, int nightlyRate) {
        super();
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.type.getCapacityFromType();
    }

    @Override
    public void addGuest(Guest guest) {
        int capacity = this.type.getCapacityFromType();
        if (this.numberOfOccupants() < capacity) {
            this.getOccupants().add(guest);
        }
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }
}
