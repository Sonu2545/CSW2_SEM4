import java.util.HashMap;

public class MostOccurringWords {
    public static void findMostOccurringWords(String text) {
        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a Hashtable to store word frequencies
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        // Iterate through the words and update their frequencies in the Hashtable
        for (String word : words) {
            // Remove any punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Update word frequency
            int frequency = wordFrequencyMap.getOrDefault(word, 0);
            wordFrequencyMap.put(word, frequency + 1);
        }

        // Find the most occurring words
        int maxFrequency = 0;
        for (String word : wordFrequencyMap.keySet()) {
            int frequency = wordFrequencyMap.get(word);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Print the most occurring words
        System.out.println("Most occurring words in the string:");
        for (String word : wordFrequencyMap.keySet()) {
            if (wordFrequencyMap.get(word) == maxFrequency) {
                System.out.println(word + " - Frequency: " + maxFrequency);
            }
        }
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Integer eget massa mauris. Sed nec ullamcorper purus, " +
                "eget laoreet felis. Sed consequat elit in feugiat ultricies. " +
                "Praesent vel sapien at magna vestibulum mollis at in ipsum. " +
                "Aenean in nunc id risus cursus venenatis. Pellentesque rutrum " +
                "sapien nec neque tincidunt, at consectetur nisi tristique.";

        findMostOccurringWords(text);
    }
}