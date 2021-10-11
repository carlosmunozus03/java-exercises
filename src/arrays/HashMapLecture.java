package arrays;

import java.util.HashMap;

public class HashMapLecture {
    public static void main(String[] args) {
        HashMap<String, String> userNames = new HashMap<>();
        userNames.put("Ryan", "ryanonsing");
        userNames.put("Zach", "zgulde");
        userNames.put("Fernando", "fmendoza");
        userNames.put("Justin", "jreich5");
        System.out.println(userNames);

        System.out.println(userNames.get("Zach"));
        System.out.println(userNames.get("F"));
        System.out.println(userNames.getOrDefault("Justin", "jreich5"));

        System.out.println(userNames.containsKey("Justin"));
        System.out.println(userNames.containsKey("fmendoza"));

        HashMap<String, String> username = new HashMap<>();
        username.put("Raynor", "jimmy");
        System.out.println(username);

        System.out.println(username.putIfAbsent("Zach", "Attack"));
        System.out.println(username.putIfAbsent("Zach","codeup21"));
        System.out.println(username);

        System.out.println(username.remove("Zach"));
        System.out.println(username);

        System.out.println(username.replace("Zack","Teodoro"));
        System.out.println(username);

        System.out.println( username.isEmpty());
    }
}
//        .put	set a key-value pair
//        .get	return the value associated with the given key, or null
//        .getOrDefault	like .get, but with a defined value instead of null
//        .containsKey	check if a key exists in the map
//        .containsValue	check if a value exists in the map

//        .putIfAbsent	only set a key-value pair if it does not exist
//        .remove	remove a key-value pair from the map
//        .replace	replace a value at a given key
//        .clear	empty the map
//        .isEmpty	check if the map is empty