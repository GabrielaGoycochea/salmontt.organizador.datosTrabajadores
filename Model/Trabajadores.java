package Model;

/**
 * Clase que datos personales de los trabajadores de Salmontt
 * Realiza la composición a traves del RUT del trabajador
 */

public class Trabajadores {

    //ATRIBUTOS
    private Rut rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;

    /**
     *
     * @param rut Contiene el rut del trabajadores ingresados a Salmontt
     * @param nombres Contiene primer y segundo nombre de trabajadores de Salmontt
     * @param apellidos Contiene primer y segundo apellido de trabajadores de Salmontt
     * @param telefono contiene telefono personal de trabajador de Salmontt
     * @param correo contiene correo corporativo entregado a trabajadores por la empresa Salmontt

    Información personal de trabajadores de empresa Salmontt.
     El constructor en este caso crea los datos especificos para agregar a los trabajadores, de requerir otros,
     dirección, genero , estado civil, se puede agregar a los atributos y a los datos agregados en el MAIN.
     */
    //CONSTRUCTOR
    public Trabajadores(Rut rut,String nombres,String apellidos,String telefono,String correo){
        this.rut=rut;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.correo=correo;


    }//FIN CONSTRUCTOR.

    /**
     *En metodos get y set permite llamar y mostrar la información con @return,
     en set no retorna información pero modifica segun lo solicitado desde el dato llamado en main y cambia la información a mostrar.
     No muestra la modificación efectuada al usuario por VOID ya que no genera retorno,pero una vez modificado lo llama con Get y muestra la información solicitada.
     */

    //GET Y SET

    public Rut getRut() {return rut;}
    public void setRut(Rut rut){this.rut=rut;}

    public String getNombres() {return nombres;}
    public void setNombres(String nombres) {this.nombres = nombres;}

    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos){this.apellidos=apellidos;}

    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo){this.correo=correo;}


    /**
     * METODO QUE PERMITE LA LEGITIBILIDAD DE LOS DATOS ENTREGADOS
     */

    @Override
    public String toString(){
        return rut.toString()+"\nNombre: "+nombres+" "+apellidos+
                "\nTelefono: "+telefono;
    }



}
