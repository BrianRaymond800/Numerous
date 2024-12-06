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

    @Test
    void testConvertTen(){
        String romanNumeral = converter.convertToRomanNumeral(10);
        Assertions.assertEquals("X", romanNumeral);
    }

    @Test
    void testConvertEleven(){
        String romanNumeral = converter.convertToRomanNumeral(11);
        Assertions.assertEquals("XI", romanNumeral);
    }

    @Test
    void testConvertFourteen(){
        String romanNumeral = converter.convertToRomanNumeral(14);
        Assertions.assertEquals("XIV", romanNumeral);
    }

    @Test
    void testConvertFifteen(){
        String romanNumeral = converter.convertToRomanNumeral(15);
        Assertions.assertEquals("XV", romanNumeral);
    }

    @Test
    void testConvertNineteen(){
        String romanNumeral = converter.convertToRomanNumeral(19);
        Assertions.assertEquals("XIX", romanNumeral);
    }

    @Test
    void testConvertTwenty(){
        String romanNumeral = converter.convertToRomanNumeral(20);
        Assertions.assertEquals("XX", romanNumeral);
    }

    @Test
    void testConvertThirtyNine(){
        String romanNumeral = converter.convertToRomanNumeral(39);
        Assertions.assertEquals("XXXIX", romanNumeral);
    }

    @Test
    void testConvertForty(){
        String romanNumeral = converter.convertToRomanNumeral(40);
        Assertions.assertEquals("XL", romanNumeral);
    }
}