import java.util.Objects;

class Bagel extends Person implements MoveAction, FoundAction, SpecialAction, GetOutAction{

    private Car car;

    public Bagel(String Name, String Mood, Locations location){
        this.setMood(Mood);
        this.setName(Name);
        this.setLocation(location);
        System.out.println(this.getName() + " was created");
    }

    public void setCar(Car c){
        this.car = c;
    }

    public Car getCar(){
        return this.car;
    }


    public String confirmedSomeThing(String someThing){
        return this.getName() + " confirmed that " + someThing;
    }

    @Override
    public String action() { // know something
        return (this.getName() + " knew that Znayka was going to the Green City");
    }

    @Override
    public String move(Locations location) {
        return (this.getName() + " left to " + location + " by car");
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
        if (!(o instanceof Bagel)) return false;
        Bagel bagel = (Bagel) o;
        return Objects.equals(this.getName(), bagel.getName()) &&
                Objects.equals(this.getMood(), bagel.getMood()) &&
                Objects.equals(this.getLocation(), bagel.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMood(), this.getLocation());
    }

    @Override
    public String gotOutOf(String someWhere) {
        return this.getName() +  " got out of " + someWhere;
    }
}

