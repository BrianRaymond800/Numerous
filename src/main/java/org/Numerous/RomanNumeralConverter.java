package org.Numerous;

public class RomanNumeralConverter {
    public String convertToRomanNumeral(int number){
        String numeral = "";
        if(number < 9){
            numeral = convertLessThanNine(number, numeral);
        }
        else {
            numeral += "IX";
        }
        return numeral;
    }

    private String convertLessThanNine(int number, String numeral){
        if(number < 4){
            numeral = convertLessThanFour(number, numeral);
        }else if(number < 5){
            numeral += "IV";
        }else{
            numeral += "V";
            number -= 5;
            numeral += convertToRomanNumeral(number);
        }
        return numeral;

    }

    private String convertLessThanFour(int number, String numeral){
        for(int i = 0; i < number; i ++){
            numeral += "I";
        }
        return numeral;
    }
}