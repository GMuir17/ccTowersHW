package Room.RoomType;

import Room.Room;

public class DiningRoom extends Room {

    private String name;

    public DiningRoom(String name) {
        super();
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
}
