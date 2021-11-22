package apuntes;

import java.util.Comparator;

public class OrdenTitular implements Comparator<Cuenta> {
    public int compare(Cuenta o1, Cuenta o2) {
        return (o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre()));
    }
}