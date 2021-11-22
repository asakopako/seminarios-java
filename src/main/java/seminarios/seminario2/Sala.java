package seminarios.seminario2;

import java.util.ArrayList;

// restringiendo la genericidad a Persona, en los métodos, T tendra las operaciones de Persona.
// Si se restringe a Empleado, tendra los metodos de Empleado
public class Sala<T extends Persona> {
    private ArrayList<T> asistentes;

    public Sala() {
        asistentes = new ArrayList<>();
    }

    public void introduce(T asistente) {
        asistentes.add(asistente);
    }

    public void muestra() {
        for (T asistente : asistentes) {
            System.out.println(asistente);
        }
    }
}
