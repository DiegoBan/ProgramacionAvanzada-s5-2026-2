public class sorting {
    public static void bubbleSort(int[] arr){
        int temp;
        int N = arr.length;
        for(int i = 0 ; i < N - 1 ; i++){
            for(int j = 0 ; j < N - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr) {
        int N = arr.length;
        int temp;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int[] arr){
        int N = arr.length;
        int key;
        for(int i = 1 ; i < N ; i++){
            key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int mid = (l + r)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;  //  Se identifica -1 como no encontrado
    }
    public static void printArr(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr1 = {10, 4, 5, 2, 1, 0};
        int[] arr2 = {10, 4, 5, 2, 1, 0};
        int[] arr3 = {10, 4, 5, 2, 1, 0};
        bubbleSort(arr1);
        printArr(arr1);
        selectionSort(arr2);
        printArr(arr2);
        insertionSort(arr3);
        printArr(arr3);
    }
}
