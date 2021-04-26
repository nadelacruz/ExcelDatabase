import java.util.ArrayList;

/** Chooses a random item among the different indexes, given the topic and difficulty. */
public class RandomizedItemChooser {
    /** Chooses a random item in the database given the topic and difficulty. */
    public static Item choose(ArrayList<Item> database, String topic, String difficulty) {
        int min = 0;
        int max = IndexFetcher.fetch(database, topic, difficulty).size();
        int randomIndex = (int) (Math.random() * (max - min)) + min;
        int randomTrueIndex = IndexFetcher.fetch(database, topic, difficulty).get(randomIndex);
        database.get(randomTrueIndex).changeIsAnsweredToTrue();
        return database.get(randomTrueIndex);
    }

    /** Chooses a random item in the database given the difficulty. */
    public static Item choose(ArrayList<Item> database, String difficulty) {
        int min = 0;
        int max = IndexFetcher.fetch(database, difficulty).size();
        int randomIndex = (int) (Math.random() * (max - min)) + min;
        int randomTrueIndex = IndexFetcher.fetch(database, difficulty).get(randomIndex);
        database.get(randomTrueIndex).changeIsAnsweredToTrue();
        return database.get(randomTrueIndex);
    }
}
