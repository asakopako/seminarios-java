package apuntes;

public abstract class ProductoFinanciero {
    private Persona titular;

    public ProductoFinanciero(Persona titular) {
        this.titular = titular;
    }

    public Persona getTitular() {
        return titular;
    }

    public double getImpuestos() {
        return getBeneficio() * 0.18;
    }

    protected abstract double getBeneficio();

}
