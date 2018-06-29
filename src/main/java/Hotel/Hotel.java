package Hotel;

import Room.Room;

import java.util.HashMap;

public class Hotel {

    private String name;
    private int vault;
    private HashMap<String, Room> roomList;

    public Hotel(String name, int vault) {
        this.name = name;
        this.vault = vault;
        this.roomList = new HashMap<String, Room>();
    }

    public String getName() {
        return this.name;
    }

    public int getVault() {
        return this.vault;
    }


    public int numberOfRooms() {
        return this.roomList.size();
    }
}
