package org.Numerous;

public class RomanNumeralConverter {
    public String convertToRomanNumeral(int number){
        String numeral = "";
        if(number < 4){
            numeral = convertLessThanFour(number, numeral);
        }
        else{
            numeral = "IV";
        }
        return numeral;
    }

    public String convertLessThanFour(int number, String numeral){
        for(int i = 0; i < number; i ++){
            numeral += "I";
        }
        return numeral;
    }
}