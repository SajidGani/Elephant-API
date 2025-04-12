package com.csc340.Elephants.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
@RequestMapping("/elephants")
public class ElephantController {

    @Autowired
    private ElephantService elephantService;

    @GetMapping("/all")
    public String viewAllElephants(Model model) {
        List<Elephant> elephants = elephantService.getAllElephants();
        model.addAttribute("elephants", elephants);
        return "view-elephants";
    }

    @GetMapping("/add-elephant")
    public String showAddElephantForm() {
        return "add-elephant";
    }

    @PostMapping("/add-elephant")
    public String addElephant(@ModelAttribute Elephant elephant) {
        elephantService.saveElephant(elephant);
        return "redirect:/elephants/all";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable int id, Model model) {
        Elephant elephant = elephantService.getElephantById(id).orElse(null);

        if (elephant != null) {
            model.addAttribute("elephant", elephant);
            return "redirect:/elephants/update";
        } else {
            return "redirect:/elephants/all";
        }
    }

    @PostMapping("/update/{id}")
    public String updateElephant(@PathVariable Integer id, @ModelAttribute Elephant elephant) {
        Elephant updatedElephant = elephantService.updateElephant(id, elephant);

        if (updatedElephant != null) {
            System.out.println("Updated Elephant Data: " + updatedElephant);
            return "redirect:/elephants/all";
        } else {
            System.out.println("Elephant not found with ID: " + id);
            return "redirect:/elephants/all";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteElephant(@PathVariable Integer id) {
        elephantService.deleteElephant(id);
        return "redirect:/elephants/all";
    }
}
