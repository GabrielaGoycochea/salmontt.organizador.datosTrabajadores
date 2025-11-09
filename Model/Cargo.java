package Model;

/**
 * Clase que se extiende desde clase trabajadores
 * Trae los datos ya ingresados desde la clase y usa sus atributos
 */
public class Cargo extends Trabajadores{

        //ATRIBUTOS
        private String cargo;
        private double sueldo;

    /**
     *
     * @param rut corresponde al rut ingresado en la clase Trabajadores
     * @param nombres corresponde al primer y segundo nombre ingresado en la clase trabajadores
     * @param apellidos corresponde a primer y segundo apellido ingresado en la clase trabajadores
     * @param telefono corresponde al telefono ingresado en la clase trabajadores (segun cada trabajador)
     * @param correo corresponde al correo corporativo de la clase trabajadores (segun cada trabajador)
     * @param cargo cargo correspondiente segun el trabajador (esta clase)
     * @param sueldo sueldo correspondiente al cargo de cada trabajador (esta clase)

     EL constructor toma datos de la clase trabajadores como rut ( que viene de la clase rut), nombres, apellidos, telefono y correo
     los llama para complementar la información al momento de aplicar el toString.
     Clase especifica para sueldos y cargo para el sueldo correspondiente,donde se llaman y/o modifican por los metodos aplicados.
     Al momento de aplicar @Override llama a la info completa guardada anteriomente en clase trabajadores y agrega solo sueldo y cargo en "texto".
     */
        //CONSTRUCTOR
        public Cargo(Rut rut,String nombres,String apellidos,String telefono,String correo,String cargo,double sueldo){
            super(rut,nombres,apellidos,telefono,correo);
            this.cargo=cargo;
            this.sueldo=sueldo;

        }//FIN CONSTRUCTOR

    //METODOS GET Y SET
        public String getCargo(){return cargo;}
        public void setCargo(String cargo){this.cargo=cargo;}

        public double getSueldo(){return sueldo;}
        public void setSueldo(double sueldo){this.sueldo=sueldo;}

    /**
     * METODO QUE PERMITE LA LEGITIBILIDAD DE LOS DATOS ENTREGADOS
     */
    @Override
    public String toString(){
            return super.toString()+"\nCargo: "+cargo+"\nSueldo: $"+sueldo;
    }

    }

