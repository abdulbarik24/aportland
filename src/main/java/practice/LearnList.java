package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnList {
//    public void testArray() {
//        String[] array = {"Texas", "Oregon", "Florida"};
//        System.out.println(Arrays.toString(array));
//        array[0] = "New York";
//        System.out.println(Arrays.toString(array));
//        array[3] = "Ohio";
//        System.out.println(Arrays.toString(array));

//    public void testList() {
//        List<String> lists = new ArrayList<>();
//        lists.add("One");
//        lists.add("Two");
//        lists.add("Three");
//
//        for (String value : lists) {
//            System.out.println(value);
//        }
        List<String> lists = new ArrayList<>();

        public void createNewList() {
            lists.add("One");
            lists.add("Two");
            lists.add("Three");
     }

        public void addMoreValueToTheList(){
            lists.add("Four");
            lists.add("Five");

    }

        public void printValueOfTheList() {
            System.out.println(lists);

        }

        public void removeValueFromTheList() {
            lists.remove("Three");
        }

        public void convertArrayToList() {
            String [] array = {"Java", "Python", "PHP", "C++"};
            System.out.println("Print Array value: " + Arrays.toString(array));

            List<String> list = new ArrayList<>();
            for (String lang : array) {
                list.add(lang);
            }

            list.add("Ruby");
            System.out.println("List value: " + list);
        }

        public void convartListToArray () {
            List<String> fruitList = new ArrayList<>();
            fruitList.add ("Mango");
            fruitList.add ("Banana");
            fruitList.add ("Apple");
            fruitList.add ("Strawberry");

            String[] fruitArray = fruitList.toArray(new String[fruitList.size()]);
            System.out.println("Printing value of Array: " + Arrays.toString(fruitArray));
            System.out.println("Printing value of List: " + fruitList);
        }



}
