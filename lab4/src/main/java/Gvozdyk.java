import java.util.Objects;

public class Gvozdyk extends Person implements SpecialAction, FoundAction,GetOutAction {
    private String Clothes;
    private Car car;
    public Gvozdyk(String Name, Locations location, String Clothes, Car C){
        this.setName(Name);
        this.setLocation(location);
        this.setClothes(Clothes);
        this.car = C;
        System.out.println(this.getName() + " was created");
    }

    public String getClothes(){
        return this.Clothes;
    }

    public void setClothes(String clothes){
        this.Clothes = clothes;
    }

    public String beReeducated(){
        return (this.getName() + " had been re-educated");
    }

    @Override
    public String beFound() {
        return (this.getName() + " was seen on the " + this.getLocation());
    }

    @Override
    public String action() {
        return (this.getName() + " sat on the beach in only his " + this.getClothes() + " and washed his clothes");
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

    @Override
    public String gotOutOf(String someWhere) {
        return this.getName() +  " got out of " + someWhere;
    }
}
