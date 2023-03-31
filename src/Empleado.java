public class Empleado {
    String nombre;
    String apellido;
    int edad;
    double salario;
    //Constructores
    /**
     * Constructor por defecto
     */
    public Empleado(){
        this.nombre="Alin Piero";
        this.apellido="Javier";
        this.edad=27;
        this.salario=4800.99;
    }
    /**
     * Constructor con 4 parametros
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
}
