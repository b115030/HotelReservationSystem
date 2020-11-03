import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class HotelReservation {
    public boolean printWelcome() {
        System.out.println( "Welcome to the hotel reservation system." );
        return true;
    }
    //this function gives the days (1 for sunday, 2-Mon...) from given date
    public int getDayFromDate(Date givenDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(givenDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        return dayOfWeek;
    }

    public String findCheapestHotel(ArrayList<Hotel> hotels ) {
        Hotel hotelName = hotels.stream().min(Comparator.comparing(Hotel::getRegularDailyRate)).orElse(null);
        System.out.println("cheapest hotel is: " +hotelName.getHotelName());
        return hotelName.getHotelName();
    }
}
