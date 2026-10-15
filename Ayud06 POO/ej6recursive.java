import java.util.Scanner;

public class ej6recursive{
    public static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int n = scan.nextInt();
        System.out.printf("Su fibonacci es: %d\n", fibonacci(n));
        scan.close();
    }
}
