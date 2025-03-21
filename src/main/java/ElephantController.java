import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/elephants")
public class ElephantController {

    private final ElephantService elephantService;

    public ElephantController(ElephantService elephantService) {
        this.elephantService = elephantService;
    }

    @GetMapping
    public List<Elephant> getAllElephants() {
        return elephantService.getAllElephants();
    }

    @PostMapping
    public Elephant addElephant(@RequestBody Elephant elephant) {
        return elephantService.saveElephant(elephant);
    }

    @GetMapping("/{id}")
    public Optional<Elephant> getElephantById(@PathVariable Integer id) {
        return elephantService.getElephantById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteElephant(@PathVariable Integer id) {
        elephantService.deleteElephant(id);
    }
}
