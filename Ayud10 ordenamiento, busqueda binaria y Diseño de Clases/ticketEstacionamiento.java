import java.util.ArrayList;

public class ticketEstacionamiento {
    int id;
    int hora_llegada, min_llegada;
    int hora_salida, min_salida;
    int pago;
    String patente;
    boolean funcionario;

    public ticketEstacionamiento(int id, int hora_llegada,  //  Constructor para solo hora de llegada
        int min_llegada, String patente, boolean funcionario){
        this.id = id;
        if(hora_llegada < 7 || hora_llegada > 23){
            throw new IllegalArgumentException("hora llegada no valida: " + hora_llegada);
        }
        this.hora_llegada = hora_llegada;
        if(min_llegada < 0 || min_llegada >= 60){
            throw new IllegalArgumentException("minutos llegada no valida: " + min_llegada);
        }
        if(hora_llegada == 23 && min_llegada > 0){  //  Cierra a las 23:00 exacto
            throw new IllegalArgumentException("fuera de horario: 23:" + min_llegada);
        }
        this.min_llegada = min_llegada;
        if(patente.length() > 6 || patente.length() < 4){
            throw new IllegalArgumentException("Largo patente incorrecto: "+ patente.length());
        }
        this.hora_salida = 0;   //  0 = aun no sale (horas validas parten en 7)
        this.min_salida = 0;
        this.pago = 0;
        this.patente = patente;
        this.funcionario = funcionario;
    }

    public void registrarSalida(int hora_salida, int min_salida){
        if(this.hora_salida != 0){   //  No se realiza ya que ya hay salida registrada
            throw new IllegalArgumentException("Hora de salida ya registrada");
        }
        if(hora_salida < 7 || hora_salida > 23){
            throw new IllegalArgumentException("hora salida no valida: " + hora_salida);
        }
        if(min_salida < 0 || min_salida >= 60){
            throw new IllegalArgumentException("minutos salida no valida: " + min_salida);
        }
        if(hora_salida == 23 && min_salida > 0){    //  Cierra a las 23:00 exacto
            throw new IllegalArgumentException("fuera de horario: 23:" + min_salida);
        }
        int total_llegada = hora_llegada * 60 + min_llegada;
        int total_salida = hora_salida * 60 + min_salida;
        if(total_salida < total_llegada){   //  Salida no puede ser antes que la llegada
            throw new IllegalArgumentException("Salida anterior a la llegada");
        }
        this.hora_salida = hora_salida;
        this.min_salida = min_salida;
        this.pago = calcularPago(total_salida - total_llegada);
    }

    private int calcularPago(int minutos){
        if(funcionario){    //  Funcionarios no pagan
            return 0;
        }
        int monto = minutos * 25;
        if(monto > 3000){   //  Tope diario
            monto = 3000;
        }
        return monto;
    }

    public boolean estaAdentro(){
        return hora_salida == 0;
    }

    public int getPago(){
        return pago;
    }

    public int getId(){
        return id;
    }
}

class estacionamiento {
    ArrayList<ticketEstacionamiento> tickets;
    int correlativo;

    public estacionamiento(){
        this.tickets = new ArrayList<>();
        this.correlativo = 1;
    }

    public ticketEstacionamiento registrarEntrada(int hora_llegada, int min_llegada,
        String patente, boolean funcionario){
        ticketEstacionamiento t = new ticketEstacionamiento(correlativo, hora_llegada,
            min_llegada, patente, funcionario);
        tickets.add(t);
        correlativo++;  //  Solo avanza si el ticket se creo bien
        return t;
    }

    public void registrarSalida(int id, int hora_salida, int min_salida){
        for(ticketEstacionamiento t : tickets){
            if(t.getId() == id){
                t.registrarSalida(hora_salida, min_salida);
                return;
            }
        }
        throw new IllegalArgumentException("Ticket no existe: " + id);
    }

    public int totalRecaudado(){
        int total = 0;
        for(ticketEstacionamiento t : tickets){
            total += t.getPago();
        }
        return total;
    }

    public int vehiculosAdentro(){
        int cont = 0;
        for(ticketEstacionamiento t : tickets){
            if(t.estaAdentro()){
                cont++;
            }
        }
        return cont;
    }
}
