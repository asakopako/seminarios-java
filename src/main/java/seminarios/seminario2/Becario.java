package seminarios.seminario2;

public class Becario extends Persona  implements Cloneable{
    private String departamento;

    public Becario(String nombre, String departamento, int anyoAlta) {
        super(nombre, anyoAlta);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    protected String getDetalle() {
        return "departamento: " + departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " [departamento=" + departamento + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        return departamento.equals(((Becario) o).departamento);
    }

    @Override
    public Becario clone() {
        return (Becario) super.clone();
    }
}
