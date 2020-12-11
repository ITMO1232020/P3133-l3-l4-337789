import java.util.Objects;

public class Znayka extends Person implements MoveAction {
    private String ThingToDo;
    public Znayka(String Name, String Mood, Locations location, String thingToDo){
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        this.ThingToDo = thingToDo;
        System.out.println(this.getName() + " was created");
    }
    public void setThingToDo(String thingToDo){
        this.ThingToDo = thingToDo;
    }

    public String getThingToDo(){
        return this.ThingToDo;
    }

    public String notScared(){
        return this.getName() + " was not scared";
    }

    public String stayedSomeWhere(String where){
        return this.getName() + " stayed " + where;
    }
    public String noThingToDo(){
        if(this.ThingToDo == null){
            return this.getName() + " has nothing to do";
        }
        else{
            return this.getName() + " has something to do";
        }
    }

    public String decidedToGo(Locations location, String How){
        return this.getName() + " " + How + " " + "decided to go to " + location;
    }

    public String stoodOwnGround(){
        return this.getName() + " stood his Ground";
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
