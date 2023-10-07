import java.net.StandardSocketOptions;
import java.util.ArrayList;
//
public class Jugador {

    // Atributos jugador
    private String nombre;
    private Avatar avatar;
    private float fortuna;
    private int posicionActual;
    private ArrayList<String> propiedades;
    private ArrayList<String> hipotecas;
    private ArrayList<String> edificios;

    public Jugador(String Nombre, String nombreAvatar){
        this.nombre = Nombre;
        this.avatar = new Avatar(nombreAvatar);
        this.fortuna = 27500000; // Dinero inicial
        this.posicionActual = 0;
        this.propiedades = new ArrayList<String>();
        this.hipotecas = new ArrayList<String>();
        this.edificios = new ArrayList<String>();
    }
    public String getNombre() {
        return nombre;
    }

    public float getFortuna() {
        return fortuna;
    }

    public Avatar getAvatar(){
        return avatar;
    }

    // Getter y setter para propiedades
    public ArrayList<String> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<String> propiedades) {
        this.propiedades = propiedades;
    }

    // Getter y setter para hipotecas
    public ArrayList<String> getHipotecas() {
        return hipotecas;
    }
    public void setHipotecas(ArrayList<String> hipotecas) {
        this.hipotecas = hipotecas;
    }

    // Getter y setter para edificios para edificios
    public ArrayList<String> getEdificios() {
        return edificios;
    }
    public void setEdificios(ArrayList<String> edificios) {
        this.edificios = edificios;
    }
    /*
    // Getter y setter para la posicion actual
    public posicionActual getposicionActual() {
        return posicionActual;
    }
    public posicionActual setposicionActual() {
        return posicionActual;
    }
    */
    public void describirJugador(){
        System.out.println("{");
        System.out.println("nombre: " + this.nombre +",");
        System.out.println("avatar: " + this.avatar +",");
        System.out.println("fortuna: " + this.fortuna +",");
        System.out.println("propiedades: " + this.propiedades);
        System.out.println("hipotecas: " + this.hipotecas);
        System.out.println("edificios: " + this. edificios);
        System.out.println("}");
    }

    // Método comprar una propiedad
    public void comprarPropiedad(String propiedad, float valor)
    {
        if (fortuna >= propiedad.getValor())
        {
            fortuna -= propiedad.getValor(); // Mejor quitar de un array con todas las casillas la casilla comprada: . miguel, ¿Podemos crear una lista de propiedades sin comprar? y cuando se compre una se quita
            propiedades.add(propiedad);
            System.out.println(nombre + " ha comprado la propiedad " + propiedad + " por $" + valor);
        } else
            System.out.println(nombre + " no tiene suficiente fortuna para comprar la propiedad " + propiedad);
    }

    // Método para hipotecar una propiedad
    public void hipotecarPropiedad (String propiedad, float valorHipoteca)
    {
        if (propiedades.contains(propiedad))
        {
            hipotecas.add(propiedad);
            fortuna += valorHipoteca;
            propiedades.remove(propiedad);
            System.out.println(nombre + " ha hipotecado la propiedad " + propiedad + " por " + valorHipoteca + "€.");
        }
        else
        {
            System.out.println(nombre + " no posee la propiedad " + propiedad + " para hipotecar.");
        }
    }

    // Método para construir un edificio
    public void construirEdificio (String propiedad, float costoConstruccion)
    {
        if (propiedades.contains(propiedad))
        {
            if (fortuna >= costoConstruccion)
            {
                edificios.add(propiedad);
                fortuna -= costoConstruccion;
                System.out.println(nombre + " ha construido un edificio en la propiedad " + propiedad + " por " + costoConstruccion + "€.");
                System.out.println("Fortuna restante de: " + nombre + " -> " + fortuna + "€");
            }
            else
            {
                System.out.println(nombre + " no tiene suficiente fortuna para construir en la propiedad " + propiedad);
                System.out.println("Fortuna de: " + nombre + " -> " + fortuna + "€");
            }
        }
        else
        {
            System.out.println(nombre + " no posee la propiedad " + propiedad + " para construir un edificio.");
        }
    }

    // Método para calcular la nueva casilla del jugador después de tirar los dados
    public int calcularNuevaCasilla (int resultadoDados)
    {
        int nuevaPosicion = (posicionActual + resultadoDados) % 40; // calcula la casilla en módulo 40, por ejemplo, si está en la 38 y saca un 3, va a la segunda (1)

         if (nuevaPosicion == 30)
         {
             nuevaPosicion = 10;
             System.out.println(nombre + " ha sido enviado a la cárcel.");
         }

        else if (nuevaPosicion < posicionActual)
        {
            fortuna += 200; //esto lo hago momentaneamente ya sé que no son 200
            System.out.println(nombre + " ha pasado por la casilla de salida y ha recibido 200€.");
        }
        return nuevaPosicion;
    }
}
