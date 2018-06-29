package Hotel;

import Room.RoomType.BedRoomType;
import Room.RoomType.ConferenceRoom;
import Room.RoomType.DiningRoom;
import Guest.Guest;
import Room.Room;
import org.junit.Before;
import org.junit.Test;
import Room.RoomType.Bedroom;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Hotel hotelWithRooms;
    Bedroom bedroom1;
    Bedroom bedroom2;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        hotel = new Hotel("California", 0);

        hotelWithRooms = new Hotel("Testing Hotel", 0);

        bedroom1 = new Bedroom("17", BedRoomType.SINGLE, 20);

        bedroom2 = new Bedroom("30", BedRoomType.DOUBLE, 50);

        diningRoom = new DiningRoom("The Grill", 2);

        conferenceRoom = new ConferenceRoom("Room1", 1, 20);

        guest1 = new Guest("Jack", 100);
        guest2 = new Guest("Norman", 50);

        hotelWithRooms.addRoom(bedroom1);
        hotelWithRooms.addRoom(bedroom2);
        hotelWithRooms.addRoom(diningRoom);
        hotelWithRooms.addRoom(conferenceRoom);

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
        hotel.addRoom(bedroom1);
        assertEquals(1, hotel.numberOfRooms());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addRoom(diningRoom);
        assertEquals(1, hotel.numberOfRooms());
    }

    @Test
    public void canAddTwoRoomsOfDifferentClasses() {
        hotel.addRoom(bedroom1);
        hotel.addRoom(diningRoom);
        assertEquals(2, hotel.numberOfRooms());
    }

    @Test
    public void checkWhetherSetUpHotelHasRooms() {
        assertEquals(4, hotelWithRooms.numberOfRooms());
    }

    @Test
    public void getIndexOfRoom() {
        assertEquals(0, hotelWithRooms.getRoomIndex(bedroom1));
    }

// maybe a hashmap would be better here, easier to go in and search
}
