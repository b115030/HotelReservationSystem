public class Hotel {
    private String hotelName;
    private int regularDailyRate;
    private int regularWeekEndRate;

    Hotel(String hotelName, int regularDailyRate, int regularWeekEndRate) {
        this.hotelName = hotelName;
        this.regularDailyRate = regularDailyRate;
        this.regularWeekEndRate = regularWeekEndRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


    public int getRegularDailyRate() {
        return regularDailyRate;
    }


    public void setRegularDailyRate(int regularDailyRate) {
        this.regularDailyRate = regularDailyRate;
    }

    public int getRegularWeekEndRate() {
        return regularWeekEndRate;
    }


    public void setRegularWeekEndRate(int regularWeekEndRate) {
        this.regularWeekEndRate = regularWeekEndRate;
    }

    @Override
    public String toString() {
        System.out.println("Hotel Name: " + this.hotelName);
        return super.toString();
    }
}
