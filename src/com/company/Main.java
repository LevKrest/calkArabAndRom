package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String number1;
    static String number2;
    static int numberInt1;
    static int numberInt2;

    static int romOrArab1;
    static int romOrArab2;
    static int result;
    static char operation;

    public static void main(String[] args) {
        System.out.println("Write an expression using 2 numbers (from 1 to 10) and operations +,-,*,/");

        String userInput = scanner.nextLine();

        //создаем массив из символов
        char inputInChar [] =new char[10];


        //ищем знак
        for (int i=0;i<userInput.length();i++) {

            inputInChar [i] = userInput.charAt(i);

            switch (inputInChar[i]){
                case '+':  operation = '+';break;
                case '-':  operation = '-';break;
                case '*':  operation = '*';break;
                case '/':  operation = '/';break;
            }
        }

        //проверка операции
        //System.out.println(operation);

        String inputInString = String.valueOf(inputInChar);
        String[] numberArraySplit = inputInString.split("[+-/*]"); //разделяем массив на: до знака, после занка

        String splitNumber1 = numberArraySplit[0];
        String splitNumber2Long = numberArraySplit[1];
        String splitNumber2 = splitNumber2Long.trim(); //удаляем пустые элементы

        number1 = splitNumber1;
        number2 = splitNumber2;

        //проверка чисел
        //System.out.println("number 1: "+ number1+ " number 2: " + number2);

        //какое число? Арабское или Римское
        switch (number1){
            case "I": romOrArab1=1;break;
            case "II": romOrArab1=1;break;
            case "III": romOrArab1=1;break;
            case "IV": romOrArab1=1;break;
            case "V": romOrArab1=1;break;
            case "VI": romOrArab1=1;break;
            case "VII": romOrArab1=1;break;
            case "VIII": romOrArab1=1;break;
            case "IX": romOrArab1=1;break;
            case "X": romOrArab1=1;break;
            default: romOrArab1=0; break;
        }
        switch (number2){
            case "I": romOrArab2=1;break;
            case "II": romOrArab2=1;break;
            case "III": romOrArab2=1;break;
            case "IV": romOrArab2=1;break;
            case "V": romOrArab2=1;break;
            case "VI": romOrArab2=1;break;
            case "VII": romOrArab2=1;break;
            case "VIII": romOrArab2=1;break;
            case "IX": romOrArab2=1;break;
            case "X": romOrArab2=1;break;
            default: romOrArab2=0; break;
        }

        if ( romOrArab1==1 && romOrArab2==0 ) {throw new InputMismatchException("Your operation does not meet the requirements");}
        if ( romOrArab1==0 && romOrArab2==1 ) {throw new InputMismatchException("Your operation does not meet the requirements");}




      if (romOrArab1==1){
          numberInt1=romInArab(number1);
          numberInt2=romInArab(number2);
          if (numberInt1==0 || numberInt2==0 ||numberInt1>10 || numberInt2>10){throw new InputMismatchException("Your operation does not meet the requirements");}
          else{
          result = calc(numberInt1, numberInt2, operation);
          //System.out.println("Result for Roman numerals");
              if (result<0){throw new InputMismatchException("there are no negative numbers in the Roman system");}
          String resultRoman = arabInRom(result);
          System.out.println(resultRoman);}
      }
      else {
          numberInt1= Integer.parseInt(number1);
          numberInt2= Integer.parseInt(number2);
          if (numberInt1==0 || numberInt2==0 || numberInt1>10 || numberInt2>10){throw new InputMismatchException("Your operation does not meet the requirements");}
          else{
          result = calc(numberInt1, numberInt2, operation);
          //System.out.println("Result for Arabic numerals");
          System.out.println(result);}
      }

    }


    static public int romInArab(String numInRum){
        int rimToArab=0;
        if (numInRum.equals("I")) rimToArab= 1;
        if (numInRum.equals("II")) rimToArab= 2;
        if (numInRum.equals("III")) rimToArab= 3;
        if (numInRum.equals("IV")) rimToArab= 4;
        if (numInRum.equals("V")) rimToArab= 5;
        if (numInRum.equals("VI")) rimToArab= 6;
        if (numInRum.equals("VII")) rimToArab= 7;
        if (numInRum.equals("VIII")) rimToArab= 8;
        if (numInRum.equals("IX")) rimToArab= 9;
        if (numInRum.equals("X")) rimToArab= 10;
        if (numInRum.equals("XI")) rimToArab= 11;
        if (numInRum.equals("XII")) rimToArab= 12;
        if (numInRum.equals("XIII")) rimToArab= 13;
        if (numInRum.equals("XIV")) rimToArab= 14;
        if (numInRum.equals("XV")) rimToArab= 15;
        if (numInRum.equals("XVI")) rimToArab= 16;
        if (numInRum.equals("XVII")) rimToArab= 17;
        if (numInRum.equals("XVIII")) rimToArab= 18;
        if (numInRum.equals("XIX")) rimToArab= 19;
        if (numInRum.equals("XX")) rimToArab= 20;
        if (numInRum.equals("XXI")) rimToArab= 21;
        if (numInRum.equals("XXII")) rimToArab= 22;
        if (numInRum.equals("XXIII")) rimToArab= 23;
        if (numInRum.equals("XXIV")) rimToArab= 24;
        if (numInRum.equals("XXV")) rimToArab= 25;
        if (numInRum.equals("XXVI")) rimToArab= 26;
        if (numInRum.equals("XXVII")) rimToArab= 27;
        if (numInRum.equals("XXVIII")) rimToArab= 28;
        if (numInRum.equals("XXIX")) rimToArab= 29;
        if (numInRum.equals("XXX")) rimToArab= 30;
        if (numInRum.equals("XXXI")) rimToArab= 31;
        if (numInRum.equals("XXXII")) rimToArab= 32;
        if (numInRum.equals("XXXIII")) rimToArab= 33;
        if (numInRum.equals("XXXIV")) rimToArab= 34;
        if (numInRum.equals("XXXV")) rimToArab= 35;
        if (numInRum.equals("XXXVI")) rimToArab= 36;
        if (numInRum.equals("XXXVII")) rimToArab= 37;
        if (numInRum.equals("XXXVIII")) rimToArab= 38;
        if (numInRum.equals("XXXIX")) rimToArab= 39;
        if (numInRum.equals("XL")) rimToArab= 40;
        if (numInRum.equals("XLI")) rimToArab= 41;
        if (numInRum.equals("XLII")) rimToArab= 42;
        if (numInRum.equals("XLIII")) rimToArab= 43;
        if (numInRum.equals("XLIV")) rimToArab= 44;
        if (numInRum.equals("XLV")) rimToArab= 45;
        if (numInRum.equals("XLVI")) rimToArab= 46;
        if (numInRum.equals("XLVII")) rimToArab= 47;
        if (numInRum.equals("XLVIII")) rimToArab= 48;
        if (numInRum.equals("XLIX")) rimToArab= 49;
        if (numInRum.equals("L")) rimToArab= 50;
        if (numInRum.equals("LI")) rimToArab= 51;
        if (numInRum.equals("LII")) rimToArab= 52;
        if (numInRum.equals("LIII")) rimToArab= 53;
        if (numInRum.equals("LIV")) rimToArab= 54;
        if (numInRum.equals("LV")) rimToArab= 55;
        if (numInRum.equals("LVI")) rimToArab= 56;
        if (numInRum.equals("LVII")) rimToArab= 57;
        if (numInRum.equals("LVIII")) rimToArab= 58;
        if (numInRum.equals("LIX")) rimToArab= 59;
        if (numInRum.equals("LX")) rimToArab= 60;
        if (numInRum.equals("LXI")) rimToArab= 61;
        if (numInRum.equals("LXII")) rimToArab= 62;
        if (numInRum.equals("LXIII")) rimToArab= 63;
        if (numInRum.equals("LXIV")) rimToArab= 64;
        if (numInRum.equals("LXV")) rimToArab= 65;
        if (numInRum.equals("LXVI")) rimToArab= 66;
        if (numInRum.equals("LXVII")) rimToArab= 67;
        if (numInRum.equals("LXVIII")) rimToArab= 68;
        if (numInRum.equals("LXIX")) rimToArab= 69;
        if (numInRum.equals("LXX")) rimToArab= 70;
        if (numInRum.equals("LXXI")) rimToArab= 71;
        if (numInRum.equals("LXXII")) rimToArab= 72;
        if (numInRum.equals("LXXIII")) rimToArab= 73;
        if (numInRum.equals("LXXIV")) rimToArab= 74;
        if (numInRum.equals("LXXV")) rimToArab= 75;
        if (numInRum.equals("LXXVI")) rimToArab= 76;
        if (numInRum.equals("LXXVII")) rimToArab= 77;
        if (numInRum.equals("LXXVIII")) rimToArab= 78;
        if (numInRum.equals("LXXIX")) rimToArab= 79;
        if (numInRum.equals("LXXX")) rimToArab= 80;
        if (numInRum.equals("LXXXI")) rimToArab= 81;
        if (numInRum.equals("LXXXII")) rimToArab= 82;
        if (numInRum.equals("LXXXIII")) rimToArab= 83;
        if (numInRum.equals("LXXXIV")) rimToArab= 84;
        if (numInRum.equals("LXXXV")) rimToArab= 85;
        if (numInRum.equals("LXXXVI")) rimToArab= 86;
        if (numInRum.equals("LXXXVII")) rimToArab= 87;
        if (numInRum.equals("LXXXVIII")) rimToArab= 88;
        if (numInRum.equals("LXXXIX")) rimToArab= 89;
        if (numInRum.equals("XC")) rimToArab= 90;
        if (numInRum.equals("XCI")) rimToArab= 91;
        if (numInRum.equals("XCII")) rimToArab= 92;
        if (numInRum.equals("XCIII")) rimToArab= 93;
        if (numInRum.equals("XCIV")) rimToArab= 94;
        if (numInRum.equals("XCV")) rimToArab= 95;
        if (numInRum.equals("LXCVI")) rimToArab= 96;
        if (numInRum.equals("XCVII")) rimToArab= 97;
        if (numInRum.equals("XCVIII")) rimToArab= 98;
        if (numInRum.equals("XCIX")) rimToArab= 99;
        if (numInRum.equals("C")) rimToArab= 100;


        return rimToArab;

    }


    private static String arabInRom (int b) {
        String arabToRim= "";
        if (b==1) arabToRim= "I";
        if (b==2) arabToRim= "II";
        if (b==3) arabToRim= "III";
        if (b==4) arabToRim= "IV";
        if (b==5) arabToRim= "V";
        if (b==6) arabToRim= "VI";
        if (b==7) arabToRim= "VII";
        if (b==8) arabToRim= "VIII";
        if (b==9) arabToRim= "IX";
        if (b==10) arabToRim= "X";
        if (b==11) arabToRim= "XI";
        if (b==12) arabToRim= "XII";
        if (b==13) arabToRim= "XIII";
        if (b==14) arabToRim= "XIV";
        if (b==15) arabToRim= "XV";
        if (b==16) arabToRim= "XVI";
        if (b==17) arabToRim= "XVII";
        if (b==18) arabToRim= "XVIII";
        if (b==19) arabToRim= "XIX";
        if (b==20) arabToRim= "XX";
        if (b==21) arabToRim= "XXI";
        if (b==22) arabToRim= "XXII";
        if (b==23) arabToRim= "XXIII";
        if (b==24) arabToRim= "XXIV";
        if (b==25) arabToRim= "XXV";
        if (b==26) arabToRim= "XXVI";
        if (b==27) arabToRim= "XXVII";
        if (b==28) arabToRim= "XXVIII";
        if (b==29) arabToRim= "XXIX";
        if (b==30) arabToRim= "XXX";
        if (b==31) arabToRim= "XXXI";
        if (b==32) arabToRim= "XXXII";
        if (b==33) arabToRim= "XXXIII";
        if (b==34) arabToRim= "XXXIV";
        if (b==35) arabToRim= "XXXV";
        if (b==36) arabToRim= "XXXVI";
        if (b==37) arabToRim= "XXXVII";
        if (b==38) arabToRim= "XXXVIII";
        if (b==39) arabToRim= "XXXIX";
        if (b==40) arabToRim= "XL";
        if (b==41) arabToRim= "XLI";
        if (b==42) arabToRim= "XLII";
        if (b==43) arabToRim= "XLIII";
        if (b==44) arabToRim= "XLIV";
        if (b==45) arabToRim= "XLV";
        if (b==46) arabToRim= "XLVI";
        if (b==47) arabToRim= "XLVII";
        if (b==48) arabToRim= "XLVIII";
        if (b==49) arabToRim= "XLIX";
        if (b==50) arabToRim= "L";
        if (b==51) arabToRim= "LI";
        if (b==52) arabToRim= "LII";
        if (b==53) arabToRim= "LIII";
        if (b==54) arabToRim= "LIV";
        if (b==55) arabToRim= "LV";
        if (b==56) arabToRim= "LVI";
        if (b==57) arabToRim= "LVII";
        if (b==58) arabToRim= "LVIII";
        if (b==59) arabToRim= "LIX";
        if (b==60) arabToRim= "LX";
        if (b==61) arabToRim= "LXI";
        if (b==62) arabToRim= "LXII";
        if (b==63) arabToRim= "LXIII";
        if (b==64) arabToRim= "LXIV";
        if (b==65) arabToRim= "LXV";
        if (b==66) arabToRim= "LXVI";
        if (b==67) arabToRim= "LXVII";
        if (b==68) arabToRim= "LXVIII";
        if (b==69) arabToRim= "LXIX";
        if (b==70) arabToRim= "LXX";
        if (b==71) arabToRim= "LXXI";
        if (b==72) arabToRim= "LXXII";
        if (b==73) arabToRim= "LXXIII";
        if (b==74) arabToRim= "LXXIV";
        if (b==75) arabToRim= "LXXV";
        if (b==76) arabToRim= "LXXVI";
        if (b==77) arabToRim= "LXXVII";
        if (b==78) arabToRim= "LXXVIII";
        if (b==79) arabToRim= "LXXIX";
        if (b==80) arabToRim= "LXXX";
        if (b==81) arabToRim= "LXXXI";
        if (b==82) arabToRim= "LXXXII";
        if (b==83) arabToRim= "LXXXII";
        if (b==84) arabToRim= "LXXXIV";
        if (b==85) arabToRim= "LXXXV";
        if (b==86) arabToRim= "LXXXVI";
        if (b==87) arabToRim= "LXXXVII";
        if (b==88) arabToRim= "LXXXVIII";
        if (b==89) arabToRim= "LXXXIX";
        if (b==90) arabToRim= "XC";
        if (b==91) arabToRim= "XCI";
        if (b==92) arabToRim= "XCII";
        if (b==93) arabToRim= "XCIII";
        if (b==94) arabToRim= "XCIV";
        if (b==95) arabToRim= "XCV";
        if (b==96) arabToRim= "XCVI";
        if (b==97) arabToRim= "XCVII";
        if (b==98) arabToRim= "XCVIII";
        if (b==99) arabToRim= "XCIX";
        if (b==100) arabToRim= "C";
        return arabToRim;
    }


    public static int calc(int num1, int num2, char oper) {
        int calkResalt = 0;
        switch (oper) {
            case '+': {
                calkResalt = num1 + num2;
                break;
            }
            case '-': {
                calkResalt = num1 - num2;
                break;
            }
            case '*': {
                calkResalt = num1 * num2;
                break;
            }
            case '/': {
                calkResalt = num1 / num2;
                break;
            }

        }
        return calkResalt;
    }

}
