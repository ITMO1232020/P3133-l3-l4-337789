public class Kid  extends Person{

    public Kid(String name){
        this.setName(name);
        System.out.println(this.getName()+ " were created");
    }

    public String expressLove(String forWho, String how){
        if(forWho == null) throw new ExpressLoveException();
        return this.getName() + " " + how + " surrounded " + forWho + " began to hug " + forWho + " kiss " + forWho;
    }

    public String decoratedSomeThing(String someThing, String how){
        return this.getName() + " decorated " + someThing + " " + how;
    }
    public String paintedSomeThing(String someThing, String how){
        return this.getName() + " painted " + someThing + " " + how;
    }

    public String fedSomeBody(String who){
        return this.getName() + " fed " + who;
    }

    public String tookSomeBodyToSomeWhere(String who, String where){
        return this.getName() + " took " + who + " " + where;
    }

    public String showSomeBodySomeThing(String who, String something){
        return this.getName() + " showed " + who + " " + something;
    }

    public String wereDelightedBecauseOfSomeThing(String because){
        return this.getName() + " were delighted " + because;
    }

}
