package apuntes;

import java.util.LinkedList;

public class CarteraAhorro<T extends Deposito & Amortizable> {
    private LinkedList<T> contenido;

    public void insertar(T deposito) {
        contenido.add(deposito);
    }
}
