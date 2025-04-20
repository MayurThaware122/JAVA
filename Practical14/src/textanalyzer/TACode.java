/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textanalyzer;

/**
 *
 * @author mayur
 */
public class TACode {
    private String inputString;

    public TACode(String inputString) {
        this.inputString = inputString;
    }

    public int getWordCount() {
        if (inputString == null || inputString.trim().isEmpty()) return 0;
        String[] words = inputString.trim().split("\\s+");
        return words.length;
    }

    public String getInputString() {
        return inputString;
    }

    public int getLength() {
        return inputString.length();
    }

    public int getSpaceCount() {
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == ' ') count++;
        }
        return count;
    }

    public int getLines() {
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == '\n') count++;
        }
        return count + 1; // assuming last line may not end with \n
    }

    public int getTabs() {
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == '\t') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String a = " hello world    Good \n A M Fasgje ";
        TACode obj1 = new TACode(a);
        System.out.println("Word Count: " + obj1.getWordCount());
        System.out.println("Length: " + obj1.getLength());
        System.out.println("Space Count: " + obj1.getSpaceCount());
        System.out.println("Tabs: " + obj1.getTabs());
        System.out.println("Lines: " + obj1.getLines());
    }

}
