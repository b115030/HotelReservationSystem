public class Hotel {
    private String hotelName;
    private int regularDailyRate;
    private int regularWeekEndRate;
    private int ratings;
    private int specialDailyRate;
    private int specialWeekEndRate;

    Hotel(String hotelName, int regularDailyRate, int regularWeekEndRate,int ratings,int specialDailyRate, int specialWeekEndRate) {
        this.hotelName = hotelName;
        this.regularDailyRate = regularDailyRate;
        this.regularWeekEndRate = regularWeekEndRate;
        this.ratings = ratings;
        this.specialDailyRate = specialDailyRate;
        this.specialWeekEndRate = specialWeekEndRate;
    }
    public int getSpecialDailyRate() {
        return specialDailyRate;
    }


    public void setSpecialDailyRate(int specialDailyRate) {
        this.specialDailyRate = specialDailyRate;
    }


    public int getSpecialWeekEndRate() {
        return specialWeekEndRate;
    }


    public void setSpecialWeekEndRate(int specialWeekEndRate) {
        this.specialWeekEndRate = specialWeekEndRate;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
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
