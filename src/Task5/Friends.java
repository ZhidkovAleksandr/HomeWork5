package Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {

    public static void main(String[] args) {

        ArrayList<String> friedsArray = new ArrayList<>();
        friedsArray.add("Tom");
        friedsArray.add("Bob");
        friedsArray.add("Anna");
        friedsArray.add("Lisa");
        friedsArray.add("Zak");
        Collections.sort(friedsArray);
        System.out.println(friedsArray);

    }

}
