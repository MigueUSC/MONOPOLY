public class Avatar {
    private String nombre; // Coche,zapato...
    private char id; // Hacer random para escoger una letra
    private String casilla;
    private Jugador jugador;

    public Avatar(String nombre) {
        this.nombre = nombre;
    }

    public void describirAvatar(){
        System.out.println("{");
        System.out.println("id: " + this.nombre +",");
        System.out.println("tipo: " + this.nombre +",");
        System.out.println("casilla: " + this.casilla);
        System.out.println("jugador: " + this.jugador.getNombre());
        System.out.println("}");
    }
}