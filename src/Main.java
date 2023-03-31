public class Main {
    public static void main(String[] args)
    {
        Empleado emp = new Empleado();
        System.out.println("Datos del Empleado:");
        System.out.println("\n========================");
        System.out.println("Nombre = "+emp.nombre);
        System.out.println("Apellido = "+emp.apellido);
        System.out.println("Edad = "+emp.edad);
        System.out.println("Salario = "+emp.salario);
    }
}