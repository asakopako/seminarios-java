package seminarios.seminario2;

public class Inicio {
    public static void main(String[] args) {
        Jefe j = new Jefe("Pepe", 1200, 1999, 0.2);
        Administrativo administrativo = new Administrativo("Antonio", 1000, 2001, j);
        Persona p = administrativo;
        Persona q = administrativo.clone();
        System.out.println(p);
        System.out.println(q);
        Administrativo a = (Administrativo) q;
        System.out.println(a);
    }
}
