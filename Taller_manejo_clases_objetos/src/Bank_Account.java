import java.util.Scanner;
/**
 * Representa la visualización de los datos de una cuenta de banco.
 * @author Laura Gutierréz Pinzón
 */
public class Bank_Account {
    /**
     * Establezco los nombres de los atributos Numero de cuenta, estado, propietario y contraseña de una cuenta.
     *
     */
    private int accountNumber;
    private boolean actived;
    private String owner;
    private int password;

    /**
     * Creo una instancia de la clase Bank_Account.
     * @param accountNumber Crea una instancia del atributo para el número de la cuenta.
     * @param actived Crea una instancia del atributo para el estado.
     * @param owner Crea una instancia del atributo para el titular de la cuenta.
     * @param password Crea una instancia del atributo para la contraseña.
     */
    public Bank_Account(int accountNumber, boolean actived, String owner, int password) {
        this.accountNumber = accountNumber;
        this.actived = actived;
        this.owner = owner;
        this.password = password;
    }
    /**
     * En el método Bank_Account asignò los valores de los atributos Numero de cuenta, estado, propietario y contraseña de una cuenta.
     */
    public Bank_Account(){
        accountNumber = 1009986070;
        owner = "Laura Gutierrez";
        password = 3243;
        actived = false;
        /**
         * Ya aqui se muestran los valores asignados en pantalla.
         */
        System.out.println(" Account Number: "+accountNumber);
        System.out.println(" Holder: "+owner);
        System.out.println(" Password: "+password);
        estado();


    }

    /**
     * En el método estado se evalua si la cuenta esta activa o no.
     */
    public void estado(){
        if (actived == false){

            System.out.println("La cuenta esta inactiva");
            System.out.println("¿Desea activar la cuenta? true/false ");
            actived = capturarBoolean();
            if (actived == true){
                System.out.println("La cuenta se ha activado");
                System.out.println(" Account Number: "+accountNumber);
                System.out.println(" Holder: "+owner);

            }
        }else {
            System.out.println("La cuenta esta activa");


        }
    }

    /**
     * Se crean los métodos accesores.
     * @return Con el método Getter se muestra el atributo.
     */
    public boolean isActived() {
        return actived;
    }

    /**
     *
     * @param actived  Con el método Setter  Establezco el atributo.
     */
    public void setActived(boolean actived) {
        this.actived = actived;
    }

    /**
     * Este método se usa para capturar el estado de la cuenta.
     * @return Se retorna el valor que dio el usuario.
     */
    private static boolean capturarBoolean(){
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();
    }
}
