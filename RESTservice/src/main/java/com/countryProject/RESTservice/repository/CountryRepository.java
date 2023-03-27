package com.countryProject.RESTservice.repository;

import com.countryProject.RESTservice.beans.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {


}
