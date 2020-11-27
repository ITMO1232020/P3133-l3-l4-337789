import java.util.Objects;

public class Gvozdyk extends Person implements SpecialAction {
    public Gvozdyk(String Name, String Mood, Locations location){
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        System.out.println(this.getName() + " was created");
    }
    @Override
    public void Action() {
        System.out.println(this.getName() + " had been re-educated");
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "Mood: " + this.getMood() + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gvozdyk)) return false;
        Gvozdyk gvozdyk = (Gvozdyk) o;
        return Objects.equals(this.getName(), gvozdyk.getName()) &&
                Objects.equals(this.getMood(), gvozdyk.getMood()) &&
                Objects.equals(this.getLocation(), gvozdyk.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getLocation());
    }
}
