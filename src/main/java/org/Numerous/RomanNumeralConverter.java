package org.Numerous;

public class RomanNumeralConverter {

    private String[] numerals = {"M", "D", "C", "L", "X", "V", "I"};
    private int[] numbers = {1000, 500, 100, 50, 10, 5, 1};

    public String convertToRomanNumeral(int number){
        String numeral = "";
        numeral = convertLessThanFourThousand(number, numeral);
        return numeral;
    }

    private String convertLessThanFourThousand(int number, String numeral){
        if (number < numbers[0] - numbers[2]){
            numeral = convertLessThanNineHundred(number, numeral);
        }else if(number < numbers[0]){
            numeral += "CM";
            number -= numbers[0] - numbers[2];
            numeral += convertToRomanNumeral(number);
        }else{
            numeral += "M";
            number -= numbers[0];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNineHundred(int number, String numeral){
        if(number < numbers[1] - numbers[2]){
            numeral = convertLessThanFourHundred(number, numeral);
        } else if(number < numbers[1]){
            numeral += "CD";
            number -= numbers[1] - numbers[2];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += "D";
            number -= numbers[1];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanFourHundred(int number, String numeral){
        if(number < numbers[2] - numbers[4]){
            numeral = convertLessThanNinety(number, numeral);
        }else if(number < numbers[2]){
            numeral += "XC";
            number -= numbers[2] - numbers[4];
            numeral += convertToRomanNumeral(number);
        }else{
            numeral += "C";
            number -= numbers[2];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNinety(int number, String numeral){
        if(number < numbers[3] - numbers[4]){
            numeral = convertLessThanForty(number, numeral);
        } else if(number < numbers[3]){
            numeral += "XL";
            number -= numbers[3] - numbers[4];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += "L";
            number -= numbers[3];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanForty(int number, String numeral){
        if(number < numbers[4] - numbers[6]){
            numeral = convertLessThanNine(number, numeral);
        } else if(number < numbers[4]){
            numeral += "IX";
            number -= numbers[4] - numbers[6];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += "X";
            number -= numbers[4];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNine(int number, String numeral){
        if(number < numbers[5] - numbers[6]){
            numeral = convertLessThanFour(number, numeral);
        } else if(number < numbers[5]){
            numeral += "IV";
            number -= numbers[5] - numbers[6];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += "V";
            number -= numbers[5];
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