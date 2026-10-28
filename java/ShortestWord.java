public class ShortestWord {

    public static String getShortestWordCount(String sentence) {
        int shortestWordCount = Integer.MAX_VALUE;
        String shortestWord = "";
        int index = 0;
        int wordCount = 0;

        while (index < sentence.length()) {
            char c = sentence.charAt(index);
            if (!Character.isAlphabetic(c)) {
                if (wordCount != 0 && wordCount < shortestWordCount) {
                    shortestWordCount = wordCount;
                    shortestWord = sentence.substring(index - wordCount, index);
                }
                wordCount = 0;
            } else {
                wordCount++;
            }
            index++;
        }

        if (wordCount != 0 && wordCount < shortestWordCount) {
            shortestWordCount = wordCount;
            shortestWord = sentence.substring(index - wordCount, index);
        }

        return shortestWord;
    }
}
