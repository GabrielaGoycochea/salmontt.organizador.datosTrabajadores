package Model;

/**
 * Clase que contiene los RUT  de trabajadores de Salmontt
*/

public class Rut {

    //ATRIBUTOS
    private String dni;

    /**
     *@param trabajadoresRut guarda el dato ingresado (si corresponde) del RUT CHILENO solicitado.
     */

    //CONSTRUCTOR
    public Rut(String trabajadoresRut ){

        /**
         * [0-9]+ uno o más digitos permitidos en rut sin digito verificador
         * No condicionar digito exacto {} por rut -10millones
         * Permite, en el caso anterior, ingreso de rut con 0 delante o sin el.
         *
         * En digito verificador puede ser digito o la letra K/k

         * */

        //VALIDACION SIMPLE

        if(!trabajadoresRut.matches("[0-9]+-[0-9kK]")){
            //EXCEPCION THROW YA QUE ES ESPECIFICA.
            throw new IllegalArgumentException("El RUT ingresado no es valido.");

        }//FIN IF.

        this.dni = trabajadoresRut;

    }//FIN CONSTRUCTOR

    //METODO GET
    /**
     * RUT AL SER UNICO NO DEBERIA MODIFICARSE.
     * Solo se utiliza get ya que solo muestra el dato pero no lo llama para realizar modificaciones en el ya que es dato unico.
     */

    public String getDni() {
        return dni;
    }

    /**
     * METODO QUE PERMITE LA LEGITIBILIDAD DE LOS DATOS ENTREGADOS
     */

    @Override
    public String toString(){
        return "RUT: "+dni;
    }

}
