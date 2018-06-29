package Room.RoomType;

import org.junit.Before;
import java.util.ArrayList;
import Guest.Guest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom();
    }

    @Test
    public void occupantsArrayListStartsEmpty() {
        assertEquals(0, diningRoom.numberOfOccupants());
    }


}
