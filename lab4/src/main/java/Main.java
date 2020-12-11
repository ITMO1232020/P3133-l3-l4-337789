import java.util.*;

public class Main {

    public static void main(String[] args) {
        Bagel bagel = new Bagel("Bagel","unknown",Locations.GREENCITY);
        Znayka znayka = new Znayka("Znayka","unknown",Locations.GREENCITY,null);
        System.out.println(znayka.decidedToGo(Locations.GREENCITY, "firmly"));
        Resident representative = new Resident("residents","cheerful faces",Locations.ZMEEVKA,0,"Zmeevka");
        System.out.println(representative.dissuaded("Znayka"));
        System.out.println(znayka.stoodOwnGround());
        System.out.println(znayka.noThingToDo());
        Kid kids = new Kid ("Kids");
        System.out.println(kids.fedSomeBody("Znayka"));
        System.out.println(kids.tookSomeBodyToSomeWhere("Znayka","to the outskirts of the city"));
        System.out.println(kids.showSomeBodySomeThing("Znayka", "the way to the Green City"));
        Resident everyone = new Resident("everyone");
        System.out.println(everyone.believeInSomeThing("Znayka was going to certain death"));
        System.out.println(everyone.saidGoodByeToSomeOne("Znayka", "with tears in their eyes"));
        try{
            Thing.Cloud.setLocation("on the road in the distance");
        } catch(CloudLocationException clex){
            System.out.println(clex.getMessage());
        }
        System.out.println(Thing.Cloud.appeared());
        System.out.println(Thing.Cloud.approachedAndGrew("quickly"));
        Dragon dragon = new Dragon(100);
        System.out.println(dragon.action());
        System.out.println(znayka.notScared());
        System.out.println(znayka.stayedSomeWhere("in the middle of the street"));
        System.out.println(everyone.sawSomeThing("three cars were approaching the city one after the other."));
        Car car1 = new Car("red-sided apple", "a" , "first","Znayka");
        Car car2 = new Car("ripe pear", "a","second","Znayka");
        Car car3 = new Car("plums","half of dozen","third","Znayka");
        System.out.println("they " + car1.action());
        System.out.println(car1.stopped());
        Gvozdyk gvozdyk = new Gvozdyk("Gvozdyk",Locations.RIVERSIDE, "panties",car3);
        bagel.setCar(car1);
        Shurupchik shurupchik = new Shurupchik("Shurupchik",car2);
        System.out.println(bagel.gotOutOf("car "));
        System.out.println(shurupchik.gotOutOf("car"));
        System.out.println(gvozdyk.gotOutOf("car"));
        Shorty shorty = new Shorty("shorty");
        System.out.println(shorty.seeingSomeThing("they got out of car"));
        System.out.println(shorty.ranOut());
        System.out.println(shorty.hug("Bagel"));
        System.out.println(shorty.hug("Shurupchik"));
        System.out.println(shorty.hug("Gvozdik"));
        System.out.println(everyone.askSomeThing("about the dragon"));
        System.out.println(everyone.heardSomeThing("there is no dragon and never was"));
        System.out.println(everyone.surprised("terribly"));
        System.out.println(everyone.smile("this response"));
        System.out.println(shurupchik.confirmedSomeThing("Gvozdyk had actually re-educated himself"));
        System.out.println(bagel.confirmedSomeThing("Gvozdyk had actually re-educated himself"));
        System.out.println(shorty.werePleasedWithSomeThing("very","his work"));
        System.out.println(shorty.presentedSomeBodySomeThing("the residents of Zmeevka", "a bunch of apples, pears and plums"));
        System.out.println(kids.wereDelightedBecauseOfSomeThing("because they loved fruits very much"));
        System.out.println("------------------------------------------------");
        System.out.println(bagel.action());
        System.out.println(bagel.volunteerAction("Znayka"));
        System.out.println(bagel.move(bagel.getLocation()));
        System.out.println(znayka.move(znayka.getLocation()));
        ArrayList<Resident> zmeevka = new ArrayList<Resident>();
        System.out.println(representative.move(Locations.STREET));
        System.out.println(representative.glad());
        System.out.println(bagel.beFound());
        System.out.println(gvozdyk.beReeducated());
        int number_of_residents = (int)(Math.random()*100)+1;
        for (int i = 0 ; i < number_of_residents; i++){
            double randnum = Math.random();
            randnum = (randnum < 0.5) ? 0 : 1;
            zmeevka.add(new Resident("resident" + Integer.toString(i), "cheerful faces", Locations.ZMEEVKA,(int) randnum, "Zmeevka"));
        }
        System.out.println(Resident.countBeliever());
        System.out.println(representative.lookAtSomeOne("Gvozdyk", "suspiciously"));
        System.out.println(representative.action());
        System.out.println(gvozdyk.beFound());
        System.out.println(gvozdyk.action());
        System.out.println("------------------------------------------------");
        IPrepare P = new IPrepare() {
            @Override
            public String prepare(String forWhat, String how) {
                return "The preparations " + "for " + forWhat + " " + how;
            }
        };
        System.out.println(P.prepare("the ball", "in full swing"));
        Thing orchestraGazebo = new Thing("orchestra gazebo");
        Thing tents = new Thing("tents");
        System.out.println(orchestraGazebo.beBuilt("around the dance floor"));
        System.out.println(tents.beBuilt("around the dance floor"));
        Kid tyubik = new Kid("Tyubik");
        System.out.println(tyubik.paintedSomeThing("the gazebo","with the most intricate patterns"));
        Kid others = new Kid("others kid");
        System.out.println(others.paintedSomeThing("the tent","in all colors of the rainbow"));
        System.out.println(kids.decoratedSomeThing("the playground","with flowers, colorful lanterns and flags"));
        Dunno dunno = new Dunno("Dunno");
        System.out.println(dunno.rushed());
        System.out.println(dunno.gaveOrders("with all his might"));
        System.out.println(dunno.seemedToHim("the work was going very slowly"));
        System.out.println(dunno.action());
        System.out.println("Fortunately, everyone knew what to do without him");
        Resident someone = new Resident("someone");
        System.out.println(someone.thoughtOfSomeThing("arranging benches around the playground, but there were no boards"));
        System.out.println(dunno.wasReadyToDoSomeThing("tear his hair out of annoyance"));
        System.out.println("It is not known where this dispute would have reached");
        System.out.println(car1.appeared("in the distance"));
        System.out.println(car1.droveUp());
        System.out.println(bagel.gotOutOf("the cockpit"));
        Shorty another = new Shorty("another shorty");
        System.out.println(another.appeared("behind Bagel"));
        System.out.println(everyone.lookAtSomeOne("Bagel","in amazement"));
        try {
            System.out.println(kids.expressLove("Znayka", "immediately"));
        } catch(ExpressLoveException elex){
            System.out.println(elex.getMessage());
        }
        Shorty stalk = new Shorty("stalk shorty");
        System.out.println(stalk.heardSomeThing("all this conversation"));
        System.out.println(stalk.laugh("out loud"));
        System.out.println(everyone.sawSomeThing("Dunno was an ordinary braggart"));
        Resident galochka = new Resident("Galochka");
        Resident Kubyshka = new Resident("Kubyshka");
        System.out.println(galochka.ranToTell("everyone"," Dunno turned out to be  a liar and Znayka had invented the ball at all."));
        System.out.println(Kubyshka.ranToTell("everyone"," Dunno turned out to be  a liar and Znayka had invented the ball at all."));

    }
}
