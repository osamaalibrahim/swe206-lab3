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
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
}