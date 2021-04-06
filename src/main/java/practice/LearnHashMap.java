package practice;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public void addHashMap() {
        HashMap<String,String> HMap = new HashMap<>();
        HMap.put("IE", "Internet Explorer");
        HMap.put("CHROME", "Google Chrome");
        HMap.put("Firefox", "Mozilla Firefox");
        HMap.put("Safari", "Mac Browser");

        //System.out.println("Browser Name: " + HMap.get("Safari"));


        for (Map.Entry map: HMap.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }

    public void validateHashMapKey() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vishal", 10);
        hashMap.put("Sachin", 30);
        hashMap.put("Vaibhay", 20);
        System.out.println(hashMap);
        System.out.println("Size of the map is: " + hashMap.size());


        if (hashMap.containsKey("Vishal")) {
            System.out.println("Age is: " + hashMap.get("Vishal"));
        } else {
            System.out.println("The key does not exist");
        }
    }


}
