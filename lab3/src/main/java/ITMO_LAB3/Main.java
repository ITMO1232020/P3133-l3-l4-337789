package ITMO_LAB3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Driver bagel = new Driver("Bagel","unknown",Locations.GREENCITY,"car");
        Znayka znayka = new Znayka("Znayka","unknown",Locations.GREENCITY);
        System.out.println(bagel.action());
        System.out.println(bagel.volunteerAction("Znayka"));
        System.out.println(bagel.move(bagel.getLocation()));
        System.out.println(znayka.move(znayka.getLocation()));
        ArrayList<Resident> zmeevka = new ArrayList<Resident>();
        Resident representative = new Resident("residents","cheerful faces",Locations.ZMEEVKA,0,"Zmeevka");
        System.out.println(representative.move(Locations.STREET));
        System.out.println(representative.glad());
        System.out.println(bagel.beFound());
        Screwdriver screwdriver = new Screwdriver("Screwdriver","unknown",Locations.ZMEEVKA);
        Gvozdyk gvozdyk = new Gvozdyk("Gvozdyk","unknown",Locations.RIVERSIDE, "panties");
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
    }
}
