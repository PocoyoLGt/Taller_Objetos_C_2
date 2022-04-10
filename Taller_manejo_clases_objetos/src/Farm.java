/**
 * Representa la visualización de los elementos de una granja.
 * @author Laura Gutierréz Pinzón
 */
public class Farm {
    /**
     * Establezco los nombres de los atributos
     * para los nombres y nùmeros de animales, nombres
     * y nùmero de cultivos y el area de la granja.
     *
     */

    private String animal_names;
    private int num_animals;
    private String crops;
    private int num_crops;
    private float area;

    /**
     * Creo una instancia de la clase Farm.
     * @param animal_names Crea una instancia del atributo para el nombre de los animales de la granja.
     * @param num_animals Crea una instancia del atributo para el número de animales de la granja.
     * @param crops Crea una instancia del atributo para el nombre de cultivos de la granja.
     * @param num_crops Crea una instancia del atributo para el número de cultivos de la granja.
     * @param area Crea una instancia del atributo para el area de la granja.
     */

    public Farm(String animal_names, int num_animals, String crops, int num_crops, float area) {
        this.animal_names = animal_names;
        this.num_animals = num_animals;
        this.crops = crops;
        this.num_crops = num_crops;
        this.area = area;
    }
    public Farm(){
        animal_names = "Cows, hens, sheep, horses";
        num_animals = 120;
        crops = "Corn, Tomato, Lettuce, Onion, Garlic, Lemon, Carrot";
        num_crops = 45;
        area = (float)500;
        System.out.println(" Animal Names: "+ animal_names);
        System.out.println(" Animals: "+ num_animals);
        System.out.println(" Crops Names: "+ crops);
        System.out.println(" Number of Crops: "+ num_crops);
        System.out.println(" Farm Area: "+ area);




    }

    public String getAnimal_names() {
        return animal_names;
    }

    public void setAnimal_names(String animal_names) {
        this.animal_names = animal_names;
    }
}
