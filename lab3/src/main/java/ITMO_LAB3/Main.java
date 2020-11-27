package ITMO_LAB3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Driver bagel = new Driver("Bagel","unknown",Locations.GREENCITY,"car");
        Znayka znayka = new Znayka("Znayka","unknown",Locations.GREENCITY);
        bagel.action();
        bagel.volunteerAction("Znayka");
        bagel.move(bagel.getLocation());
        znayka.move(znayka.getLocation());
        ArrayList<Resident> zmeevka = new ArrayList<Resident>();
        Resident representative = new Resident("residents","cheerful faces",Locations.ZMEEVKA,0,"Zmeevka");
        representative.move(Locations.STREET);
        representative.glad();
        bagel.beFound();
        Screwdriver screwdriver = new Screwdriver("Screwdriver","unknown",Locations.ZMEEVKA);
        Gvozdyk gvozdyk = new Gvozdyk("Gvozdyk","unknown",Locations.RIVERSIDE, "panties");
        gvozdyk.beReeducated();
        int number_of_residents = (int)(Math.random()*100)+1;
        for (int i = 0 ; i < number_of_residents; i++){
            double randnum = Math.random();
            randnum = (randnum < 0.5) ? 0 : 1;
            zmeevka.add(new Resident("resident" + Integer.toString(i), "cheerful faces", Locations.ZMEEVKA,(int) randnum, "Zmeevka"));
        }
        Resident.countBeliever();
        representative.lookAtSomeOne("Gvozdyk", "suspiciously");
        representative.action();
        gvozdyk.beFound();
        gvozdyk.action();
    }
}
