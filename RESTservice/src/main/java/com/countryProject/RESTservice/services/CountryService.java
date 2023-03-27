package com.countryProject.RESTservice.services;

import com.countryProject.RESTservice.beans.Country;
import com.countryProject.RESTservice.controllers.AddResponse;
import com.countryProject.RESTservice.repository.CountryRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    // hash map for storing the data with indexing
//    static HashMap<Integer, Country> countryIdMap;


    // inserting values in the hashmap
//    public CountryService(){
//        countryIdMap = new HashMap<Integer, Country>();
//        Country indiaCountry = new Country(1, "India", "New Delhi");
//        Country usaCountry = new Country(2, "USA", "Washington");
//        Country ukCountry = new Country(3, "UK", "London");
//
//        countryIdMap.put(1, indiaCountry);
//        countryIdMap.put(2, usaCountry);
//        countryIdMap.put(3, ukCountry);
//
//    }



    // endpoint
    // It gets all the countries
    public List<Country> getAllCountries(){
//        List countries = new ArrayList(countryIdMap.values());
//
//        return countries;


        return countryRepository.findAll();
    }

    // To get the countries by id
    // It returns the whole object in the countryidmap
    public Country getCountryById(int id)
    {
//        Country country = countryIdMap.get(id);
//        return country;
        return countryRepository.findById(id).get();
    }

    // To get the country by name
    public Country getCountryByName(String countryName)
    {
//        Country country = null;
//        for(int i:countryIdMap.keySet())
//        {
//            if(countryIdMap.get(i).getCountryname().equals(countryName))
//                country = countryIdMap.get(i);
//        }
////        Country country = countryIdMap.get(id);
//        return country;

        // capture all the data
        List<Country> countries = countryRepository.findAll();
        Country country = null;

        // read all individual row in the form of object
        for(Country con:countries){

            // Verifying whether the country name is equal to the countryname searched for or not
            if(con.getCountryname().equalsIgnoreCase(countryName)){
                country = con;
            }
        }
        return country;
    }


    // Adding new country
    // We need to get the max id from the hashmap in order to
    // add a new value after the last inserted
    public Country addCountry(Country country)
    {
//        country.setId(getMaxId());
//        // adding new information to the hash map
//        countryIdMap.put(country.getId(), country);
//        return country;

        // this will set the id
        country.setId(getMaxId());

        // it will save the new country
        countryRepository.save(country);

        return country;
    }


    // Utility function
//    public static int getMaxId()
//    {
//        int max = 0;
//        for(int id: countryIdMap.keySet())
//            if(max<=id)
//                max = id;
//        return max+1;
//    }

    public int getMaxId()
    {
        return countryRepository.findAll().size() + 1;

    }

    // Updating the existing countries

    public Country UpdateCountry(Country country)
    {
        // Checking whether the countryId is in negative
//        if(country.getId()>0){
//            // updating the country on that particular id
//            countryIdMap.put(country.getId(), country);
//        }
//        return country;

        countryRepository.save(country);
        return country;
    }


    // we will require another bean class to display the deleted message
    public AddResponse DeleteCountry(int id)
    {
//        countryIdMap.remove(id);
//        AddResponse rs = new AddResponse();
//        rs.setMsg("country deleted!!!");
//        rs.setId(id);
//
//        return rs;

        countryRepository.deleteById(id);
        AddResponse addResponse = new AddResponse();
        addResponse.setMsg("Country Deleted...");
        addResponse.setId(id);
        return addResponse;
    }

}
