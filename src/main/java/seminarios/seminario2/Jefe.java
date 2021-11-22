package seminarios.seminario2;

public class Jefe extends Empleado {
    private double bonificacion;

    public Jefe(String nombre, float salario, int anyoAlta, double bonificacion) {
        super(nombre, salario, anyoAlta);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + super.getSalario() * bonificacion;
    }

    @Override
    public String getDescripcionSimple() {
        return super.getDescripcionSimple() + " y mi bonificacion es " + bonificacion;
    }

    @Override
    protected String getDetalle() {
        return super.getDetalle()  + " bonificacion: " + bonificacion;
    }

    @Override
    public String toString() {
        return super.toString() + " [bonificacion=" + bonificacion + "]";
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        return bonificacion == ((Jefe) o).bonificacion;
    }

    @Override
    public Jefe clone() {
        // no es necesario redefinir clone porque a copia superficial de Empleado
        // es valida para Jefe, se redefine solo para cambiar el tipo de retorno
        return (Jefe) super.clone();
    }
}
