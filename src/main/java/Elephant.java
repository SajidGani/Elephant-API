import jakarta.persistence.*;

@Entity
@Table(name = "elephant_info")

public class Elephant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    private int age;

    private String breed;
    private String description;
    private java.util.Date activeDate;

    //Default no-arg constructor
    public Elephant(){}

    public Elephant(int id, String name, int age, String breed, String description, java.util.Date activeDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.description = description;
        this.activeDate = activeDate;
    }

    public Elephant(String name, String breed, String description, java.util.Date activeDate) {
        this.name = name;
        this.breed = breed;
        this.description = description;
        this.activeDate = activeDate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.Date getActiveDate() {
        return activeDate;
    }
    public void setActiveDate(java.util.Date activeDate) {
        this.activeDate = activeDate;
    }

}