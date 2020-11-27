import java.util.Objects;

public class Carnation extends Person implements SpecialAction{

    public Carnation(String Name, String Mood, Locations location){
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        System.out.println(this.getName() + " was created");
    }

    @Override
    public void Action() {
        System.out.println(this.getName() + " sat on the riverside in only his panties and washed his clothes");
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "Mood: " + this.getMood() + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carnation)) return false;
        Carnation carnation = (Carnation) o;
        return Objects.equals(this.getName(), carnation.getName()) &&
                Objects.equals(this.getMood(), carnation.getMood()) &&
                Objects.equals(this.getLocation(), carnation.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getLocation());
    }
}
