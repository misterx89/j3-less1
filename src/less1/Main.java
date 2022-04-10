package less1;

import less1.fruits.Apple;
import less1.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"re","asd","vbn"};
        System.out.println("Initial array " + Arrays.toString(arr));

        swap(arr,1,2);

        ArrayList<String> al = arrayToList(arr);
        System.out.println("Final array " + al);

        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        BoxWithFruits<Apple> box2 = new BoxWithFruits<>();
        box1.add(new Apple());
        box2.add(new Apple());
        System.out.println("BOX 1 = " + box1.getWeith());
        System.out.println("BOX 2 = " + box2.getWeith());

        BoxWithFruits<Orange> box3 = new BoxWithFruits<>();
        BoxWithFruits<Orange> box4 = new BoxWithFruits<>();
        box3.add(new Orange());

        for (int i = 0; i < 10; i++) {
            box4.add(new Orange());
        }
        //????????? ???????
        System.out.println(box4.avg(box3));

        System.out.println("BOX 3 = " + box3.getWeith());
        System.out.println("BOX 4 = " + box4.getWeith());

        //??????? ? box3 ?? box4
        box3.transfer(box4);
        System.out.println("After transfer BOX 3 = " + box3.getWeith());
        System.out.println("After transfer BOX 4 = " + box4.getWeith());


    }

    public static void swap (Object[] arr, int index_1, int index_2) {
        Object obj = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = obj;
    }

    public static <T> ArrayList<T> arrayToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
