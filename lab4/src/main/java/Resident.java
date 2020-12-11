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

    public Resident (String name){
        this.setName(name);
        System.out.println(this.getName() + " was created");
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

    public String thoughtOfSomeThing(String someThing){
        return this.getName() + " thought of " + someThing;
    }

    public String smile(String because){
        return because +  " made " + this.getName() + " smile";
    }

    public String surprised(String how){
        return this.getName() + " was " + how + " surprised";
    }

    public String heardSomeThing(String someThing){
        return this.getName() + " heard that " + someThing;
    }

    public String askSomeThing(String someThing){
        return this.getName() + " ask " + someThing;
    }

    public String sawSomeThing(String someThing){
        return this.getName() + " saw that " + someThing;
    }

    public String ranToTell(String someBody, String someThing){
        return this.getName() + " ran to tell " + someBody + " that " + someThing;
    }
    public String dissuaded(String who){
        return this.getName() + " dissuaded " + who;
    }

    public String believeInSomeThing(String something){
        return this.getName() + " believe that " + something;
    }

    public String saidGoodByeToSomeOne(String who, String how){
        return this.getName() + " said goodbye to " + who + " " + how;
    }
    @Override
    public String move(Locations place) {
        return this.getName() + " walked" + " on " + place + " with  " + this.getMood();
    }

    @Override
    public String action() {
        return (this.getName() + " fear that Gvozdyk would start breaking glass again");
    }

    static String countBeliever(){
        return ("There are " + Integer.toString(numResidents) + " residents in town but only " + Integer.toString(numBeliever) + " people believe in this re-education");
    }

    public String lookAtSomeOne(String name, String how){
        return this.getName() + " looked at "+ name + " " + how;
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
