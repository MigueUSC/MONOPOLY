public class cEspecial {
    private Casilla carcel;
    private Casilla parking;
    private Casilla salida;
    private Casilla irCarcel;

    // Constructor casillas especiales
    public cEspecial(){
        // Inicializamos Casilla Carcel
        carcel.setInfo("Carcel","",0);

        // Inicializamos Casilla Parking
        parking.setInfo("Parking","",0);

        // Inicializamos Casilla Salida
        salida.setInfo("Salida","",0);

        // Inicializamos Casilla IrCarcel
        irCarcel.setInfo("IrCarcel","",0);
    }
}
