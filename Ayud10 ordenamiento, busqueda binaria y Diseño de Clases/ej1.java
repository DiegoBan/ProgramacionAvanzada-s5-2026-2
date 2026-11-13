public class ej1 {
    public static void bubbleSort(int[] arr){   //  Orden mayor a menor
        int temp;
        int N = arr.length;
        for(int i = 0 ; i < N - 1 ; i++){
            for(int j = 0 ; j < N - 1 - i ; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr){    //  Orden mayor a menor
        int N = arr.length;
        int temp;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr1 = {10, 4, 5, 2, 1, 0};
        int[] arr2 = {10, 4, 5, 2, 1, 0};
        bubbleSort(arr1);
        sorting.printArr(arr1);
        insertionSort(arr2);
        sorting.printArr(arr2);
    }
}
