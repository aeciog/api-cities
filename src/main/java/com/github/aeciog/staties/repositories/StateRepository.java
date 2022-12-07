package com.github.aeciog.staties.repositories;

import com.github.aeciog.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
