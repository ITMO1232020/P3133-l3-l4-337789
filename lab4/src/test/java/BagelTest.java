import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagelTest {

    @Test
    void confirmedSomeThing() {
        Bagel bagel = new Bagel("Bagel","unknown",Locations.GREENCITY);
        assertEquals("Bagel confirmed that Gvozdyk had actually re-educated himself",bagel.confirmedSomeThing("Gvozdyk had actually re-educated himself"));
    }
}