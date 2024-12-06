package Numerous;

import org.Numerous.RomanNumeralConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTests {
    RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    void testConvertOne(){
        String romanNumeral = converter.convertToRomanNumeral(1);
        Assertions.assertEquals("I", romanNumeral);
    }
}
