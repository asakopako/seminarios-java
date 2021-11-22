package seminarios.seminario1;

import java.util.Date;

public class Contador {

    private static final int LIMITE_MAXIMO = 10;
    private static int ultimoNumeroSerie;

    private int valor;
    private int paso;
    private int numeroSerie;
    private Modo modo;
    private Date fechaCreacion;

    public Contador(int valor, int paso){
        this.valor = valor;
        this.paso = paso;
        modo = Modo.ASCENDENTE;

        numeroSerie = ++ultimoNumeroSerie;
        ++ultimoNumeroSerie;

        fechaCreacion = new Date();
    }

    public Contador(int valor){
        this(valor, 1);
    }

    public Contador(){
        this(0,1);
    }

    public Contador(Contador otro){
        this(otro.valor, otro.paso);
    }

    public int getValor() {
        return valor;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public Modo getModo() {
        return modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }

    public void tick(){
        tick(paso);
    }

    public void tick(int paso){
        switch (modo){
            case ASCENDENTE:
                if(valor + paso <= LIMITE_MAXIMO)
                    valor += paso;
                break;
            case DESCENDENTE:
                if(valor - paso >= 0)
                    valor -= paso;
                break;
        }
    }

    public void sincronizar(Contador otro){
        valor = otro.valor;
        paso = otro.paso;
    }

    public static int getUltimoNumeroSerie() {
        return ultimoNumeroSerie;
    }
}
