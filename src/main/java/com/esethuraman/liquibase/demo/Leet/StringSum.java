package com.esethuraman.liquibase.demo.Leet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StringSum {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;

        List<Character> result = new LinkedList<>();

        int sum = 0, carryOver = 0;
        while ((l1 >= 0) && (l2 >= 0)) {
            sum = Character.getNumericValue(num1.charAt(l1)) + Character.getNumericValue(num2.charAt(l2)) + carryOver;
            carryOver = sum/10;
            sum = sum%10;

            result.add(Character.forDigit(sum, 10));
            l1--; l2--;
        }

        while(l1 >= 0) {
            sum = Character.getNumericValue(num1.charAt(l1)) + carryOver;
            carryOver = sum/10;
            result.add(Character.forDigit(sum, 10));
            l1--;
        }

        while(l2 >= 0) {
            sum = Character.getNumericValue(num2.charAt(l2)) + carryOver;
            carryOver = sum/10;
            sum %= 10;
            result.add(Character.forDigit(sum, 10));
            l2--;
        }

        if (carryOver > 0) {
            result.add('1');
        }

        Collections.reverse(result);
        StringBuilder sb = new StringBuilder(result.size());
        for(Character c : result) {
            sb.append(c);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        StringSum s = new StringSum();
        s.addStrings("9" , "98");
        s.addStrings("2000008768" , "8687");
        s.addStrings("4857293789" , "3245111");
    }

}
