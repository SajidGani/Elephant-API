import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ElephantRepository extends JpaRepository<Elephant, Integer> {
}
