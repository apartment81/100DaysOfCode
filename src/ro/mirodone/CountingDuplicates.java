package ro.mirodone;


import java.util.HashMap;

 class CountingDuplicates {

     HashMap duplicateCount(String text) {


        //Creating a HashMap containing char as a key and occurrences as  a value

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        //Converting given string to char array

        char[] strArray = text.toCharArray();

        //checking each char of strArray

        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1

                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value

                charCountMap.put(c, 1);
            }
        }

        return charCountMap;

       /*
        HashMap<String, Integer> counter = new HashMap();
        for (char c : text.toCharArray()) {
            String str = c + "";
            if (!counter.containsKey(str)) {
                counter.put(str, 1);
            } else {
                counter.put(str, counter.get(str) + 1);
            }
        }
        return counter;*/

    }

}
