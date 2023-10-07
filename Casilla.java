public abstract class Casilla
{
    private String nombre;
    private float valor;
    private String color;

    public Casilla()
    {
        nombre = "";
        valor = 0;
        color = "";
    }

    public void setInfo(String nombreCasilla,String colorCasilla, float valorCasilla)
    {
        this.nombre = nombreCasilla;
        this.color = colorCasilla;
        this.valor = valorCasilla;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getColor(){
        return this.color;
    }

    public float getValor(){
        return this.valor;
    }

}
