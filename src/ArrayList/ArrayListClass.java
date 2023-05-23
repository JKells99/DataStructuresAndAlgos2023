package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {

//        Defining a array list
//        Initial capicity is 10 unless otherwise defined
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");

        System.out.println(stringArrayList.get(1));







        System.out.println(stringArrayList);

//        Traverse an array list for a for loop

        for (int i = 0; i < stringArrayList.size() ; i++) {
            String letter = stringArrayList.get(i);
            System.out.println(letter);

        }


// For Each Loop to itterate of the list array
        for (String letter: stringArrayList) {
            System.out.println(letter);

        }

//        Itterator traversal

        Iterator<String> iterator = stringArrayList.iterator();
        while(iterator.hasNext()){
            String letter = iterator.next();
            System.out.println(letter);
        }

//        Searching using array list

        for(String letter : stringArrayList){
            if(letter.equals("F")){
                System.out.println("Letter Found!");
                break;
            }
            else {
                System.out.println("Not Found!");
            }
        }

//        Index Of

        int index = stringArrayList.indexOf("B");

        System.out.println("The element is found at index: " + index);

        //    Remove from a array list

        stringArrayList.remove("A");

        System.out.println(stringArrayList);

//      QUESTION FOR TODAY


    }




}
