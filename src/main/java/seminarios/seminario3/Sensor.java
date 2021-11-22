package seminarios.seminario3;

import java.util.ArrayList;

public class Sensor {
    private int temperatura;
    private ArrayList<Oyente> oyentes = new ArrayList<>();

    public Sensor() {
    }

    public int getTemperatura() {
        return temperatura;
    }

    // Gracias a la interfaz dependencia orientada al tipo, no a la clase
    public void registraOyente(Oyente oyente) {
        oyentes.add(oyente);
    }

    private void notificaOyentes() {
        for(Oyente oyente : oyentes){
            oyente.cambioTemperatura(temperatura);
        }
    }
}
