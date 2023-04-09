// -реализуйте метод, принимающий в качестве аргумента
// целочисленный двумерный массив
// - необходимо подсчитать и вернуть сумму элементов этого массива
// - при этом накладываем на метод 2 ограничения: метод может работать только
// с квадратичными массивами(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 и 1
// если нарушается одно из условий, метод должен бросить RuntimeException с
// сообщением об ошибке.



public class Ex_02 {
    public static void main(String[] args) {
        //int[][] arrMatrix = {{1, 0, 1},{1, 1, 0},{1,1,1}};
        //int[][] arrMatrix = {{1, 0, 1},{1, 1, 0}};
        //int[][] arrMatrix = new int[0] [0];
        int[][] arrMatrix = null;
        //System.out.println(String.format("Sum of matrix: %d", sumMatrix(arrMatrix)));
        try {
            System.out.println(String.format("Sum of matrix: %d" , sumMatrix(arrMatrix)));
        }
        catch (Exception ex){
            System.err.println(String.format("error was occured. %s" , ex.getMessage()));
        }
    }

    private static int sumMatrix(int[][] arr){
        if(arr == null)
            throw new NullPointerException("matrix was null");
        if(arr.length == 0)
            throw new RuntimeException("matrix was empty");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length)
                throw new RuntimeException("Matrix must be square");
        }
        int sum = 0;
        for(int i = 0; i< arr.length;i++){
            for (int j = 0; j < arr.length ; j++) {
                 if(arr[i][j] != 0 && arr[i][j] != 1)
                     throw new RuntimeException("Element was not correct");
                 sum += arr[i][j];
            }
        }
        return sum;
    }
}
