import java.util.Scanner;

public class factorial{
    public static long recursiveFactorial(long n){
        if(n <= 1) return 1;
        return n * recursiveFactorial(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese el número para calcular su factorial: ");
        long n = scan.nextLong();
        System.out.printf("%d\n", recursiveFactorial(n));
        scan.close();
    }
}
