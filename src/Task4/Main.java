package Task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(45);
        arrayList.add(46);
        arrayList.add(47);

        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            listIterator.set(integer+1);

        }

        for (Integer e:arrayList) {
            System.out.println(e);
        }
        System.out.println(arrayList);
    }
}
