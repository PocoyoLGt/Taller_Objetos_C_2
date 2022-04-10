import java.io.IOException;
import java.util.Scanner;
/**
 * Representa la clase principal del programa.
 * @author Laura Gutierréz Pinzón
 */
public class Main {
    /**
     * Se establecen los atributos de estado y opcion
     * El estado determina si el programa sigue o para.
     * La opcion determina que clase quiere ver el usuario.
     */
    private static boolean estado = true;
    private static int opcion;

    public static void main(String[] args) throws IOException {
        /**
         * Se establece la ruta que el programa debe seguir usando el ciclo do-while.
         */
        do {

            menu();
            opcion = capturarOpcion();
            estado = evaluarOpcion(opcion);
        } while (estado);


    }

    /**
     * Se crea el metodo menu que da las opciones al usuario.
     */
    private static void menu() {
        System.out.println("Choose the class you wish to view:");
        System.out.println("1. Person");
        System.out.println("2. Fruit");
        System.out.println("3. Bank Account");
        System.out.println("4. House");
        System.out.println("5. Airplane");
        System.out.println("6. Farm");
        System.out.println("0. Log out");

    }

    /**
     * Con este metodo se captura la opción escogida por el usuario.
     * @return Se retorna el valor que el usuario escogio.
     */
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     * Captura el estado que el usuario escoja.
     * @return retorna falso o verdadero según la elección del usuario.
     */
    private static boolean capturarBoolean(){
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();
    }

    /**
     * Este mètodo evalua la opción que haya elegido el usuario.
     * @param opcion Según la opcion se elige el case.
     * @return retorna el estado que se elija.
     * @throws IOException
     */

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            /**
             * Retorna falso para salir de la ejecución.
             */
            case 0:
                return false;

            case 1:
                /**
                 * Se creo un objeto de tipo Person.
                 */
                Person p1 = new Person();
                /**
                 * Se usa el método get para mostrar los valores de la clase Person.
                 */
                p1.getName();
                /**
                 * Se pregunta al usuario si desea continuar en el sistema.
                 */
                System.out.print("¿Desea continuar? ");
                estado = capturarBoolean();
                return estado;
            case 2:
                Fruit f1 = new Fruit();
                f1.getColors();
                System.out.print("¿Desea continuar? ");
                estado = capturarBoolean();
                return estado;
            case 3:
                Bank_Account bc1 = new Bank_Account();
                bc1.isActived();
                System.out.print("¿Desea continuar? ");
                estado = capturarBoolean();
                return estado;
            case 4:
                House h1 = new House();
                h1.getArea();
                System.out.print("¿Desea continuar? ");
                estado = capturarBoolean();
                return estado;
            case 5:
                Airplane ap1 = new Airplane();
                ap1.getNum_seats();
                System.out.print("¿Desea continuar? ");
                estado = capturarBoolean();
                return estado;
            case 6:
                Farm fm1 = new Farm();
                fm1.getAnimal_names();
                System.out.print("¿Desea continuar? ");
                estado = capturarBoolean();
                return estado;


            default:
                System.out.println("Opción incorrecta");
                System.in.read();
                return true;


        }


    }
}
