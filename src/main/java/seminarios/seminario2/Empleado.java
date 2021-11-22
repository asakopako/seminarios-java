package seminarios.seminario2;

public class Empleado extends Persona implements Cloneable{
    private double salario;

    public Empleado(String nombre, float salario, int anyoAlta) {
        super(nombre, anyoAlta);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void incSalario(float subida) {
        salario += subida;
    }

    public String getDescripcionSimple() {
        return "Soy " + getNombre() + " y gano " + salario;
    }

    @Override
    protected String getDetalle() {
        return "salario: " + salario;
    }

    @Override
    public String toString() {
        // no se usa el atributo salario, se usa el get porque en subtipos el salario es calculado
        return super.toString() + " [salario=" + getSalario() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        return salario == ((Empleado) o).salario;
    }

    @Override
    public Empleado clone() {
        return (Empleado) super.clone();
    }

}
