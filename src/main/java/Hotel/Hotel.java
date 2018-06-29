package Hotel;

import Room.Room;

import java.util.*;

public class Hotel {

    private String name;
    private int vault;
    private List<Room> roomList;

    public Hotel(String name, int vault) {
        this.name = name;
        this.vault = vault;
        this.roomList = new ArrayList<Room>();
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

    public void addRoom(Room room) {
        this.roomList.add(room);
    }









}
