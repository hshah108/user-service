package com.techotip.userservice;

// package whatever; // don't place package name!
// write a java 8 program to find second non repititive character in given string
// input :: nisum consulting
// output :: c
import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class MyCode {
    public static void main (String[] args) {
        String s="nisum consulting";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if(c == ' ')
                continue;
            Integer x = map.get(c);
            if(x == null) {
                map.put(c,1);
            } else {
                map.put(c,++x);
            }
        }

        boolean first = false;
        Set<Character> set = map.keySet();
        for(Iterator<Character> i = set.iterator(); i.hasNext();) {
            Character ch = i.next();
            Integer x = map.get(ch);
            if(first && x == 1) {
                System.out.println(ch);
                break;
            }
            if(x==1) {
                first = true;
            }

        }
    }
}
