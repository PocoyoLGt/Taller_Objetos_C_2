import java.util.ArrayList;
/**
 * Representa las caracteristicas de una fruta.
 * @author Laura Gutierréz Pinzón
 */

public class Fruit {
    /**
     * Establezco los nombres de los atributos Nombre, Peso promedio y colores de la clase Fruit.
     *
     */
    private String name;
    private float averageWeight;
    /**
     * Creo un arraylist para guardar los colores de la fruta.
     */
    ArrayList<String> colors = new ArrayList<String>();

    /**
     * Creo una instancia de la clase Fruit.
     * @param name Crea una instancia del atributo para el nombre.
     * @param averageWeight Crea una instancia del atributo para el peso promedio.
     */
    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
    }

    /**
     * En el método Fruit asignò los valores de los atributos Nombre, peso promedio y colores.
     */
    public Fruit(){
        name = "Apple";
        averageWeight = (float) 200;
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("purple");
        colors.add("orange");
        /**
         * Ya aqui se muestran los valores asignados en pantalla.
         */
        System.out.println("Name Fruit: "+name);
        System.out.println("Average Weight: "+averageWeight);
        System.out.println("Colors of the apple: ");
        System.out.println(colors.get(0));
        System.out.println(colors.get(1));
        System.out.println(colors.get(2));
        System.out.println(colors.get(3));
    }

    /**
     * Se crean los métodos accesores.
     * @return Con el método Getter se muestra el atributo.
     */

    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     *
     * @param colors Con el método Setter  Establezco el atributo.
     */

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }



}
