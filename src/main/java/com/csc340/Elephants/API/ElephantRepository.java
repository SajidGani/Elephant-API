package com.csc340.Elephants.API;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ElephantRepository extends JpaRepository<Elephant, Integer> {
}
