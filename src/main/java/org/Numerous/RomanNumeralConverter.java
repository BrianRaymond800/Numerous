package org.Numerous;

public class RomanNumeralConverter {

    private final String[] numerals = {"M", "D", "C", "L", "X", "V", "I"};
    private final int[] numbers = {1000, 500, 100, 50, 10, 5, 1, 0, 0};

    public String convertToRomanNumeral(int number){
        int i = 0;
        String numeral = "";
        return convert(number, numeral, i);
    }

    private String convert(int number, String numeral, int i){
        if(number == 0){
            return "";
        }
        int subtractionNumber = i + 2 - (i % 2);
        if (number < numbers[i] - numbers[subtractionNumber]){
            numeral = convert(number, numeral, i + 1);
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
}