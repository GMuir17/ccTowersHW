package Hotel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void setUp() {
        hotel = new Hotel("California", 0);
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

}
