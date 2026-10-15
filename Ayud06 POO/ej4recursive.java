import java.util.Scanner;

public class ej4recursive{
    public static boolean esPalindromo(String s, int i){
        if(i > s.length()-1-i) return true;
        if(s.charAt(i) == s.charAt(s.length()-1-i)) return true && esPalindromo(s, i+1);
        else return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese texto: ");
        String s = scan.nextLine();
        if(esPalindromo(s, 0)) System.out.printf("Es palindromo\n");
        else System.out.printf("No es palindromo\n");
        scan.close();
    }
}
