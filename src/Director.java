public class Director extends  Gerente {

    private String matricula;



    public Director(double salario, String nombre, String fechanacimiento, String departamento, String matricula) {
        super(salario, nombre, fechanacimiento, departamento);
        this.matricula=matricula;
       this.incrementarSalario();
    }
    public String getMatricula() {
        return matricula;

    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   protected void incrementarSalario(){

        setSalario(getSalario()*1.10+100);
    }
}
