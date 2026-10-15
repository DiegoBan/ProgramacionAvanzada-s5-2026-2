import java.util.Scanner;

public class ej3recursive{
    public static int multiplicar(int a, int b){
        if(a == 0 || b == 0) return 0;
        if(b <= 1) return a;
        return a + multiplicar(a, b-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.printf("Ingrese numero 1: ");
        a = scan.nextInt();
        System.out.printf("Ingrese numero 2: ");
        b = scan.nextInt();
        System.out.printf("Multiplicacion: %d\n", multiplicar(a, b));
        scan.close();
    }
}
