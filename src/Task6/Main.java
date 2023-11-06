package Task6;


import java.util.ArrayList;
import java.util.ListIterator;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Ivan Franko");
        arrayList.add("Pavlo Gubencko");
        arrayList.add("Mykhailo Kotsiubynsky");
        arrayList.add("Taras Shevchenko");
        arrayList.add("Fyodor Dostoevsky");



        int searchIndex = arrayList.indexOf("Mykhailo Kotsiubynsky");
        System.out.println("Найкращий "+arrayList.get(searchIndex));
        searchIndex = arrayList.indexOf("Fyodor Dostoevsky");
        System.out.println("Найгірший "+ arrayList.get(searchIndex));

        System.out.println(arrayList);




    }





    }


