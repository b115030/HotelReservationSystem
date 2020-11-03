import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservation {
    private long numDates;
    Map<String, Integer> hotelNameToCostMap = new HashMap<>();
    private int hotelCost;

    public boolean printWelcome() {
        System.out.println( "Welcome to the hotel reservation system." );
        return true;
    }
    public void getNumOfDatesInRange(String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);
        numDates =  ChronoUnit.DAYS.between(start, end);
        System.out.println ("Days: "+ numDates);
    }

    //this function gives the days (1 for sunday, 2-Mon...) from given date
    public int getDayFromDate(String startDate) throws ParseException {
        Date start = new SimpleDateFormat("dd/MM/yyyy").parse(startDate);
        Calendar c = Calendar.getInstance();
        c.setTime(start);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        return dayOfWeek;
    }

    // calculate total cost for a particular hotel
    public void calculateTotalCost(String startDate, Hotel hotel) throws ParseException {
        int dayOfWeek = getDayFromDate(startDate);
        hotelCost = 0;
        for(int day = 0; day<= numDates; day++) {
            dayOfWeek = day + dayOfWeek;
            System.out.println("Day is: " + dayOfWeek);
            if (dayOfWeek > 7) {
                dayOfWeek = 7;
            }

            if (dayOfWeek == 1 || dayOfWeek == 7) {			// 1 is for Sunday and 7 for Saturday
                hotelCost = hotelCost + hotel.getRegularWeekEndRate();
            } else {
                System.out.println(hotel.getRegularDailyRate());
                hotelCost = hotelCost + hotel.getRegularDailyRate();
            }
        }
        System.out.println("data " + hotel.getHotelName() +" "+ hotelCost);
        hotelNameToCostMap.put(hotel.getHotelName(), hotelCost);
    }
    public String findCheapestHotel(ArrayList<Hotel> hotels ) {
        Hotel hotelName = hotels.stream().min(Comparator.comparing(Hotel::getRegularDailyRate)).orElse(null);
        System.out.println("cheapest hotel is: " +hotelName.getHotelName());
        return hotelName.getHotelName();
    }
    // to find min cost among total cost of all hotels
    public String findCheapestHotelInMap() {
        String hotelName = hotelNameToCostMap.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .get().getKey();
        System.out.println(hotelName);
        return hotelName;
    }

    // returns the name of the hotel with min total cost
    public String findCheapestHotelByDates(String sDate, String eDate, ArrayList<Hotel> hotels) {
        hotels.forEach((hotel) -> {
            try {
                getNumOfDatesInRange(sDate, eDate);
                calculateTotalCost(sDate, hotel);

            } catch (ParseException e) {
                System.out.println("Exception msg: " + e.getMessage());
            }
        });
        String hotelName = findCheapestHotelInMap();
        return hotelName;
    }
}
