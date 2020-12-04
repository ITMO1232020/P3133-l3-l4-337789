package ITMO_LAB3;

import java.util.Objects;

public class Znayka extends Person implements MoveAction {

    public Znayka(String Name, String Mood, Locations location){
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        System.out.println(this.getName() + " was created");
    }

    @Override
    public String move(Locations location) {
        return (this.getName() + " left to " + location);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "Mood: " + this.getMood() + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Znayka)) return false;
        Znayka znayka = (Znayka) o;
        return Objects.equals(this.getName(), znayka.getName()) &&
                Objects.equals(this.getMood(), znayka.getMood()) &&
                Objects.equals(this.getLocation(), znayka.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getLocation());
    }
}
