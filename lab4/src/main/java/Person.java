public abstract class Person{
    private String Name;
    private String Mood;
    private Locations location;

    static String glad(){
        return ("Everyone is glad that the Dragon was gone");
    }
    public void setLocation(Locations location) {
        this.location = location;
    }

    public Locations getLocation() {
        return location;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMood(String mood) {
        Mood = mood;
    }

    public String getMood() {
        return Mood;
    }
}
