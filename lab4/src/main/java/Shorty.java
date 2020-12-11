public class Shorty extends Person implements SpecialAction{
    public Shorty(String name){
        this.setName(name);
        System.out.println(this.getName() + " was created");
    }

    public String appeared(String how){
        return this.getName() + " appeared " + how;
    }
    @Override
    public String action() {
        return "scattered, hid " + this.getLocation()+ " began to look out the windows";
    }

    public String heardSomeThing(String someThing){
        return this.getName() + " " + someThing;
    }

    public String laugh(String how){
        return this.getName() + " began to laugh " + how;
    }

    public String seeingSomeThing(String something){
        return this.getName() + " are seeing " + something;
    }

    public String ranOut(){
        return this.getName() + " ran out of the houses";
    }

    public String hug(String who){
        return this.getName() + " hug " + who;
    }

    public String werePleasedWithSomeThing(String how, String something){
        return this.getName() + " were " + how + " pleased with " + something;
    }

    public String presentedSomeBodySomeThing(String someBody, String someThing){
        return this.getName() + " presented " + someBody + someThing;
    }
}
