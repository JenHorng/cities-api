package com.github.jenhorng.citiesapi.countries.repositories;

import com.github.jenhorng.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
