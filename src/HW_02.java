// Посмотрите на код, и подумайте сколько
// разных типов исключений вы тут сможете получить?

public class HW_02 {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    // массив = null или простой массив
    //  в массив не string, а int например
    // выход за пределы массива
}
