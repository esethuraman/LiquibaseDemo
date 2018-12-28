package com.esethuraman.liquibase.demo.Leet;

public class StringDecode {
    public static String decode(String encoded){

        boolean isFreshChar = true;
        int currentCharAscii = 0;
        String decoded = "";

        for(int i=encoded.length()-1; i>=0; i--){
            if(isFreshChar){
                char c = encoded.charAt(i);
                currentCharAscii = Character.getNumericValue(encoded.charAt(i));
                isFreshChar = false;
            }
            else{
                currentCharAscii = (currentCharAscii * 10 ) + Character.getNumericValue(encoded.charAt(i));
                if(isCompleteAsciiCode(currentCharAscii)){
                    decoded += (char) currentCharAscii;
                    isFreshChar = true;
                }

            }
        }

        return decoded;
    }

    private static boolean isCompleteAsciiCode(int code){
        return ((code == 32) || ((code >= 65) && (code <=90)) || ((code >= 97) && (code <=122)));
    }

    public static void main(String[] args) {

        System.out.println(decode("23511011501782351112179911801562340161171141148"));
//        System.out.println((char) 117);
    }
}
