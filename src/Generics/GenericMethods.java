package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'a','b','c'};
    static Integer[] intArray = {1,2,3,4,5,6};
    static Boolean[] boolArray = {true,false,true};

    //method to convert array to list - WITHOUT USING GENERIC
//    public static List arrayToList(Object[] array, List<Object> list){ //every class has object as superclass so it lets you use any type
//        for(Object object : array){
//            list.add(object);
//        }
//
//        return list;
//    }

    //USING GENETIC , T - type variable
    public static <T> List<T> arrayToList(T[] array, List<T> list){ //T also lets you use any type but it should be the same the next time you use it
        for(T object : array){
            list.add(object);
        }

        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray,new ArrayList<>());
        List<Integer> intList = arrayToList(intArray,new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray,new ArrayList<>());
        //In the above line, instead of boolean, if we specify the list type to String, we don't get any compile time error but if we try to perform any operation,
        //we get the ClassCastException
      //List<String> strList = arrayToList(boolArray,new ArrayList<>());
        //System.out.println(srtList.get(0));

        //now, after modifying the method and using T, we get a compile time error, if we try to do above
       // List<String> strList = arrayToList(boolArray,new ArrayList<>());


    }
}
