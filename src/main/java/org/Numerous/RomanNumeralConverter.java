package org.Numerous;

public class RomanNumeralConverter {
    public String convertToRomanNumeral(int number){
        String numeral = "";
        if(number < 40){
            numeral = convertLessThanForty(number, numeral);
        } else if(number < 50){
            numeral += "XL";
            number -= 40;
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += "L";
            number -= 50;
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanForty(int number, String numeral){
        if(number < 9){
            numeral = convertLessThanNine(number, numeral);
        } else if(number < 10){
            numeral += "IX";
        } else{
            numeral += "X";
            number -= 10;
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNine(int number, String numeral){
        if(number < 4){
            numeral = convertLessThanFour(number, numeral);
        } else if(number < 5){
            numeral += "IV";
        } else{
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