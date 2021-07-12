import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    Planet planet;
    @Before
    public void before(){
        planet = new Planet("Mars",100);
    }

    @Test
    public void hasName(){
        assertEquals("Mars",planet.getName());
    }


}
