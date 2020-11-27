package ITMO_LAB3;

import java.sql.SQLOutput;
import java.util.Objects;

public class Resident extends Person implements MoveAction, SpecialAction{
    private int isBeliever;
    static int numResidents=0;
    static int numBeliever=0;
    private String nameVillage;
    public Resident(String Name, String Mood, Locations location, int IsBeliever, String nameVillage){
        numResidents+=1;
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        this.setIsBeliever(IsBeliever);
        this.setNameVillage(nameVillage);
        //System.out.println(this.getName() + " was created");
        numBeliever += this.getIsBeliever();
    }

    public void setNameVillage(String nameVillage){
        this.nameVillage = nameVillage;
    }

    public String getNameVillage(){
        return this.nameVillage;
    }

    public void setIsBeliever(int IsBeliever){
        this.isBeliever = IsBeliever;
    }

    public int getIsBeliever() {
        return this.isBeliever;
    }

    @Override
    public void move(Locations place) {
        System.out.println(this.getName() + " walked" + " on " + place + " with  " + this.getMood());
    }

    @Override
    public void action() {
        System.out.println(this.getName() + " fear that Gvozdyk would start breaking glass again");
    }

    static void countBeliever(){
        System.out.println("There are " + Integer.toString(numResidents) + " residents in town but only " + Integer.toString(numBeliever) + " people believe in this re-education");
    }

    public void lookAtSomeOne(String Name, String How){
        System.out.println(this.getName() + " looked at "+ Name + " " + How);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "Mood: " + this.getMood() + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resident)) return false;
        Resident zmeevkaResident = (Resident) o;
        return Objects.equals(this.getName(), zmeevkaResident.getName()) &&
                Objects.equals(this.getMood(), zmeevkaResident.getMood()) &&
                Objects.equals(this.getLocation(), zmeevkaResident.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getLocation());
    }
}
