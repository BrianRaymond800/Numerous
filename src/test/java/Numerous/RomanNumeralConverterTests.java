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

    @Test
    void testConvertTwo(){
        String romanNumeral = converter.convertToRomanNumeral(2);
        Assertions.assertEquals("II", romanNumeral);
    }

    @Test
    void testConvertFour(){
        String romanNumeral = converter.convertToRomanNumeral(4);
        Assertions.assertEquals("IV", romanNumeral);
    }

    @Test
    void testConvertFive(){
        String romanNumeral = converter.convertToRomanNumeral(5);
        Assertions.assertEquals("V", romanNumeral);
    }
}
