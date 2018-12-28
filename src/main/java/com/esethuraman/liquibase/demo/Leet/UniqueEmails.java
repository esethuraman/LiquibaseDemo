package com.esethuraman.liquibase.demo.Leet;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> resultMails = new HashSet<>();
        int atIndx, plusIndx;
        String localName, domainName;
        for(String email : emails) {
            if(email.length() > 0){
                atIndx = email.indexOf('@');
                localName = email.substring(0, atIndx);
                domainName = email.substring(atIndx, email.length());
                localName = localName.replace(".", "");
                plusIndx = localName.indexOf('+');
                if (plusIndx > -1) {
                    localName = localName.substring(0, plusIndx);
                }
                String resolvedMail = localName+domainName;
                resultMails.add(resolvedMail);

            }

        }
        return resultMails.size();
    }
    public static void main(String[] args) {
        UniqueEmails obj = new UniqueEmails();
        obj.numUniqueEmails(new String[]{"test.email+alex@leetcode.com"
                , "test.e.mail+bob.cathy@leetcode.com"
                ,"testemail+david@lee.tcode.com"});
    }
}
