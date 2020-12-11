public class Shurupchik extends Person implements GetOutAction{
    // got out of car
    // confirmed something
    //
    private Car car;

    public Shurupchik(String name, Car c){
        this.setName(name);
        this.car = c;
        System.out.println(this.getName() + " was created");
    }


    @Override
    public String gotOutOf(String someWhere) {
        return this.getName() +  " got out of " + someWhere;
    }

    public String confirmedSomeThing(String someThing){
        return this.getName() + " confirmed that " + someThing;
    }


}
