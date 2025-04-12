package com.csc340.Elephants.API;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@Service
public class ElephantService {

    private ElephantRepository elephantRepository;

    @Autowired
    public ElephantService(ElephantRepository elephantRepository) {
        this.elephantRepository = elephantRepository;
    }

    public List<Elephant> getAllElephants() {
        List<Elephant> elephants = elephantRepository.findAll();
        return elephantRepository.findAll();
    }

    public Optional<Elephant> getElephantById(int id) {
        return elephantRepository.findById(id);
    }

    public Elephant saveElephant(Elephant elephant) {
        return elephantRepository.save(elephant);
    }

    public Elephant updateElephant(Integer id, Elephant elephant) {
        if (elephantRepository.existsById(id)) {
            elephant.setId(id);
            return elephantRepository.save(elephant);
        }
        return null;
    }

        public void deleteElephant(Integer id) {
        elephantRepository.deleteById(id);
    }
}
