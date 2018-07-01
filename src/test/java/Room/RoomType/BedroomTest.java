package Room.RoomType;

import org.junit.Before;
import Guest.Guest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        bedroom = new Bedroom("17", BedRoomType.SINGLE, 20);
        guest1 = new Guest("Jack", 100);
        guest2 = new Guest("Norman", 50);
    }

    @Test
    public void occupantsArrayListStartsEmpty() {
        assertEquals(0, bedroom.numberOfOccupants());
    }

    @Test
    public void canAddGuestToDiningRoom() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.numberOfOccupants());
    }

    @Test
    public void canRemoveGuestRoomIsOccupied() {
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.numberOfOccupants());
    }

    @Test
    public void cannotRemoveGuestWhenRoomIsAlreadyEmpty() {
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.numberOfOccupants());
    }

    @Test
    public void canEmptyRoom() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.emptyRoom();
        assertEquals(0, bedroom.numberOfOccupants());
    }

    @Test
    public void cannotEmptyRoomAlreadyEmpty() {
        bedroom.emptyRoom();
        assertEquals(0, bedroom.numberOfOccupants());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals("17", bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void cannotAddGuestWhenRoomIsFull() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(1, bedroom.numberOfOccupants());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(20, bedroom.getNightlyRate());
    }


}
