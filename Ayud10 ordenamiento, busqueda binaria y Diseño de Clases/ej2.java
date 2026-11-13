public class ej2 {
    public static int count(int[] arr, int target){
        int found = sorting.binarySearch(arr, target);
        if(found == -1) return 0;
        int count = 0;
        for(int i = found ; i >= 0 ; i--){
            if(arr[i] == target){
                count++;
            }else break;
        }
        for(int i = found + 1 ; i < arr.length ; i++){
            if(arr[i] == target){
                count++;
            }else break;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {-1, 3, 3, 5, 10, 10, 10, 55, 100, 100, 100, 100, 100};
        System.out.printf("Numero 4: %d\n", count(arr, 4));
        System.out.printf("Numero 10: %d\n", count(arr, 10));
        System.out.printf("Numero 55: %d\n", count(arr, 55));
        System.out.printf("Numero 100: %d\n", count(arr, 100));
    }
}
