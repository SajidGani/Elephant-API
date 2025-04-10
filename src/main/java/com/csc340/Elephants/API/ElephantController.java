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

    // View all elephants
    @GetMapping("/view")
    public String viewAllElephants(Model model) {
        List<Elephant> elephants = elephantService.getAllElephants();
        model.addAttribute("elephants", elephants);
        return "view-elephants";
    }

    @GetMapping("/add-elephant")
    public String showAddElephantForm() {
        return "add-elephant";
    }

    @PostMapping
    public String addElephant(@ModelAttribute Elephant elephant) {
        elephantService.saveElephant(elephant);
        return "redirect:/elephants/view";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Integer id, Model model) {
        System.out.println("Fetching elephant with ID: " + id);
        Elephant elephant = elephantService.getElephantById(id).orElse(null);

        if (elephant != null) {
            model.addAttribute("elephant", elephant);
            System.out.println("Found Elephant: " + elephant);
            return "update-elephant";
        } else {
            System.out.println("Elephant not found with ID: " + id);
            return "redirect:/elephants/view";
        }
    }

    @PostMapping("/update/{id}")
    public String updateElephant(@PathVariable Integer id, @ModelAttribute Elephant elephant) {
        System.out.println("Updating elephant with ID: " + id);
        elephant.setId(id);
        elephantService.saveElephant(elephant);
        return "redirect:/elephants/view";
    }


    @GetMapping("/delete/{id}")
    public String deleteElephant(@PathVariable Integer id) {
        elephantService.deleteElephant(id);
        return "redirect:/elephants/view";
    }
}
