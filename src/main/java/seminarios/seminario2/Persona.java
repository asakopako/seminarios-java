package seminarios.seminario2;

public abstract class Persona implements Cloneable{
    private String nombre;
    private int anyoAlta;

    public Persona(String nombre, int anyoAlta){
        this.nombre = nombre;
        this.anyoAlta = anyoAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnyoAlta() {
        return anyoAlta;
    }

    public String getDescripcion(){

        return "nombre: " + nombre + "\t año de alta: " + anyoAlta + " \t" + getDetalle();
    }

    protected abstract String getDetalle();

    @Override
    public String toString() {
        return getClass().getName() + " [" + "nombre=" + nombre + ", anyoAlta=" + anyoAlta + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre) && anyoAlta == persona.anyoAlta;
    }

    @Override
    public Persona clone() { // public o protected?
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("El objeto de tipo " + getClass() + " no puede ser clonado");
        }

        return (Persona) obj;
    }
}
