package apuntes;

public class DepositoGarantizado extends DepositoEstructurado implements Amortizable {
    private double tipoInteresGarantizado;

    public DepositoGarantizado(Persona titular, double capitalFijo, int plazoDias, double tipoInteresFijo, double capitalVariable, double tipoInteresGarantizado) {
        super(titular, capitalFijo, plazoDias, tipoInteresFijo, capitalVariable);
        this.tipoInteresGarantizado = tipoInteresGarantizado;
        setTipoInteresVariable(tipoInteresGarantizado);
    }

    @Override
    public void setTipoInteresVariable(double tipoInteresVariable) {
        if(tipoInteresVariable >= tipoInteresGarantizado) super.setTipoInteresVariable(tipoInteresVariable);

    }

    @Override
    public boolean amortizar(double cantidad) {
        if(cantidad > getCapital()) return false;
        setCapital(getCapital() - cantidad);
        return true;
    }
}
