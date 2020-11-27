package ITMO_LAB3;

import java.util.Objects;

public class Screwdriver extends Person implements FoundAction{

    public Screwdriver(String Name, String Mood, Locations location){
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        System.out.println(this.getName() + " was created ");
    }

    @Override
    public void beFound() {
        System.out.println(this.getName() + " was found ");
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "Mood: " + this.getMood() + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Screwdriver)) return false;
        Screwdriver screwdriver = (Screwdriver) o;
        return Objects.equals(this.getName(), screwdriver.getName()) &&
                Objects.equals(this.getMood(), screwdriver.getMood()) &&
                Objects.equals(this.getLocation(), screwdriver.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getLocation());
    }
}
