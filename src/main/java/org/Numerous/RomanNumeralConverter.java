package org.Numerous;

public class RomanNumeralConverter {
    public String convertToRomanNumeral(int number){
        String numeral = "";
        if (number < 900){
            numeral = convertLessThanNineHundred(number, numeral);
        }else{
            numeral += "CM";
            number -= 900;
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNineHundred(int number, String numeral){
        if(number < 400){
            numeral = convertLessThanFourHundred(number, numeral);
        } else if(number < 500){
            numeral += "CD";
            number -= 400;
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += "D";
            number -= 500;
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanFourHundred(int number, String numeral){
        if(number < 90){
            numeral = convertLessThanNinety(number, numeral);
        }else if(number < 100){
            numeral += "XC";
            number -= 90;
            numeral += convertToRomanNumeral(number);
        }else{
            numeral += "C";
            number -= 100;
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNinety(int number, String numeral){
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