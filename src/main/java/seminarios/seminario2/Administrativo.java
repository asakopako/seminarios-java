package seminarios.seminario2;

public class Administrativo extends Empleado {
    private static final double FACTOR = 0.1;
    private Jefe jefe;

    public Administrativo(String nombre, float salario, int anyoAlta, Jefe jefe) {
        super(nombre, salario, anyoAlta);
        this.jefe = jefe;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + super.getSalario() * jefe.getBonificacion() * FACTOR;
    }

    @Override
    protected String getDetalle() {
        return super.getDetalle() + " jefe: " + jefe.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + " [jefe=" + jefe.getNombre() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        return jefe.equals(((Administrativo) o).jefe);
    }

    @Override
    public Administrativo clone() {
        Administrativo admin = (Administrativo) super.clone();

        // no se hace el clone de Jefe porque el Jefe sería el mismo
        admin.jefe = this.jefe;

        return admin;
    }
}
