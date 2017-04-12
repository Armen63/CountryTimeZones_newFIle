package am.aca.CountryTimeZone.common.model;

import java.util.Comparator;

/**
 * Created by Armen on 4/12/2017.
 */
public class CompareByConutryCode implements Comparator<TimeZone> {
    @Override
    public int compare(TimeZone o1, TimeZone o2) {
        return o1.getCountryCode().compareTo(o2.getCountryCode());
    }
}
