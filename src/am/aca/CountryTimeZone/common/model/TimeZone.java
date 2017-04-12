package am.aca.CountryTimeZone.common.model;

/**
 * Created by Armen on 4/12/2017.
 */
public class TimeZone {
    private String ID;
    private String countryCode;
    private String timeZone;

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "TimeZone{" +
                "ID='" + ID + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }

    public TimeZone() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

}

