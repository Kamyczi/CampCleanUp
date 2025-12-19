import org.example.ZadaniaElfow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZadaniaElfowTest {

    @Test
    public void testCzyJedenJestWDrugim1() {
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("1-5", "3-4"));
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("2-6", "1-7"));
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("10-15", "5-20"));
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("3-8", "4-6"));
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("1-10", "4-8"));
        assertFalse(ZadaniaElfow.CzyJedenJestWDrugim("1-5", "6-10"));
        assertFalse(ZadaniaElfow.CzyJedenJestWDrugim("10-20", "5-9"));
        assertFalse(ZadaniaElfow.CzyJedenJestWDrugim("1-4", "5-9"));
    }

    @Test
    public void testCzyJedenJestWDrugim2() {
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("1-5", "3-4"));
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("2-6", "1-7"));
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("10-15", "5-20"));
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("3-8", "4-6"));
        assertTrue(ZadaniaElfow.CzyJedenJestWDrugim("1-10", "4-8"));
        assertFalse(ZadaniaElfow.CzyJedenJestWDrugim("1-5", "6-10"));
        assertFalse(ZadaniaElfow.CzyJedenJestWDrugim("10-20", "5-9"));
        assertFalse(ZadaniaElfow.CzyJedenJestWDrugim("1-4", "5-9"));
    }

    @Test
    public void testIleJestTakich() {
        String[] pairs1 = {
                "1-5,3-4",
                "2-6,1-7",
                "10-15,5-20",
                "3-8,4-6",
                "1-10,4-8",
                "1-5,6-10",
                "10-20,5-9"
        };
        assertEquals(5, ZadaniaElfow.IleJestTakich(pairs1));

        String[] pairs2 = {
                "1-5,6-10",
                "2-4,6-8",
                "3-9,10-15",
                "5-7,4-8",
                "1-2,2-3",
                "1-5,2-4"
        };
        assertEquals(2, ZadaniaElfow.IleJestTakich(pairs2));
    }
}
