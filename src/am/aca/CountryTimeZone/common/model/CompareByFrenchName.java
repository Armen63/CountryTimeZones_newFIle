package am.aca.CountryTimeZone.common.model;

import java.util.Comparator;

/**
 * Created by Armen on 4/10/2017.
 */
public class CompareByFrenchName implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        return o1.getFranchName().compareTo(o2.getFranchName());
    }
}
