//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.io.*;

public class HW_01 {

    public static int division(int a, int b){
        if(b==0){
            throw new ArithmeticException("На 0 дельть нельзя!");
        }
        int result = a/b;
        return result;
    }

    public static void valueIndex(int[] array, int index){
        if(index > array.length-1) {
            throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        }
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    public static void fileReading(File file) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден!");
        }
    }

    public static void main(String[] args) throws IOException {

        division(10, 0);

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        valueIndex(array,12);

        fileReading(new File("Test.txt"));

    }

}
