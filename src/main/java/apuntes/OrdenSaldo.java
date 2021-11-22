package apuntes;

import java.util.Comparator;

public class OrdenSaldo implements Comparator<Cuenta> {
    public int compare(Cuenta o1, Cuenta o2) {
        if (o1.getSaldo() > o2.getSaldo())
            return 1;
        else if (o1.getSaldo() < o2.getSaldo())
            return -1;
        else
            return 0;
    }
}
