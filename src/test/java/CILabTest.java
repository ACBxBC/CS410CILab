import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void testAllUppercase() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void testAllLowercase() {
        myString.setString("hello");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void testFirstLetterCapital() {
        myString.setString("Title");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void testInvalidMixedCase() {
        myString.setString("tITLE");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void testEmptyString() {
        myString.setString("");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void testSingleUppercaseLetter() {
        myString.setString("A");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void testSingleLowercaseLetter() {
        myString.setString("a");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void testInvalidMixedCase2() {
        myString.setString("HeLLo");
        assertFalse(myString.detectCapitalUse());
    }

    // Optionally, if non-alphabetic characters need to be tested
    @Test
    public void testNonAlphabeticCharacters() {
        myString.setString("He11o");
        // Assume true or false depending on how the method is implemented
        assertTrue(myString.detectCapitalUse());
    }
}
