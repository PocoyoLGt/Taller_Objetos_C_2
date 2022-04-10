import java.util.Date;

/**
 * Representa los datos generales de una persona.
 * @author Laura Gutierréz Pinzón
 */

public class Person {
    /**
     * Represeta el nombre de una persona.
     */
    private String name;
    /**
     * Represeta el primer apellido de una persona.
     */
    private String last_name_1;
    /**
     * Represeta el segundo apellido de una persona.
     */
    private String last_name_2;
    /**
     * Represeta la fecha de nacimiento de una persona.
     */
    private Date date_Birth = new Date(99,6,3);
    /**
     * Represeta la altura en metros de una persona.
     */
    private float height;
    /**
     * Represeta el peso de una persona.
     */
    private float weight;
    /**
     * Represeta el lugar de nacimiento de una persona.
     */
    private String birthplace;

    /**
     * Crea una instancia de la clase Person.
     * @param name Crea una instancia del atributo para el nombre.
     * @param last_name_1 Crea una instancia del atributo para el primer apellido.
     * @param last_name_2 Crea una instancia del atributo para el segundo apellido.
     * @param date_birth Crea una instancia del atributo para la fecha de nacimiento.
     * @param height Crea una instancia del atributo para la altura.
     * @param weight Crea una instancia del atributo para la estatura.
     * @param birthplace Crea una instancia del atributo para el lugar de nacimiento.
     */

    public Person(String name, String last_name_1, String last_name_2, Date date_birth, float height, float weight, String birthplace) {
        this.name = name;
        this.last_name_1 = last_name_1;
        this.last_name_2 = last_name_2;
        this.date_Birth = date_birth;
        this.height = height;
        this.weight = weight;
        this.birthplace = birthplace;
    }

    /**
     * Se establece el siguiente mètodo Person para asignar valores a cada atributo.
     */
    public Person(){
        name = "Laura";
        last_name_1 = "Gutierréz";
        last_name_2 = "Pinzón";
        height = (float) 1.73;
        weight = (float) 80.3;
        birthplace ="Icononzo Tolima";
        /**
         * Ya aqui muestro los valores asignados en pantalla
         */
        System.out.println(" Name: "+ name);
        System.out.println(" Last Name 1: "+ last_name_1);
        System.out.println(" Last Name 2: "+ last_name_2);
        System.out.println(" Date of birth: "+ date_Birth);
        System.out.println(" Height: "+ height);
        System.out.println(" Weight: "+ weight);
        System.out.println(" Birthplace: "+ birthplace);


    }

    /**
     * Se crean los metodos accesores.
     * @return Con el método Getter se muestra el nombre.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Con el método Setter  Establezco el nombre.
     */
    public void setName(String name) {
        this.name = name;
    }
}
