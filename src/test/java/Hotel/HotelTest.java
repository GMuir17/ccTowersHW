package Hotel;

import Room.RoomType.BedRoomType;
import Room.RoomType.ConferenceRoom;
import Room.RoomType.DiningRoom;
import Guest.Guest;
import Room.Room;
import org.junit.Before;
import org.junit.Test;
import Room.RoomType.Bedroom;

import java.util.ArrayList;
import java.util.HashMap;

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

        hotelWithRooms.addRoom("bedroom1", bedroom1);
        hotelWithRooms.addRoom("bedroom2", bedroom2);
        hotelWithRooms.addRoom("diningRoom", diningRoom);
        hotelWithRooms.addRoom("conferenceRoom", conferenceRoom);

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
    public void roomHashStartsEmpty() {
        assertEquals(0, hotel.numberOfRooms());
    }

    @Test
    public void canAddBedRoom() {
        hotel.addRoom("bedroom1", bedroom1);
        assertEquals(1, hotel.numberOfRooms());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addRoom("diningRoom", diningRoom);
        assertEquals(1, hotel.numberOfRooms());
    }

    @Test
    public void canAddTwoRoomsOfDifferentClasses() {
        hotel.addRoom("bedroom1", bedroom1);
        hotel.addRoom("diningRoom", diningRoom);
        assertEquals(2, hotel.numberOfRooms());
    }

    @Test
    public void checkWhetherSetUpHotelHasRooms() {
        assertEquals(4, hotelWithRooms.numberOfRooms());
    }

    @Test
    public void hasHashMap() {
        HashMap hash = hotelWithRooms.getRoomHash();
        assertEquals(4, hash.size());
    }

    @Test
    public void canGetRoomCapacityFromHashMap() {
        Room room = hotelWithRooms.getRoom("diningRoom");
        DiningRoom diner = (DiningRoom) room;
        assertEquals(2, ((DiningRoom) room).getCapacity());
    }

    @Test
    public void canGetBedRoomCapacity() {
        Room room = hotelWithRooms.getRoom("bedroom1");
        Bedroom single = (Bedroom) room;
        assertEquals(1, single.getCapacity());
    }

    @Test
    public void canCheckInGuests() {
        hotelWithRooms.checkInGuest(guest1, "bedroom1");
        Room room = hotelWithRooms.getRoom("bedroom1");
        Bedroom single = (Bedroom) room;
        assertEquals(1, single.numberOfOccupants());
    }

    @Test
    public void canCheckInGuestsAgain() {
        hotelWithRooms.checkInGuest(guest1, "bedroom2");
        Room room = hotelWithRooms.getRoom("bedroom2");
        Bedroom doubleRoom = (Bedroom) room;
        assertEquals(1, doubleRoom.numberOfOccupants());
    }

    @Test
    public void canCheckOutGuests() {
        hotelWithRooms.checkInGuest(guest1, "bedroom1");
        hotelWithRooms.checkOutGuest(guest1, "bedroom1");
        Room room = hotelWithRooms.getRoom("bedroom2");
        Bedroom doubleRoom = (Bedroom) room;
        assertEquals(0, doubleRoom.numberOfOccupants());
    }

    @Test
    public void cannotCheckInGuestWhenRoomIsFull() {
        hotelWithRooms.checkInGuest(guest1, "bedroom1");
        hotelWithRooms.checkInGuest(guest2, "bedroom1");
        Room room = hotelWithRooms.getRoom("bedroom1");
        Bedroom single = (Bedroom) room;
        assertEquals(1, single.numberOfOccupants());
    }

    @Test
    public void canGetAListOfGuestsCheckedIntoARoom() {
        hotelWithRooms.checkInGuest(guest1, "bedroom2");
        hotelWithRooms.checkInGuest(guest2, "bedroom2");
        ArrayList guestList = hotelWithRooms.getGuestList("bedroom2");
        assertEquals(2, guestList.size());
    }

    @Test
    public void canGetAGuestListEvenWhenRoomIsEmpty() {
        ArrayList guestList = hotelWithRooms.getGuestList("bedroom2");
        assertEquals(0, guestList.size());
    }

}
