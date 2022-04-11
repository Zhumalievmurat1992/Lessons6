package kg.geektech.lessons6;

public class ReverseWords {

    public String reverseString(String words) {


        String[]  reversedWords = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = reversedWords.length - 1; i >=0 ; i--) {
            stringBuilder.append(reversedWords[i]+" ");
        }
        return stringBuilder.toString().trim();

        }

    }

