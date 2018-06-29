package Room.RoomType;

import org.junit.Before;
import Guest.Guest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom("Room1", 1, 20);
        guest1 = new Guest("Jack", 100);
        guest2 = new Guest("Norman", 50);
    }

    @Test
    public void occupantsArrayListStartsEmpty() {
        assertEquals(0, conferenceRoom.numberOfOccupants());
    }

    @Test
    public void canAddGuestToConferenceRoom() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.numberOfOccupants());
    }

    @Test
    public void canRemoveGuestRoomIsOccupied() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest();
        assertEquals(0, conferenceRoom.numberOfOccupants());
    }

    @Test
    public void cannotRemoveGuestWhenRoomIsAlreadyEmpty() {
        conferenceRoom.removeGuest();
        assertEquals(0, conferenceRoom.numberOfOccupants());
    }

    @Test
    public void canEmptyRoom() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.emptyRoom();
        assertEquals(0, conferenceRoom.numberOfOccupants());
    }

    @Test
    public void cannotEmptyRoomAlreadyEmpty() {
        conferenceRoom.emptyRoom();
        assertEquals(0, conferenceRoom.numberOfOccupants());
    }

    @Test
    public void hasName() {
        assertEquals("Room1", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, conferenceRoom.getCapacity());
    }

    @Test
    public void cannotAddGuestWhenRoomIsFull() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        assertEquals(1, conferenceRoom.numberOfOccupants());
    }

    @Test
    public void hasDailyRate() {
        assertEquals(20, conferenceRoom.getDailyRate());
    }



}
