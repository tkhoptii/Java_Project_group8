package reham_package;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        frequencyOfCharacters("AAABBCDD");




    }

    public static void frequencyOfCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();

//        for (int i = 0; i < str.length(); i++) {
//
//            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
//
//            /*
//            char eachChar = str.charAt(i);
//            if(!map.containsKey(eachChar)){
//            map.put(eachChar,0);
//            }
//            map.put(eachChar,map.get(eachChar)+1);
//             */
//
//
//        }
//        System.out.println(map);
        for (char each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            }else {
                map.put(each, 1);
            }
        }

        System.out.println("map = " + map);

    }



}
