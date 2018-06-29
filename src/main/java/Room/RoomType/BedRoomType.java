package Room.RoomType;

public enum BedRoomType {
    SINGLE(1),
    DOUBLE(2),
    SUITE(4);

    private final int capacity;

    BedRoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacityFromType() {
        return this.capacity;
    }
}
