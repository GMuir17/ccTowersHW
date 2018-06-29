package Room.RoomType;

import org.junit.Before;
import Guest.Guest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom("Nuovo Vesuvio", 1);
        guest1 = new Guest("Jack", 100);
        guest2 = new Guest("Norman", 50);
    }

    @Test
    public void occupantsArrayListStartsEmpty() {
        assertEquals(0, diningRoom.numberOfOccupants());
    }

    @Test
    public void canAddGuestToDiningRoom() {
        diningRoom.addGuest(guest1);
        assertEquals(1, diningRoom.numberOfOccupants());
    }

    @Test
    public void canRemoveGuestRoomIsOccupied() {
        diningRoom.addGuest(guest1);
        diningRoom.removeGuest();
        assertEquals(0, diningRoom.numberOfOccupants());
    }

    @Test
    public void cannotRemoveGuestWhenRoomIsAlreadyEmpty() {
        diningRoom.removeGuest();
        assertEquals(0, diningRoom.numberOfOccupants());
    }

    @Test
    public void canEmptyRoom() {
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        diningRoom.emptyRoom();
        assertEquals(0, diningRoom.numberOfOccupants());
    }

    @Test
    public void cannotEmptyRoomAlreadyEmpty() {
        diningRoom.emptyRoom();
        assertEquals(0, diningRoom.numberOfOccupants());
    }

    @Test
    public void hasName() {
        assertEquals("Nuovo Vesuvio", diningRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, diningRoom.getCapacity());
    }

    @Test
    public void cannotAddGuestWhenRoomIsFull() {
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        assertEquals(1, diningRoom.numberOfOccupants());
    }




}
