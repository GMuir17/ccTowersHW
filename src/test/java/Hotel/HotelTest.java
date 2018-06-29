package Hotel;

import Room.RoomType.BedRoomType;
import org.junit.Before;
import org.junit.Test;
import Room.Room;
import Room.RoomType.Bedroom;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room room;

    @Before
    public void setUp() {
        hotel = new Hotel("California", 0);
        Bedroom bedroom = new Bedroom("17", BedRoomType.SINGLE, 20);
        room = (Room) bedroom;
    }

    @Test
    public void hasName() {
        assertEquals("California", hotel.getName());
    }

    @Test
    public void hasVault() {
        assertEquals(0, hotel.getVault());
    }

    @Test
    public void roomListStartsEmpty() {
        assertEquals(0, hotel.numberOfRooms());
    }

    @Test
    public void canAddRoom() {
        hotel.addRoom(room);
        assertEquals(1, hotel.numberOfRooms());
    }



}
