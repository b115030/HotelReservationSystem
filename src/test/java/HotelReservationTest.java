import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class HotelReservationTest {
    Hotel hotel1 = new Hotel("LakeWood",110, 90,3);
    Hotel hotel2 = new Hotel("Bridgewood",150, 150,4);
    Hotel hotel3 = new Hotel("Ridgewood.",220, 150,5);
    HotelReservation hotelReservation = null;
    ArrayList<Hotel> hotelList;

    @Before
    public void initialize() {
        hotelReservation = new HotelReservation();
        hotelList = new ArrayList<>();
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
    }

    @Test
    public void shouldPrintWelcomeMsg() {
        boolean welcome = hotelReservation.printWelcome();
        Assert.assertEquals(true, welcome);
    }

    @Test
    public void shouldReturnLakeWood_whenAllRegularWeekdays() {
        String hotelName = hotelReservation.findCheapestHotel(hotelList);
        Assert.assertEquals("LakeWood", hotelName);
    }
    @Test
    public void shouldReturnLakeWood_whenAllRegularDays() {
        String startDate = "03/11/2020";
        String endDate = "04/11/2020";
        String hotelName = hotelReservation.findCheapestHotelByDates(startDate, endDate, hotelList);
        Assert.assertEquals("LakeWood", hotelName);
    }
}
