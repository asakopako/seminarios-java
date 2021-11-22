package apuntes;

public class DepositoPenalizable extends Deposito implements Amortizable {
    private boolean penalizado;

    public DepositoPenalizable(Persona titular, double capital, int plazoDias, double tipoInteres) {
        super(titular, capital, plazoDias, tipoInteres);
        this.penalizado = false;
    }

    public boolean isPenalizado() {
        return penalizado;
    }

    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }

    @Override
    public double getIntereses() {
        if(penalizado) return super.getIntereses() / 2;
        else return super.getIntereses();
    }

    @Override
    public boolean amortizar(double cantidad) {
        if(cantidad > getCapital()) return false;
        setCapital(getCapital() - cantidad);
        return true;
    }
}
