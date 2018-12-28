package com.esethuraman.liquibase.demo.Leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MissingSubstrings {

    public static List<String> missingWords(String s, String t) {
        int i=0, j=0;
        List<String> missingWords = new LinkedList<>();

        String[] sArr = s.trim().split(" ");
        String[] tArr = t.trim().split(" ");

        while((i < sArr.length) && (j < tArr.length)){
            if((sArr[i]).equals(tArr[j])){
                i++;
                j++;
            }
            else{
                missingWords.add(sArr[i]);
                i++;
            }
        }

        while(i < sArr.length){
            missingWords.add(sArr[i]);
            i++;
        }

        System.out.println(missingWords);
        return missingWords;

    }

    public static void main(String[] args) {
        String s = "I am using Hackerrank to improve programming";
        String t = "am Hackerrank to improve";

        missingWords(s, t);
    }
}
