package seminarios.seminario1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {
        Contador contador1 = new Contador(2,5);
        Contador contador2 = new Contador();

        System.out.println("Contador 1: " + contador1.getValor());
        System.out.println("Contador 2: " + contador2.getValor());

        contador1.tick();
        contador2.tick(2);

        System.out.println("Contador 1: " + contador1.getValor());
        System.out.println("Contador 2: " + contador2.getValor());

        contador1 = new Contador(2,1);
        contador2 = new Contador();

        System.out.println("Contador 1: " + contador1.getValor());
        System.out.println("Contador 2: " + contador2.getValor());

        contador1.sincronizar(contador2);

        System.out.println("Contador 1: " + contador1.getValor());
        System.out.println("Contador 2: " + contador2.getValor());

        System.out.println("¿Son iguales?: " + (contador1 == contador2));

        Contador contador3 = contador1;

        System.out.println("¿Son iguales?: " + (contador1 == contador3));

        System.out.println("Número Serie Contador 1: " + contador1.getNumeroSerie());
        System.out.println("Número Serie Contador 2: " + contador2.getNumeroSerie());

        System.out.println("Último número de serie: " + Contador.getUltimoNumeroSerie());

        contador1 = new Contador();

        contador1.tick();
        contador1.tick();

        System.out.println("Contador 1: " + contador1.getValor());

        contador1.setModo(Modo.DESCENDENTE);
        contador1.tick();

        System.out.println("Contador 1: " + contador1.getValor());

        List<Contador> contadores = new LinkedList<>();

        for(int i = 0; i < 3; i++) {
            contadores.add(0, new Contador());
            System.out.println("Contador: " + contadores.get(0).getValor());

        }

        for(Contador contador : contadores){
            contador = new Contador();
            System.out.println("Contador: " + contador.getValor());
        }

    }
}
