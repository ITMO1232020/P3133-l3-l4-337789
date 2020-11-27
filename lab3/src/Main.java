import java.util.*;

public class Main {

    public static void main(String[] args) {
        Driver bagel = new Driver("Bagel","unknown",Locations.GREENCITY,"car");
        Znayka znayka = new Znayka("Znayka","unknown",Locations.GREENCITY);
        bagel.Action();
        bagel.VolunteerAction("Znayka");
        bagel.Move(bagel.getLocation());
        znayka.Move(znayka.getLocation());
        ArrayList<ZmeevkaResident>  residents = new ArrayList<ZmeevkaResident>();
        ZmeevkaResident representative = new ZmeevkaResident("residents","cheerful faces",Locations.ZMEEVKA,0);
        int number_of_residents = 10;
        for (int i = 0 ; i < number_of_residents; i++){
            double randnum = Math.random();
            randnum = (randnum < 0.5) ? 0 : 1;
            residents.add(new ZmeevkaResident("resident" + Integer.toString(i), "cheerful faces", Locations.ZMEEVKA,(int) randnum));
        }
        //ZmeevkaResident residents = new ZmeevkaResident("residents","cheerful faces",Locations.ZMEEVKA);
        representative.Move(Locations.STREET);
        bagel.BeFound();
        Screwdriver screwdriver = new Screwdriver("Screwdriver","unknown",Locations.ZMEEVKA);
        Gvozdyk gvozdyk = new Gvozdyk("Gvozdyk","unknown",Locations.ZMEEVKA);
        gvozdyk.Action();
        //Carnation carnation = new Carnation("Carnation","unknown",Locations.RIVER);
        for (ZmeevkaResident Z : residents){
            Z.BelieveInSomething();
        }
        representative.WatchedSomeOne("Gvozdyk");
        representative.Action();
        Carnation carnation = new Carnation("Carnation","unknown",Locations.RIVER);
        representative.FoundSomeOne(carnation);
        carnation.Action();
    }
}
