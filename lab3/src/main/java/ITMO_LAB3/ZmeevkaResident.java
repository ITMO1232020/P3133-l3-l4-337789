package ITMO_LAB3;

import java.sql.SQLOutput;
import java.util.Objects;

public class ZmeevkaResident extends Person implements MoveAction, SpecialAction{
    private int IsBeliever;
    static int numResidents=0;
    static int numBeliever=0;
    public ZmeevkaResident(String Name, String Mood, Locations location, int IsBeliever){
        numResidents+=1;
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        this.setIsBeliever(IsBeliever);
        //System.out.println(this.getName() + " was created");
        numBeliever += this.getIsBeliever();
    }

    public void setIsBeliever(int IsBeliever){
        this.IsBeliever = IsBeliever;
    }

    public int getIsBeliever() {
        return this.IsBeliever;
    }

    @Override
    public void Move(Locations place) {
        System.out.println(this.getName() + " walked" + " on " + place + " with  " + this.getMood());
    }

    @Override
    public void Action() {
        System.out.println(this.getName() + " fear that Gvozdyk would start breaking glass again");
    }

    static void countBeliever(){
        System.out.println("There are " + Integer.toString(numResidents) + " residents in town but only " + Integer.toString(numBeliever) + " people believe in this re-education");
    }

    public void WatchedSomeOne(String Name){
        System.out.println(this.getName() + " watched "+ Name);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "Mood: " + this.getMood() + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZmeevkaResident)) return false;
        ZmeevkaResident zmeevkaResident = (ZmeevkaResident) o;
        return Objects.equals(this.getName(), zmeevkaResident.getName()) &&
                Objects.equals(this.getMood(), zmeevkaResident.getMood()) &&
                Objects.equals(this.getLocation(), zmeevkaResident.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getLocation());
    }
}
