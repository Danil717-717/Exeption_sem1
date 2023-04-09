// Реализуйте метод checkArray(Integer[] arr), принимающий в
// качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить”
// об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы
// все их “подсветить”

import java.util.ArrayList;
import java.util.List;

public class Ex_03 {

    private static List<Integer> checkArray(Integer[] arr){
        if(arr == null){
            throw new RuntimeException (" arr == null");
        }
        List<Integer> nulls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                nulls.add(i);
            }
        }
        return nulls;
    }

    public static void showIndex(List<Integer> arr){
        if(arr.size()==0){
            System.out.println("Все значения массива не равны null");
        }else {
            System.out.println("Значения null на местах с индексами: ");
            for (Integer num: arr ) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {2, null, 34,null, 23, null};
        showIndex(checkArray(arr));
    }


}
