package practice;

import java.util.Arrays;

public class LearnStringMethod {
    public void learnIndexOf() {
        String myStr = "Hello planet earth, you are a great planet";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("test"));
        System.out.println(myStr.indexOf("e", 5));
    }

    public void learnSubString(String serchTxt) {
        String myStr = "Hello planet earth, you are a great planet";
        int index = myStr.indexOf("String serchTxt");
        System.out.println(index);
        String substringWord = myStr.substring(index);
        System.out.println(substringWord);
        String word = myStr.substring(index, index + serchTxt.length());
        System.out.println(word);

    }

    public void learnLength() {
        String txt = "earth";
        System.out.println(txt.length());
    }

    public void learnReplace() {
        String myString = "Hello planet earth, you are a great planet";
        System.out.println(myString.replace('l', '1'));
        System.out.println(myString.replaceAll("earth", "my world"));
    }

    public void learnTrim() {
        String myStr = "       Hello       ";    //"Hello"
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }


    public void learnCharAt() {
        String myStr = "Hello world";
//        System.out.println(myStr.charAt(1));

        for (int i = 0; i < myStr.length(); i++) {
            System.out.println(myStr.charAt(i));
        }

    }


    public void learnValueOf() {
        int value = 10;
        String s1 = String.valueOf(value);
        System.out.println(s1 + 20);
    }

    public void learnSplit() {
        String names = "John, Ali, Mathew, Abraham";
        String[] nameArray = names.split(",");
        //System.out.println(Arrays.toString(nameArray));
        for (String name : nameArray) {
            System.out.println(name);
        }

    }

   public void spiltMethod () {
//        String sentence = "I live in New York";
//        String reverse = "";
//        for (int i = sentence.length() -1; i >= 0; i--) {
//            reverse += sentence.charAt(i);
//        }
//        System.out.println(reverse);

    String sentence = "I live in New York";
    String reverse = "";
    String[] words = sentence.split("");

    for(int i = words.length - 1; i >= 0; i--) {
        reverse += words [i];
    }
//       System.out.println(reverse);


    String sentences = "I live in New York";
    String[] word = sentence.split("");
    for (int i = word.length -1; i >= 0; i--){
        System.out.print("" + word[i]);
    }

    

}


    public void showDate() {
    }
}

