import java.util.Scanner;

public class ej3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        char operator;
        System.out.printf("Ingresa el primer numero: ");
        num1 = scan.nextDouble();
        System.out.printf("Ingresa el segundo numero: ");
        num2 = scan.nextDouble();
        System.out.printf("Ingresa el operador (+, -, *, /): ");
        operator = scan.next().charAt(0);
        System.out.printf("Operacion: %f %c %f = ", num1, operator, num2);
        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operador invalido");
                break;
        }
        scan.close();
    }
}
