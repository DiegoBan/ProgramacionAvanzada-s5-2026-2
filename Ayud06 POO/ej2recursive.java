import java.util.Scanner;

public class ej2recursive{
    public static int contarDigitos(int n){
        if(n < 10) return 1;
        return 1 + contarDigitos(n/10);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese numero: ");
        int n = scan.nextInt();
        System.out.printf("Cantidad de digitos: %d\n", contarDigitos(n));
        scan.close();
    }
}
