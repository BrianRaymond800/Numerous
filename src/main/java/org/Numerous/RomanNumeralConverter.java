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
        int i = 0;
        if(number == 0){
            return "";
        }
        int subtractionNumber = i + 2 - (i % 2);
        if (number < numbers[i] - numbers[subtractionNumber]){
            numeral = convertLessThanNineHundred(number, numeral);
        }else if(number < numbers[i]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[i];
            number -= numbers[i] - numbers[subtractionNumber];
            numeral += convertToRomanNumeral(number);
        }else{
            numeral += numerals[i];
            number -= numbers[i];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNineHundred(int number, String numeral){
        int i = 1;
        if(number == 0){
            return "";
        }
        int subtractionNumber = i + 2 - (i % 2);
        if(number < numbers[i] - numbers[subtractionNumber]){
            numeral = convertLessThanFourHundred(number, numeral);
        } else if(number < numbers[i]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[i];
            number -= numbers[i] - numbers[subtractionNumber];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[i];
            number -= numbers[i];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanFourHundred(int number, String numeral){
        int i = 2;
        if(number == 0){
            return "";
        }
        int subtractionNumber = i + 2 - (i % 2);
        if(number < numbers[i] - numbers[subtractionNumber]){
            numeral = convertLessThanNinety(number, numeral);
        }else if(number < numbers[i]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[i];
            number -= numbers[i] - numbers[subtractionNumber];
            numeral += convertToRomanNumeral(number);
        }else{
            numeral += numerals[i];
            number -= numbers[i];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNinety(int number, String numeral){
        int i = 3;
        if(number == 0){
            return "";
        }
        int subtractionNumber = i + 2 - (i % 2);
        if(number < numbers[i] - numbers[subtractionNumber]){
            numeral = convertLessThanForty(number, numeral);
        } else if(number < numbers[i]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[i];
            number -= numbers[i] - numbers[subtractionNumber];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[i];
            number -= numbers[i];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanForty(int number, String numeral){
        int i = 4;
        if(number == 0){
            return "";
        }
        int subtractionNumber = i + 2 - (i % 2);
        if(number < numbers[i] - numbers[subtractionNumber]){
            numeral = convertLessThanNine(number, numeral);
        } else if(number < numbers[i]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[i];
            number -= numbers[i] - numbers[subtractionNumber];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[i];
            number -= numbers[i];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }

    private String convertLessThanNine(int number, String numeral){
        int i = 5;
        if(number == 0){
            return "";
        }
        int subtractionNumber = i + 2 - (i % 2);
        if(number < numbers[i] - numbers[subtractionNumber]){
            numeral = convertLessThanFour(number, numeral);
        } else if(number < numbers[i]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[i];
            number -= numbers[i] - numbers[subtractionNumber];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[i];
            number -= numbers[i];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;

    }

    private String convertLessThanFour(int number, String numeral){
        int i = 6;
        if(number == 0){
            return "";
        }
        int subtractionNumber = i + 2 - (i % 2);
        if(number < numbers[6] - numbers[subtractionNumber]){

        } else if(number < numbers[i]){
            numeral += numerals[subtractionNumber];
            numeral += numerals[i];
            number -= numbers[i] - numbers[subtractionNumber];
            numeral += convertToRomanNumeral(number);
        } else{
            numeral += numerals[i];
            number -= numbers[i];
            numeral += convertToRomanNumeral(number);
        }
        return numeral;
    }
}