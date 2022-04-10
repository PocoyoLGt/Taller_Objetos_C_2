import java.util.Scanner;
/**
 * Representa la visualización de las caracteristicas generales de una casa.
 * @author Laura Gutierréz Pinzón
 */

public class House {
    /**
     * Establezco los nombres de los atributos area, número de cuartos, altura, tipo de piso y techo.
     *
     */
    private float area;
    private  int num_bedrooms;
    private  float height;
    private  String floor;
    private  String ceiling;
    /**
     * Uso la clase Scanner para pedir datos.
     */
    private Scanner input;

    /**
     *  Creo una instancia de la clase House.
     * @param area Crea una instancia del atributo para el area de la casa.
     * @param num_bedrooms Crea una instancia del atributo para el nùmero de habitaciones de la casa.
     * @param height Crea una instancia del atributo para la altura de la casa.
     * @param floor  Crea una instancia del atributo para el tipo de piso.
     * @param ceiling Crea una instancia del atributo para el tipo de techo.
     * @param input Crea una instancia del atributo para pedir los datos de entrada.
     */

    public House(float area, int num_bedrooms, float height, String floor, String ceiling, Scanner input) {
        this.area = area;
        this.num_bedrooms = num_bedrooms;
        this.height = height;
        this.floor = floor;
        this.ceiling = ceiling;
        this.input = input;
    }
    /**
     * En el método House pido y almaceno los valores de los atributos area, número de habitaciones, altura, tipo de piso y techo de una casa.
     */
    public  House(){
        /**
         * Inicializo la clase Scanner.
         */
        this.input = new Scanner(System.in);
        /**
         * Pido los datos  a el usuario, para llenar los valores de los atributos.
         */
        System.out.println("House");
        System.out.println("Area: ");
        area = capturarDatofloat();
        System.out.println("Number of rooms:");
        num_bedrooms = capturarDatoInt();
        System.out.println("Height: ");
        height = capturarDatofloat();
        System.out.println("Floor type: ");
        floor = capturarDatoString();
        System.out.println("Ceiling type: ");
        ceiling = capturarDatoString();
        /**
         * Imprimo los valores ingresados por el usuario.
         */
        System.out.println(" -------------- . ---------------");
        System.out.println("House: ");
        System.out.println("Area: "+area);
        System.out.println("Number of rooms:"+num_bedrooms);
        System.out.println("Height: "+height);
        System.out.println("Floor type: "+floor);
        System.out.println("Ceiling type: "+ceiling);





    }

    /**
     * Se crean los métodos accesores.
     * @return Con el método Getter se muestran en la clase principal los atributos que estan encapsulados.
     */
    public float getArea() {
        return area;
    }

    /**
     *
     * @param area Con el método Setter  Establezco los atributos.
     */

    public void setArea(float area) {
        this.area = area;
    }

    /**
     *  Se usan para capturar los datos tipo String.
     * @return Se retorna el valor que dio el usuario.
     */
    private String capturarDatoString() {return this.input.nextLine();}
    /**
     *  Se usan para capturar los datos tipo Int.
     * @return Se retorna el valor que dio el usuario.
     */

    private int capturarDatoInt() {return this.input.nextInt();}
    /**
     *  Se usan para capturar los datos tipo float.
     * @return Se retorna el valor que dio el usuario.
     */
    private float capturarDatofloat() {return this.input.nextFloat();}

}
