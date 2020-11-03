import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {
    Hotel hotel1 = new Hotel("LakeWood", 110);
    Hotel hotel2 = new Hotel("Bridgewood", 160);
    Hotel hotel3 = new Hotel("Ridgewood.", 220);
    HotelReservation hotelReservation = null;

    @Before
    public void initialize() {
        hotelReservation = new HotelReservation();
    }

    @Test
    public void shouldPrintWelcomeMsg() {
        boolean welcome = hotelReservation.printWelcome();
        Assert.assertEquals(true, welcome);
    }
}
