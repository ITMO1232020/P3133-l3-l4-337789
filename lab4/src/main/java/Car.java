public class Car implements SpecialAction{
    private String Fruit  ;
    private String NumberOfFruit;
    private String Ordering;
    private String NearSomeOne;
    public Car(String fruit, String numberOfFruit, String ordering, String nearSomeOne){
        this.Fruit = fruit;
        this.NumberOfFruit = numberOfFruit;
        this.Ordering = ordering;
        this.NearSomeOne = nearSomeOne;
        System.out.println("Created the " + this.Ordering + " car with " + this.NumberOfFruit + " " + this.Fruit);
    }

    public String appeared(String where){
        return "Car appeared " + where;
    }

    public String droveUp(){
        return "Car drove up";
    }
    @Override
    public String action() {
        return "raised the dust on the road";
    }

    public String stopped(){
        if(this.NearSomeOne == "Znayka") {
            return "Having caught up with Znayka, cars stopped";
        }
        else return "not stopped";
    }
}
