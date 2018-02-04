import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AutoTest {

    private PKW testeMich;
    
    @Before
    public void baueAuto(){
        testeMich = new PKW("Testwagen", 100, 4);
    }
    
    @Test
    public void berechneFahrzeitNurMinuten() {
        assertEquals("45 min", testeMich.berechneFahrzeitAlsString(75));
        assertEquals("30 min", testeMich.berechneFahrzeitAlsString(50));
        assertEquals("1 min", testeMich.berechneFahrzeitAlsString(100d/60));
        assertEquals("0 min", testeMich.berechneFahrzeitAlsString(0));
    }

    @Test
    public void berechneFahrzeitStundenUndMinuten() {
        assertEquals("1 h, 0 min", testeMich.berechneFahrzeitAlsString(100));
        assertEquals("2 h, 30 min", testeMich.berechneFahrzeitAlsString(250));
        assertEquals("23 h, 45 min", testeMich.berechneFahrzeitAlsString(2375));
    }    

    @Test
    public void berechneFahrzeitTageStundenUndMinuten() {
        assertEquals("2 Tag(e), 6 h, 30 min", testeMich.berechneFahrzeitAlsString(5450));
    }     
    
}
