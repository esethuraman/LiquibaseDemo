package com.esethuraman.liquibase.demo.Leet;

import java.util.HashSet;
import java.util.Set;

public class UniqueMailsOptimized {
    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();
        boolean isNotPlus = false, isAfterAt = false;
        StringBuilder sb;
        char[] arr;
        for(String email : emails) {
            sb = new StringBuilder();
            arr = email.toCharArray();
            for(char ch : arr) {
                if (isNotPlus || isAfterAt) {
                    if(ch == '+')
                    if((ch != '.') && ()) {

                    }
                }
            }
        }
        return 0;
    }
}
