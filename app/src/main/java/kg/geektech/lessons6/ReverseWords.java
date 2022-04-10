package kg.geektech.lessons6;

public class ReverseWords {

    public String reverseString(String words) {
        String[] reversedWords = words.split(" ");
        return reversedWords[4] + " " + reversedWords[3] + " " + reversedWords[2]
                + " " + reversedWords[1] + " " + reversedWords[0];
    }
}
