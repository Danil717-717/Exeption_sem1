public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3};
        int lenght = arrayLenght(array);
        if(lenght<0){
            System.out.println("массива такого же нет");
        }else {
            System.out.println("вот такой массив " + lenght + " элемента");
        }

    }

    static int arrayLenght(int[] array){
        if(array.length<2){
            return -1;
        }
        return array.length;
    }


}