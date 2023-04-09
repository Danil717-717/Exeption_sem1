//* Реализуйте метод, принимающий в качестве аргументов
// два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих
// массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Arrays;
import java.util.Random;

public class HW_04 {
    public static int[] differenceTwoArr(int[] array, int[] arr) {
        if (array.length != arr.length) {
            throw new RuntimeException("Длинны массивов не равны");
        }
        int[] resultArray = new int[array.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array[i] - arr[i];
        }
        return resultArray;
    }

    public static int[] getNumArray(int length) {
        if(length <= 0 ){
            throw new RuntimeException("Нужен массив больше");
        }
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(20);
        }
        return array;
    }

    public static void main(String[] args) {

        try{
            int[] firstArray = getNumArray(6);
            int[] secondArray = getNumArray(7);

            System.out.println(Arrays.toString(firstArray));
            System.out.println(Arrays.toString(secondArray));

            int[] difArray = differenceTwoArr(firstArray, secondArray);
            System.out.println(Arrays.toString(difArray));
        }catch (RuntimeException e){
            throw new RuntimeException("Error");
        }

    }
}


