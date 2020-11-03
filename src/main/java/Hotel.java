public class Hotel {
    private String hotelName;
    private int regularDailyRate;

    Hotel(String hotelName, int regularDailyRate) {
        this.hotelName = hotelName;
        this.regularDailyRate = regularDailyRate;
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

    @Override
    public String toString() {
        System.out.println("Hotel Name: " + this.hotelName);
        return super.toString();
    }
}
