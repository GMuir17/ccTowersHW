package Room.RoomType;

import Room.Room;
import Guest.Guest;

public class ConferenceRoom extends Room {

    private String name;
    private int capacity;
    private int dailyRate;

    public ConferenceRoom(String name, int capacity, int dailyRate) {
        super();
        this.name = name;
        this.capacity = capacity;
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return this.name;
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

    public int getDailyRate() {
        return this.dailyRate;
    }
}
