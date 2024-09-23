package org.freCodeCamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;

public class Checker {
    private String word;
    private String result;

    public Checker(String word) {
        this.word = word;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Boolean wordChecker() {
        String regex = "[_\\-\\s\\,\\\\,\\/,\\(),\\.]";
        String updatedWord = getWord().replace(regex, "").toLowerCase();

        ArrayList<String> lettersArray = new ArrayList<String>();
        lettersArray.add(Arrays.toString(updatedWord.split("")));

        for (int i = 0; i < lettersArray.size(); i++) {
            if (lettersArray.get(i) == lettersArray.get(lettersArray.size() - 1 - i)){
                setResult(getWord() + " is a palindrome!");
            } else {
                setResult(getWord() + " is not a palindrome!");
                break;
            }
        }
        return getWord().matches(regex);
    }
}
