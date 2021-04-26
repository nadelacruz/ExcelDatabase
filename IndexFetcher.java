import java.util.ArrayList;

/** Fetches the indexes of the item objects with the specified parameters. */
public class IndexFetcher {
    /** Fetches the indexes with the specified topic and difficulty. */
    public static ArrayList<Integer> fetch(ArrayList<Item> database, String topic, String difficulty) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getTopic().equals(topic) && database.get(i).getDifficulty().equals(difficulty) && !database.get(i).getIsAnswered()) {
                temp.add(i);
            }
        }
        return temp;
    }

    /** Fetches the indexes with the specified difficulty. */
    public static ArrayList<Integer> fetch(ArrayList<Item> database, String difficulty) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getDifficulty().equals(difficulty) && !database.get(i).getIsAnswered()) {
                temp.add(i);
            }
        }
        return temp;
    }
}
