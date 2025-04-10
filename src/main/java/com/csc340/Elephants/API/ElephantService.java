package com.csc340.Elephants.API;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@Service
public class ElephantService {

    private ElephantRepository elephantRepository;

    // Constructor Injection (Recommended)
    @Autowired
    public ElephantService(ElephantRepository elephantRepository) {
        this.elephantRepository = elephantRepository;
    }

    public List<Elephant> getAllElephants() {
        List<Elephant> elephants = elephantRepository.findAll();
        System.out.println("Fetched elephants: " + elephants);  // Log output
        return elephants;
    }

    public Optional<Elephant> getElephantById(int id) {
        return elephantRepository.findById(id);  // ✅ Correct usage
    }

    public Elephant saveElephant(Elephant elephant) {
        return elephantRepository.save(elephant);  // ✅ Correct usage
    }

    public void deleteElephant(Integer id) {
        elephantRepository.deleteById(id);  // ✅ Correct usage
    }
}
