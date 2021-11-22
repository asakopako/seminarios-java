package apuntes;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Persona {
    private final String nombre;
    private final String dni;
    private LinkedList<ProductoFinanciero> productosContratados;
    private TreeSet<Cuenta> misCuentas;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        productosContratados = new LinkedList<>();
        misCuentas = new TreeSet<>();
        misCuentas = new TreeSet<>(new OrdenSaldo());
        misCuentas = new TreeSet<>(new OrdenTitular());
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void addProducto(ProductoFinanciero producto){
        productosContratados.add(producto);
    }

    public void removeProducto(ProductoFinanciero producto){
        productosContratados.remove(producto);
    }

    public List<ProductoFinanciero> getProductosContratados(){
        return new LinkedList<>(productosContratados);
    }

    public boolean addCuenta(Cuenta cta){
        return misCuentas.add(cta);
    }
}
