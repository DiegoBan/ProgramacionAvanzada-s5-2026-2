class jugador {
    private int id;
    private String nombre;
    private int puntajeActual;
    public jugador(int id, String nombre, int puntajeActual){
        this.id = id;
        this.nombre = nombre;
        this.puntajeActual = puntajeActual;
    }
    public int getId(){ return id; }
    public String getNombre(){ return nombre; }
    public int getPuntajeActual(){ return puntajeActual; }
}

public class ej3 {
    public static void bubbleSort(jugador[] arr){
        jugador temp;
        int N = arr.length;
        for(int i = 0 ; i < N - 1 ; i++){
            for(int j = 0 ; j < N - 1 - i ; j++){
                if(arr[j].getPuntajeActual() < arr[j+1].getPuntajeActual()){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static int binarySearch(jugador[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int mid = (l + r)/2;
            int puntaje = arr[mid].getPuntajeActual();
            if(puntaje == target){
                return mid;
            }else if(puntaje < target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;  //  Se identifica -1 como no encontrado
    }
    public static int count(jugador[] arr, int target){
        int found = binarySearch(arr, target);
        if(found == -1) return 0;
        int count = 0;
        for(int i = found ; i >= 0 ; i--){
            if(arr[i].getPuntajeActual() == target){
                count++;
            }else break;
        }
        for(int i = found + 1 ; i < arr.length ; i++){
            if(arr[i].getPuntajeActual() == target){
                count++;
            }else break;
        }
        return count;
    }
    public static void printTablaDePuntajes(jugador[] arr){
        System.out.printf("[id, Nombre, Puntaje]\n");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.printf("%d. [%d, %s, %d]\n", i+1, arr[i].getId(), arr[i].getNombre(), arr[i].getPuntajeActual());
        }
    }
    public static void main(String[] args){
        jugador[] tablaDePuntajes = new jugador[10];

        tablaDePuntajes[0] = new jugador(0, "Vegetta777", 777);
        tablaDePuntajes[1] = new jugador(1, "Willyrex", 404);
        tablaDePuntajes[2] = new jugador(2, "elRubius", 800);
        tablaDePuntajes[3] = new jugador(3, "MangelRogel", 750);
        tablaDePuntajes[4] = new jugador(4, "byStaxx", 800);
        tablaDePuntajes[5] = new jugador(5, "LuzuGamer", 450);
        tablaDePuntajes[6] = new jugador(6, "aLexBY11", 790);
        tablaDePuntajes[7] = new jugador(7, "AuronPlay", 350);
        tablaDePuntajes[8] = new jugador(8, "Illojuan", 400);
        tablaDePuntajes[9] = new jugador(9, "LOLiTO FDEZ", 700);

        bubbleSort(tablaDePuntajes);
        printTablaDePuntajes(tablaDePuntajes);
        System.out.printf("%d jugadores encontrados con %d puntos\n", count(tablaDePuntajes, 0), 0);
        System.out.printf("%d jugadores encontrados con %d puntos\n", count(tablaDePuntajes, 777), 777);
        System.out.printf("%d jugadores encontrados con %d puntos\n", count(tablaDePuntajes, 800), 800);
    }
}
