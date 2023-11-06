package Task2_3;

import java.util.ArrayList;

public class Zoo {

    public static void fillTheAnimals(ArrayList arrayList){

        for (int i=0;i<8;i++){
            arrayList.add(i,"Animal"+i);
        }

        for (Object e:arrayList) {
            System.out.println(e);
        }

        System.out.println(arrayList);

    }

    public static void main(String[] args) {



        ArrayList<String> arrayList = new ArrayList<>();
        fillTheAnimals(arrayList);

        arrayList.remove(7);
        arrayList.remove(5);
        arrayList.remove(3);
        System.out.println(arrayList.size());





    }
}