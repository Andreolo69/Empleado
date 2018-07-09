public class Gerente extends Empleado {


    public Gerente(double salario, String nombre, String fechanacimiento, String departamento) {
        super(salario, nombre, fechanacimiento);
        this.departamento = departamento;
        this.incrementarSalario();
    }

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

protected void incrementarSalario() {

        this.setSalario(this.getSalario() * 1.05);
    }
}
