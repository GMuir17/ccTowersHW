package Guest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp() {
        guest = new Guest("Jack", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Jack", guest.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(100, guest.getWallet());
    }

    @Test
    public void canAddToWallet() {
        guest.addToWallet(10);
        assertEquals(110, guest.getWallet());
    }

    @Test
    public void canTakeFromWallet() {
        guest.takeFromWallet(10);
        assertEquals(90, guest.getWallet());
    }








}
