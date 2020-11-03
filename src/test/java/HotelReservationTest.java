import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    @Test
    public void shouldPrintWelcomeMsg()
    {
        Hotel hotel = new Hotel();
        boolean welcome = hotel.printWelcome();
        Assert.assertEquals(true, welcome);
    }
}
