package Regex.AdvancedProblems.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAndModifyStrings {
    public static void replaceExtraSpace(){
        String text =  "This   is an      example with  multiple spaces.";

        String modify = text.replaceAll("\\s+"," ");

        System.out.print("Original text: "+text);
        System.out.println();
        System.out.print("Modify text: "+modify);
    }
    public static void main(String[] args) {
          replaceExtraSpace();
    }
}
