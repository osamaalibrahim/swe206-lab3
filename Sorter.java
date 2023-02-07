public class Sorter{
    public static <T> void insertionSort(int[] array){
        for(int i=1 ; i < array.length ; i++ ){
            int tmp = array[i];
            for(int j =i-1 ; j >= 0 && tmp < array[j]; j--){
                array[j+1] = array[j];
            }
            array[i] = tmp;
        }
    }
}