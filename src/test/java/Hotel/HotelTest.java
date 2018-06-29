package Hotel;

import Room.RoomType.BedRoomType;
import Room.RoomType.DiningRoom;
import org.junit.Before;
import org.junit.Test;
import Room.Room;
import Room.RoomType.Bedroom;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    DiningRoom diningRoom;

    @Before
    public void setUp() {
        hotel = new Hotel("California", 0);
        bedroom = new Bedroom("17", BedRoomType.SINGLE, 20);
        diningRoom = new DiningRoom("The Grill", 2);
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
    public void canAddBedRoom() {
        hotel.addRoom(bedroom);
        assertEquals(1, hotel.numberOfRooms());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addRoom(diningRoom);
        assertEquals(1, hotel.numberOfRooms());
    }

    @Test
    public void canAddTwoRoomsOfDifferentClasses() {
        hotel.addRoom(bedroom);
        hotel.addRoom(diningRoom);
        assertEquals(2, hotel.numberOfRooms());
    }


}
