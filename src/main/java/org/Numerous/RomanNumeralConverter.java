package org.Numerous;

public class RomanNumeralConverter {
    public String convertToRomanNumeral(int number){
        String numeral = "";
        for(int i = 0; i < number; i ++){
            numeral += "I";
        }
        return numeral;
    }
}