package am.aca.CountryTimeZone.common.model;

/**
 * Created by Armen on 4/12/2017.
 */
public class Country {
    private Integer id;
    private String countryCode;
    private String englishName;
    private String franchName;
    private String timZone;

    public String getTimZone() {
        return timZone;
    }

    public void setTimZone(String timZone) {
        this.timZone = timZone;
    }

    public Country(Integer id, String countryCode, String englishName, String frenchName) {
        this.id = id;
        this.countryCode = countryCode;
        this.englishName = englishName;
        this.franchName = frenchName;
    }

    public Country(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getFranchName() {
        return franchName;
    }

    public void setFranchName(String frenchName) {
        this.franchName = frenchName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryCode='" + countryCode + '\'' +
                ", englishName='" + englishName + '\'' +
                ",                  timZone='" + timZone + '\'' +
                '}';
    }

}

