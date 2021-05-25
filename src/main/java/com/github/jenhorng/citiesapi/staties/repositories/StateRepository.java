package com.github.jenhorng.citiesapi.states.repositories;

import com.github.jenhorng.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
