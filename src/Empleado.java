public class Empleado {

    private double salario;
    private String nombre;
    private String fechanacimiento;

    public Empleado(){

    }

    public Empleado(double salario, String nombre, String fechanacimiento) {
        this.salario = salario;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
}
