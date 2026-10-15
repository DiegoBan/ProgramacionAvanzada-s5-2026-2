import java.util.Scanner;

public class ej5recursive{
    public static int maximo(int[] arr, int i){
        if(i >= arr.length-1) return arr.length-1;
        int m = maximo(arr, i+1);
        return arr[i] > arr[m] ? i : m;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese el largo del arreglo: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.printf("== INGRESO ARREGLO ==\n");
        for(int i = 0 ; i < n ; i++){
            System.out.printf("Arreglo posicion %d: ", i);
            arr[i] = scan.nextInt();
        }
        int max = maximo(arr, 0);
        System.out.printf("\nEl valor max se encuentra en el indice %d igual a %d\n", max, arr[max]);
        scan.close();
    }
}
