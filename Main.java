package com.company;

import java.util.*;

public class Main {

    static String generateLetter(){
        Random rndL = new Random();
        int anrnd = rndL.nextInt(27) + 1;
        String letter = "";
        switch(anrnd){
            case 1:
                letter = "a";
                break;
            case 2:
                letter = "b";
                break;
            case 3:
                letter = "c";
                break;
            case 4:
                letter = "d";
                break;
            case 5:
                letter = "e";
                break;
            case 6:
                letter = "f";
                break;
            case 7:
                letter = "g";
                break;
            case 8:
                letter = "h";
                break;
            case 9:
                letter = "i";
                break;
            case 10:
                letter = "j";
                break;
            case 11:
                letter = "k";
                break;
            case 12:
                letter = "l";
                break;
            case 13:
                letter = "m";
                break;
            case 14:
                letter = "n";
                break;
            case 15:
                letter = "o";
                break;
            case 16:
                letter = "p";
                break;
            case 17:
                letter = "q";
                break;
            case 18:
                letter = "r";
                break;
            case 19:
                letter = "s";
                break;
            case 20:
                letter = "t";
                break;
            case 21:
                letter = "u";
                break;
            case 22:
                letter = "v";
                break;
            case 23:
                letter = "w";
                break;
            case 24:
                letter = "x";
                break;
            case 25:
                letter = "y";
                break;
            case 26:
                letter = "z";
                break;
            default:
                break;
        }

        return letter;
    }

    static String generatePassword(int length){
        int i;
        String password = "";
        Random rnd = new Random();
        int ouiRND;
        int nonRND;
        int lowercase;
        String temp;
        String anotherTemp;
        for(i = 0; i< length; i++){
            nonRND = rnd.nextInt(3) + 1;
            if(nonRND == 1){
                temp = generateLetter();
                lowercase = rnd.nextInt(3) + 1;
                if(lowercase == 1){
                    anotherTemp = temp.toLowerCase();
                }
                else{
                    anotherTemp = temp.toUpperCase();
                }



                password += anotherTemp;
            }
            else{
                ouiRND = rnd.nextInt(10);
                password += Integer.toString(ouiRND);
            }
        }
        return password;
    }

    public static void main(String[] args) {
        String oui = generatePassword(20);
        System.out.println(oui);
    }
}
