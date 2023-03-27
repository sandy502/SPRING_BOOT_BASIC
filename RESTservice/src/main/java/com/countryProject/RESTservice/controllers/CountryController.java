package com.countryProject.RESTservice.controllers;


import com.countryProject.RESTservice.beans.Country;
import com.countryProject.RESTservice.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CountryController {

    @Autowired
    CountryService countryservice;


    // mapping the get all countries.
    // it will return all the countries to the user.
    @GetMapping("/getcountries")
    public List<Country> getCountries(){
       return countryservice.getAllCountries();
    }
//    @GetMapping("/getcountries/{id}")
//    public Country getCountrybyId(@PathVariable (value = "id") int id){
//
////        return countryservice.getCountryById(id);
//
//        try{
//
//            // here we are getting the whole data and storing in country object
//            Country country = countryservice.getCountryById(id);
//            // we are also returning the http response code
//            return new ResponseEntity<Country>(country, HttpStatus.OK);
//        }
//        catch()
//        {
//
//        }
//        return countryservice.getCountryById(id);
//    }

    @GetMapping("/getcountries/{id}")
    public ResponseEntity<Country> getCountrybyId(@PathVariable (value = "id") int id){

        try{

            // here we are getting the whole data and storing in country object
            Country country = countryservice.getCountryById(id);
            // we are also returning the http response code
            return new ResponseEntity<Country>(country, HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
//
//    @GetMapping("/getcountries/countryname")
//    public Country getCountrybyName(@RequestParam (value = "name") String countryname){
//        return countryservice.getCountryByName(countryname);
//    }

    @GetMapping("/getcountries/countryname")
    public ResponseEntity<Country> getCountrybyName(@RequestParam (value = "name") String countryname){

        try{

            // here we are getting the whole data and storing in country object
            Country country = countryservice.getCountryByName(countryname);
            // we are also returning the http response code
            return new ResponseEntity<Country>(country, HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


//    @PostMapping("/addcountry")
//    public Country addCountry(@RequestBody Country country){
//        return countryservice.addCountry(country);
//    }

    @PostMapping("/addcountry")
    public Country addCountry(@RequestBody Country country){
        return countryservice.addCountry(country);
    }
//    @PutMapping("/update")
//    public Country updateCountry(@RequestBody Country country){
//        return countryservice.UpdateCountry(country);
//    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Country> updateCountry(@PathVariable(value = "id") int id, @RequestBody Country country){

        try {
            // We are getting the data to be updated from the country id and storing in the variable if it exists
            Country existcountry = countryservice.getCountryById(id);

            // we are getting the countryname from the country object in the parameter mentioned above
            // and setting the countryname in the existing country we had
            existcountry.setCountryname(country.getCountryname());
            existcountry.setCountrycapital(country.getCountrycapital());
            Country updated_country = countryservice.UpdateCountry(existcountry);
            return new ResponseEntity<Country>(updated_country, HttpStatus.OK);

        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
//    @DeleteMapping("/delete/{id}")
//    public AddResponse deleteCountry(@PathVariable (value = "id") int id){
//        return countryservice.DeleteCountry(id);
//    }

    @DeleteMapping("/delete/{id}")
    public AddResponse deleteCountry(@PathVariable (value = "id") int id){
        return countryservice.DeleteCountry(id);
    }
}
