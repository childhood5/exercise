package com.company.exercise1;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstExercise {

    public String store(HashMap<?, ?>[] array) {
        // finding the time before the operation is executed
        long start = System.currentTimeMillis();

        String text = "";
        for (HashMap<?, ?> hashMap : array) {
            for (Entry<?, ?> entry : hashMap.entrySet()) {
                text += entry.getKey() + "=" + entry.getValue() + ";";
            }
            if (!"".equals(text)) {
                text = text.substring(0, text.length() - 1);
                text += "\n";
            }
        }
        // finding the time after the operation is executed
        long end = System.currentTimeMillis();
        // finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;
        System.out.println(sec + " seconds");

        return text;
    }

    public HashMap<?, ?>[] load(String text) {
        // finding the time before the operation is executed
        long start = System.currentTimeMillis();
        
        int length = (int) text.chars().filter(ch -> ch == '\n').count();
        HashMap<?, ?>[] array = new HashMap[length];
        HashMap<String, String> map = new HashMap<String, String>();
        String key = "";
        String value = "";
        int indexArray = 0;
        boolean keyFlag = false;
        boolean valueFlag = false;
        char[] charArray = text.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            if(charArray[i] == '=') {
                map.put(key, value);
                keyFlag = true;
                valueFlag = true;
                value = "";
            } else if(charArray[i] == ';') {
                map.put(key, value);
                keyFlag = false;
                valueFlag = false;
                key = "";
            } else if(charArray[i] == '\n') {
                map.put(key, value);
                array[indexArray] = map;
                indexArray++;
                map = new HashMap<String, String>();
                key = "";
                keyFlag = false;
                valueFlag = false;
            } else {
                if(!keyFlag) {
                    key += charArray[i];
                }
                if(valueFlag) {
                    value += charArray[i];
                }
            }
        }
        // finding the time after the operation is executed
        long end = System.currentTimeMillis();
        // finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;
        System.out.println(sec + " seconds");
        return array;
    }
}
