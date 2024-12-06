package org.Numerous;

public class RomanNumeralConverter {

    private String[] numerals = {"M", "D", "C", "L", "X", "V", "I"};
    private int[] numbers = {1000, 500, 100, 50, 10, 5, 1, 0, 0};

    public String convertToRomanNumeral(int number){
        String numeral = "";
        numeral = convertLessThanFourThousand(number, numeral);
        return numeral;
    }

    private String convertLessThanFourThousand(int number, String numeral){
        if(number == 0){
            return "";
        }
        if (number < numbers[0] - numbers[2]){
            numeral = convertLessThanNineHundred(number, numeral);
        }else if(number < numbers[0]){
            numeral += numerals[2];
            numeral += numerals[0];
            number -= numbers[0] - numbers[2];
            numeral += convertToRomanNumeral(number);
        }else{
            numeral += numerals[0];
            number -= numbers[0];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNineHundred(int number, String numeral){
        if(number == 0){
            return "";
        }
        if(number < numbers[1] - numbers[2]){
            numeral = convertLessThanFourHundred(number, numeral);
        } else if(number < numbers[1]){
            numeral += numerals[2];
            numeral += numerals[1];
            number -= numbers[1] - numbers[2];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[1];
            number -= numbers[1];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanFourHundred(int number, String numeral){
        if(number == 0){
            return "";
        }
        if(number < numbers[2] - numbers[4]){
            numeral = convertLessThanNinety(number, numeral);
        }else if(number < numbers[2]){
            numeral += numerals[4];
            numeral += numerals[2];
            number -= numbers[2] - numbers[4];
            numeral += convertToRomanNumeral(number);
        }else{
            numeral += numerals[2];
            number -= numbers[2];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNinety(int number, String numeral){
        if(number == 0){
            return "";
        }
        if(number < numbers[3] - numbers[4]){
            numeral = convertLessThanForty(number, numeral);
        } else if(number < numbers[3]){
            numeral += numerals[4];
            numeral += numerals[3];
            number -= numbers[3] - numbers[4];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[3];
            number -= numbers[3];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanForty(int number, String numeral){
        if(number == 0){
            return "";
        }
        if(number < numbers[4] - numbers[6]){
            numeral = convertLessThanNine(number, numeral);
        } else if(number < numbers[4]){
            numeral += numerals[6];
            numeral += numerals[4];
            number -= numbers[4] - numbers[6];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[4];
            number -= numbers[4];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNine(int number, String numeral){
        if(number == 0){
            return "";
        }
        if(number < numbers[5] - numbers[6]){
            numeral = convertLessThanFour(number, numeral);
        } else if(number < numbers[5]){
            numeral += numerals[6];
            numeral += numerals[5];
            number -= numbers[5] - numbers[6];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[5];
            number -= numbers[5];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;

    }

    private String convertLessThanFour(int number, String numeral){
        if(number == 0){
            return "";
        }
        if(number < numbers[6] - numbers[8]){

        } else if(number < numbers[6]){

        } else{
            numeral += numerals[6];
            number -= numbers[6];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }
}