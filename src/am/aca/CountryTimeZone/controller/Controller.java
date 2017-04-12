package am.aca.CountryTimeZone.controller;

import am.aca.CountryTimeZone.common.model.*;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Armen on 4/12/2017.
 */
public class Controller{
    final static String zonePath = "C:\\Users\\Armen\\IdeaProjects\\CountryTimeZones\\src\\am\\aca\\CountryTimeZone\\resource\\zone.csv";
    final static String countriesPath = "C:\\Users\\Armen\\IdeaProjects\\CountryTimeZones\\src\\am\\aca\\CountryTimeZone\\resource\\countries.csv";
    public void execute() throws IOException {
        FileReader timeZonesFromFile = new FileReader(zonePath);
        BufferedReader fileReader = new BufferedReader(timeZonesFromFile);
        String tempString;
        List<TimeZone> timeZones = new ArrayList<>();
        int i = 0;
        while ((tempString = fileReader.readLine()) != null) {
            tempString = tempString.replace('"', ' ');
            tempString = tempString.replaceAll("\\s+","");
            String[] getLineFromFile = tempString.split(",");
            timeZones.add(i, new TimeZone());

            timeZones.get(i).setID(getLineFromFile[0]);
            timeZones.get(i).setCountryCode(getLineFromFile[1]);
            timeZones.get(i).setTimeZone(getLineFromFile[2]);

            i += 1;
        }
        timeZonesFromFile.close();


        FileReader countriesFromFile = new FileReader(countriesPath);
        fileReader = new BufferedReader(countriesFromFile);
        String myLine;
        List<Country> countries = new ArrayList<>();
        i = 0;
        while ((myLine = fileReader.readLine()) != null) {
            String [] celiTox = myLine.split(",");
            countries.add(i, new Country());

            countries.get(i).setId(i+1);
            countries.get(i).setCountryCode(celiTox[0]);
            countries.get(i).setEnglishName(celiTox[1]);
            countries.get(i).setFranchName(celiTox[2]);

            i += 1;
        }
        countriesFromFile.close();
        FileWriter f0 = new FileWriter("C:\\Users\\Armen\\IdeaProjects\\CountryTimeZones\\src\\am\\aca\\CountryTimeZone\\resource\\countryTimeZone.csv");
        String newLine = System.getProperty("line.separator");
        for(Country c: countries){
            for(TimeZone tz:timeZones){
                if(c.getCountryCode().equals(tz.getCountryCode())){
                    c.setTimZone(tz.getTimeZone());
                    System.out.println(c);
                    f0.write(c + newLine);
                }
            }
        }
        f0.close();

    }
}





/* for(Country country: countries){
            System.out.println(country.getCountryCode());
        }

        for(TimeZone timeZone: timeZones){
            System.out.println(timeZone.getCountryCode());
        }*/