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

    @Test
    void testConvertFortyNine(){
        String romanNumeral = converter.convertToRomanNumeral(49);
        Assertions.assertEquals("XLIX", romanNumeral);
    }

    @Test
    void testConvertFifty(){
        String romanNumeral = converter.convertToRomanNumeral(50);
        Assertions.assertEquals("L", romanNumeral);
    }

    @Test
    void testConvertEightyNine(){
        String romanNumeral = converter.convertToRomanNumeral(89);
        Assertions.assertEquals("LXXXIX", romanNumeral);
    }

    @Test
    void testConvertNinety(){
        String romanNumeral = converter.convertToRomanNumeral(90);
        Assertions.assertEquals("XC", romanNumeral);
    }

    @Test
    void testConvertNinetyNine(){
        String romanNumeral = converter.convertToRomanNumeral(99);
        Assertions.assertEquals("XCIX", romanNumeral);
    }

    @Test
    void testConvertOneHundred(){
        String romanNumeral = converter.convertToRomanNumeral(100);
        Assertions.assertEquals("C", romanNumeral);
    }

    @Test
    void testConvertThreeHundredNinetyNine(){
        String romanNumeral = converter.convertToRomanNumeral(399);
        Assertions.assertEquals("CCCXCIX", romanNumeral);
    }

    @Test
    void testConvertFourHundred(){
        String romanNumeral = converter.convertToRomanNumeral(400);
        Assertions.assertEquals("CD", romanNumeral);
    }

    @Test
    void testConvertFourHundredNinetyNine(){
        String romanNumeral = converter.convertToRomanNumeral(499);
        Assertions.assertEquals("CDXCIX", romanNumeral);
    }

    @Test
    void testConvertFiveHundred(){
        String romanNumeral = converter.convertToRomanNumeral(500);
        Assertions.assertEquals("D", romanNumeral);
    }

    @Test
    void testConvertEightHundredNinetyNine(){
        String romanNumeral = converter.convertToRomanNumeral(899);
        Assertions.assertEquals("DCCCXCIX", romanNumeral);
    }

    @Test
    void testConvertNineHundred(){
        String romanNumeral = converter.convertToRomanNumeral(900);
        Assertions.assertEquals("CM", romanNumeral);
    }

    @Test
    void testConvertNineHundredNinetyNine(){
        String romanNumeral = converter.convertToRomanNumeral(999);
        Assertions.assertEquals("CMXCIX", romanNumeral);
    }
}