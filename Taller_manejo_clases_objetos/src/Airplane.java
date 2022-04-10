/**
 * Representa la visualización de los elementos de avion.
 * @author Laura Gutierréz Pinzón
 */

public class Airplane {
    /**
     * Establezco los nombres de los atributos
     * para los numeros de asientos, puertas, motores,
     * paracaidas, pasajeros, azafatas, elementos de cabina
     * y nombre del pilotp.
     *
     */
    private int num_seats;
    private int num_doors;
   private String cabin_elements;
   private  int num_engines;
   private  int num_parachutes;
   private int num_passengers;
   private  int num_stewardesses;
    private String name_pilot;

    /**
     * Creo una instancia de la clase Airplane.
     * @param num_seats Crea una instancia del atributo para el número de asientos.
     * @param num_doors Crea una instancia del atributo para el número de puertas.
     * @param cabin_elements Crea una instancia del atributo para los elementos de la cabina.
     * @param num_engines Crea una instancia del atributo para el número de motores.
     * @param num_parachutes Crea una instancia del atributo para el número de paracaidas.
     * @param num_passengers Crea una instancia del atributo para el número de pasajeros.
     * @param num_stewardesses Crea una instancia del atributo para el número de azafatas.
     * @param name_pilot Crea una instancia del atributo para el nombre del piloto.
     */

    public Airplane(int num_seats, int num_doors, String cabin_elements, int num_engines, int num_parachutes, int num_passengers, int num_stewardesses, String name_pilot) {
        this.num_seats = num_seats;
        this.num_doors = num_doors;
        this.cabin_elements = cabin_elements;
        this.num_engines = num_engines;
        this.num_parachutes = num_parachutes;
        this.num_passengers = num_passengers;
        this.num_stewardesses = num_stewardesses;
        this.name_pilot = name_pilot;
    }
    public Airplane(){
    num_seats = 120;
    num_doors = 2;
    cabin_elements = "Joystick, Radio Navigation, Flaps, Computer";
    num_engines = 4;
    num_parachutes = 6;
    num_passengers = 105;
    num_stewardesses = 10;
    name_pilot = "Leonardo Ferreira";
    System.out.println("Seats: "+num_seats);
    System.out.println("Cabin Elements: "+num_doors);
    System.out.println("Engines: "+num_engines);
    System.out.println("Parachutes: "+num_parachutes);
    System.out.println("Passengers: "+num_passengers);
    System.out.println("Stewardesses: "+num_stewardesses);
    System.out.println("Piloto: "+name_pilot);



    }

    public int getNum_seats() {
        return num_seats;
    }

    public void setNum_seats(int num_seats) {
        this.num_seats = num_seats;
    }
}
