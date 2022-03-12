public class ServerNameGenerator {
    static String[] adjectives = {"charming", "Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Smooth", "Tasty"};

    static String[] nouns = {"man", "woman", "teacher", "doctor", "beans", "dog", "monkey", "music", "home", "school"};


public static String getValue(String[] arr){
    int random = (int) (Math.random() * arr.length -1);
    System.out.println(random);
    return arr[random];
}

    public static void main(String[] args) {

    for(String adjective : adjectives){
        System.out.println(adjective);
    }
    for (String noun : nouns){
        System.out.println(noun);
    }
        String adj = getValue(adjectives);
        String noun = getValue(nouns);
        System.out.println("Here is your server name:");
        System.out.println(adj + "-" + noun);
    }
}
