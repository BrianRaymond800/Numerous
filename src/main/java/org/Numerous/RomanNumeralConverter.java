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
        int subtractionNumber = 0 + 2 - (0 % 2);
        if (number < numbers[0] - numbers[subtractionNumber]){
            numeral = convertLessThanNineHundred(number, numeral);
        }else if(number < numbers[0]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[0];
            number -= numbers[0] - numbers[subtractionNumber];
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
        int subtractionNumber = 1 + 2 - (1 % 2);
        if(number < numbers[1] - numbers[subtractionNumber]){
            numeral = convertLessThanFourHundred(number, numeral);
        } else if(number < numbers[1]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[1];
            number -= numbers[1] - numbers[subtractionNumber];
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
        int subtractionNumber = 2 + 2 - (2 % 2);
        if(number < numbers[2] - numbers[subtractionNumber]){
            numeral = convertLessThanNinety(number, numeral);
        }else if(number < numbers[2]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[2];
            number -= numbers[2] - numbers[subtractionNumber];
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
        int subtractionNumber = 3 + 2 - (3 % 2);
        if(number < numbers[3] - numbers[subtractionNumber]){
            numeral = convertLessThanForty(number, numeral);
        } else if(number < numbers[3]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[3];
            number -= numbers[3] - numbers[subtractionNumber];
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
        int subtractionNumber = 4 + 2 - (4 % 2);
        if(number < numbers[4] - numbers[subtractionNumber]){
            numeral = convertLessThanNine(number, numeral);
        } else if(number < numbers[4]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[4];
            number -= numbers[4] - numbers[subtractionNumber];
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
        int subtractionNumber = 5 + 2 - (5 % 2);
        if(number < numbers[5] - numbers[subtractionNumber]){
            numeral = convertLessThanFour(number, numeral);
        } else if(number < numbers[5]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[5];
            number -= numbers[5] - numbers[subtractionNumber];
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
        int subtractionNumber = 6 + 2 - (6 % 2);
        if(number < numbers[6] - numbers[subtractionNumber]){

        } else if(number < numbers[6]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[6];
            number -= numbers[6] - numbers[subtractionNumber];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[6];
            number -= numbers[6];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }
}