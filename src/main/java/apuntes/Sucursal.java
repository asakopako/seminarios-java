package apuntes;

import java.util.*;

public class Sucursal {
    private int codigo;
    private String direccion;
    private HashMap<Persona, LinkedList<ProductoFinanciero>> pasivo;

    public Sucursal(int codigo, String direccion){
        this.codigo = codigo;
        this.direccion = direccion;
        pasivo = new HashMap<>();
    }

    public void addContrato(Persona cliente, ProductoFinanciero producto)
    {
//        cliente.addProducto(producto);  ¿?
        LinkedList<ProductoFinanciero> productos;
        if (! pasivo.containsKey(cliente)) {
            productos = new LinkedList<>();
            pasivo.put(cliente, productos);
        }
        else productos = pasivo.get(cliente);

        productos.add(producto);
    }

//    public void addContrato(Persona cliente, ProductoFinanciero producto) {
//        cliente.addProducto(producto);
//        pasivo.put(cliente, (LinkedList<ProductoFinanciero>) cliente.getProductosContratados());
//    }

    public Set<Persona> getClientes(){
        return new HashSet<>(pasivo.keySet());
    }

    public Set<ProductoFinanciero> getProductosContratados(){
        Collection<LinkedList<ProductoFinanciero>> productos;
        productos = pasivo.values();
        Set<ProductoFinanciero> cjtoProductos = new HashSet<>();
        for (LinkedList<ProductoFinanciero> lista : productos)
            cjtoProductos.addAll(lista);
        return cjtoProductos;
    }

}
