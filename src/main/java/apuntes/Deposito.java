package apuntes;

public class Deposito extends ProductoFinanciero {
    private double capital;
    private int plazoDias;
    private double tipoInteres;

    public Deposito(Persona titular, double capital, int plazoDias, double tipoInteres) {
        super(titular);
        this.capital = capital;
        this.plazoDias = plazoDias;
        this.tipoInteres = tipoInteres;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getPlazoDias() {
        return plazoDias;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public final double liquidar() {
        return getCapital() + getIntereses();
    }

    public double getIntereses() {
        return (plazoDias * tipoInteres * capital) / 365;
    }

    @Override
    protected double getBeneficio() {
        return 0;
    }

}
