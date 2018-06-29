package Room.RoomType;

import org.junit.Before;
import java.util.ArrayList;
import Guest.Guest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom();
        guest = new Guest("Jack", 100);
    }

    @Test
    public void occupantsArrayListStartsEmpty() {
        assertEquals(0, diningRoom.numberOfOccupants());
    }

    @Test
    public void canAddGuestToDiningRoom() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.numberOfOccupants());
    }


}
