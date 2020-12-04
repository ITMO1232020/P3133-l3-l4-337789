package ITMO_LAB3;

import java.util.Objects;

class Driver extends Person implements MoveAction, FoundAction, SpecialAction{

    private String transport;

    public Driver(String Name, String Mood, Locations location, String transport){
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        this.setTransport(transport);
        System.out.println(this.getName() + " was created");
    }

    public void setTransport(String transport){
        this.transport = transport;
    }

    public String getTransport(){
        return this.transport;
    }
    @Override
    public String action() { // know something
        return (this.getName() + " knew that Znayka was going to the Green City");
    }

    @Override
    public String move(Locations location) {
        return (this.getName() + " left to " + location + " by " + this.getTransport());
    }

    public String volunteerAction(String Name){
        return (this.getName() + " volunteered to take "+ Name);
    }

    @Override
    public String beFound(){
        return (this.getName() + " was found");
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "Mood: " + this.getMood() + "location: " + this.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver bagel = (Driver) o;
        return Objects.equals(this.getName(), bagel.getName()) &&
                Objects.equals(this.getMood(), bagel.getMood()) &&
                Objects.equals(this.getLocation(), bagel.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getLocation());
    }
}

