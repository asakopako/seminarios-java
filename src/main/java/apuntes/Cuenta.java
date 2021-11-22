package apuntes;

import java.util.Date;

public class Cuenta extends ProductoFinanciero implements Comparable<Cuenta> {
    private double saldo;
    private final int codigo;
    private static int ultimoCodigo = 0;
    private Date fecha;
    private EstadoCuenta estado;
    private double[] ultimasOperaciones;
    private int siguienteOperacion = 0;
    private static final int MAX_OPERACIONES = 20;

    public Cuenta(Persona titular, double saldoInicial) {
        super(titular);
        saldo = saldoInicial;
        codigo = ++ultimoCodigo;
        estado = EstadoCuenta.OPERATIVA;
        ultimasOperaciones = new double[MAX_OPERACIONES];
    }

    public Cuenta(Persona titular) {
        this(titular, 100);
    }

    @Override
    protected double getBeneficio() {
        return 0;
    }

    public void ingreso(double cantidad) {
        saldo = saldo + cantidad;
        ultimasOperaciones[siguienteOperacion % MAX_OPERACIONES] += cantidad;
        ++siguienteOperacion;
    }

    public void reintegro(double cantidad) {
        if(cantidad <= saldo) {
            saldo = saldo - cantidad;
            ultimasOperaciones[siguienteOperacion % MAX_OPERACIONES] -= cantidad;
            ++siguienteOperacion;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getNumeroCuentas() {
        return ultimoCodigo;
    }

    public int compareTo(Cuenta otraCta) {
        if (this.codigo > otraCta.codigo)
            return 1;
        else if (this.codigo < otraCta.codigo)
            return -1;
        else return 0;
    }
}
