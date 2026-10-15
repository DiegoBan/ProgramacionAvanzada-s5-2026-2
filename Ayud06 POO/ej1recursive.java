import java.util.Scanner;

public class ej1recursive{
    public static int sumaHasta(int n){
        if(n <= 1) return 1;
        return n + sumaHasta(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese numero: ");
        int n = scan.nextInt();
        System.out.printf("Suma hasta %d: %d\n", n, sumaHasta(n));
        scan.close();
    }
}
