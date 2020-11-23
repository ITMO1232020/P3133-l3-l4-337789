package ITMO_LAB3;

import java.util.Objects;

public class Gvozdyk extends Person implements SpecialAction, FoundAction {
    private String Clothes;
    public Gvozdyk(String Name, String Mood, Locations location, String Clothes){
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        this.setClothes(Clothes);
        System.out.println(this.getName() + " was created");
    }

    public String getClothes(){
        return this.Clothes;
    }

    public void setClothes(String clothes){
        this.Clothes = clothes;
    }

    public void beReeducated(){
        System.out.println(this.getName() + " had been re-educated");
    }

    @Override
    public void BeFound() {
        System.out.println(this.getName() + " was seen on the " + this.getLocation());
    }

    @Override
    public void Action() {
        System.out.println(this.getName() + " sat on the beach in only his " + this.getClothes() + " and washed his clothes");
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
