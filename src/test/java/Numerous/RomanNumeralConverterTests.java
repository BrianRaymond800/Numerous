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

    @Test
    void testConvertSix(){
        String romanNumeral = converter.convertToRomanNumeral(6);
        Assertions.assertEquals("VI", romanNumeral);
    }

    @Test
    void testConvertNine(){
        String romanNumeral = converter.convertToRomanNumeral(9);
        Assertions.assertEquals("IX", romanNumeral);
    }
}