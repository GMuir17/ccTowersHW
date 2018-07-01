package Hotel;

import Room.Room;

import java.util.*;

public class Hotel {

    private String name;
    private int vault;
    private ArrayList<Room> roomList;
    private HashMap<String, Room> roomHash;

    public Hotel(String name, int vault) {
        this.name = name;
        this.vault = vault;
        this.roomList = new ArrayList<Room>();
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

    public void addRoom(Room room) {
        this.roomList.add(room);
    }

    public int getRoomIndex(Room room) {
        return roomList.indexOf(room);
    }


//maybe a hashmap would be better for roomList??





}
