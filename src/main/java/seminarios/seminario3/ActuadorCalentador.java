package seminarios.seminario3;

public class ActuadorCalentador implements Oyente {
    private int antiguaTemperatura = Integer.MAX_VALUE;

    @Override
    public void cambioTemperatura(int cambio) {
        if(cambio < antiguaTemperatura){

        }
    }
}
