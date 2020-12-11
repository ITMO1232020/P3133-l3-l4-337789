public class Dunno extends Person implements SpecialAction{
    public Dunno(String name){
        this.setName(name);
    }

    public String rushed(){
        return this.getName() + " rushed to and fro";
    }

    public String gaveOrders(String how){
        return this.getName() + " gave orders " + how;
    }

    public String seemedToHim(String something){
        return this.getName() + " seemed to him that " + something;
    }


    @Override
    public String action() {
        return this.getName() + " shouted, fussed and just interfered with others.";
    }

    public String wasReadyToDoSomeThing(String someThing){
        return this.getName() + " was ready to " + someThing;
    }
}
