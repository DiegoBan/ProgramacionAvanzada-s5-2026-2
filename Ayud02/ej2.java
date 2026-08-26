import java.util.Scanner;

public class ej2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingresa el factorial a calcular: ");
        int num = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("El factorial de %d es %d\n", num, factorial);
        scan.close();
    }
}
