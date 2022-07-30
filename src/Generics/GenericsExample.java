package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        //without generics
        List names = new ArrayList();
        names.add("Kelly");
        String name = (String) names.get(0);
        System.out.println("First name: "+ name);
        //names.add(7); //if you uncomment this, the compiler lets you add 7 to the list of names


        //with generics
        List<String> names2 = new ArrayList<>(); //here generics is used
        names2.add("Kelly");
        String name2 = names2.get(0); //don't need to caste to string
        System.out.println("First name: "+ name2);
        //name.add(2); //if you uncomment this, the compiler will show an error

        // advantage? compiler checks the type and only lets string type to be added to the list which makes the code safer
    }
}
