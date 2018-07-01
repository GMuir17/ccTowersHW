package Hotel;

import Guest.Guest;
import Room.Room;

import java.util.*;

public class Hotel {

    private String name;
    private int vault;
    private HashMap<String, Room> roomHash;

    public Hotel(String name, int vault) {
        this.name = name;
        this.vault = vault;
        this.roomHash = new HashMap<String, Room>();
    }

    public String getName() {
        return this.name;
    }

    public int getVault() {
        return this.vault;
    }

    public int numberOfRooms() {
        return this.roomHash.size();
    }

    public void addRoom(String key, Room room) {
        this.roomHash.put(key, room);
    }

    public HashMap getRoomHash() {
        return this.roomHash;
    }

    public Room getRoom(String key) {
        return this.roomHash.get(key);
    }

    public void checkInGuest(Guest guest, String roomKey) {
        Room room = this.roomHash.get(roomKey);
        room.addGuest(guest);
    }

    public void checkOutGuest(Guest guest, String roomKey) {
        Room room = this.roomHash.get(roomKey);
        room.removeGuest(guest);
    }
}
