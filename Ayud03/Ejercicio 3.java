import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        /*
        Batman patrulla Gotham en una cuadr´ıcula 6x6. Cada celda tiene un valor que indica
        la cantidad de cr´ımenes.
        Encuentra la celda con mayor cantidad de crimenes y luego obten la direccion de la celda
        para asi darsela a batman y que baje la cantidad de crimenes en 5 unidades (Si la cantidad
        es menor a 5, la dejara en 0).
        PD= Asuma que solo habra una celda con la mayor cantidad de cr´ımenes
        */
        Scanner scanner = new Scanner(System.in);
        
        int gotham[][] = new int [6][6];
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                System.out.println("Ingrese la cantidad de crímenes de la casilla " +i+", "+j+" :");
                gotham[i][j]= scanner.nextInt();
            }
        }
        
        int comp = 0, x=0,y=0;
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(gotham[i][j]>comp){
                    x=i;
                    y=j;
                    comp = gotham[i][j];
                }
            }
        }
        
        System.out.println("La casilla con mas crimenes es: "+x+", "+y+" con un valor de: "+gotham[x][y]);
        gotham[x][y]-=5;
        System.out.println("Batman ya fue a esa casilla, valor actualizado: "+gotham[x][y]);
        
	}
}