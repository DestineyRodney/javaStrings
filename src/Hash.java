import java.util.HashMap;

public class Hash {
    HashMap<String, Integer> inventory = new HashMap<>();

    public static void main (String[] args){
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Keychain", 6);
        inventory.put("Braclets", 15);
        inventory.put("Dog Collars", 3);
        System.out.println(inventory);
        System.out.println(inventory.get("Keychain"));
        System.out.println(inventory.getOrDefault("Dog leash", 0));
    }

}
