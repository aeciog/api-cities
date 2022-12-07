package com.github.aeciog.countries.repositories;

import com.github.aeciog.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
