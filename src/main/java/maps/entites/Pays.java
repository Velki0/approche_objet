package maps.entites;

public class Pays {

    private String name;
    private long nombreHabitants;
    private String continent;

    public Pays(String name, long nombreHabitants, String continent) {

        this.name = name;
        this.nombreHabitants = nombreHabitants;
        this.continent = continent;

    }

    public String getName() { return name; }
    public long getNombreHabitants() { return nombreHabitants; }
    public String getContinent() { return continent; }

    public void setName(String name) { this.name = name; }
    public void setNombreHabitants(long nombreHabitants) { this.nombreHabitants = nombreHabitants; }
    public void setContinent(String continent) { this.continent = continent; }

}
