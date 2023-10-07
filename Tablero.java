
public class Tablero {
    private Casilla[] tablero;
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_ALONSOMIGUEL = "\u001B[38m";
    private static final String ANSI_RESET = "\u001B[0m";


    public Tablero(){

        tablero[0].setInfo("Salida     ","Negro",0);
        tablero[1].setInfo("Solar1     ","Negro",1);
        tablero[2].setInfo("Caja       ","Negro",1);
        tablero[3].setInfo("Solar2     ","Blanco",1);
        tablero[4].setInfo("Imp1       ","Blanco",1);
        tablero[5].setInfo("Trans1     ","Blanco",1);
        tablero[6].setInfo("Solar3     ","Blanco",1);
        tablero[7].setInfo("Suerte     ","Blanco",1);
        tablero[8].setInfo("Solar4     ","Blanco",1);
        tablero[9].setInfo("Solar5     ","Blanco",1);
        tablero[10].setInfo("Cárcel     ","Blanco",1);
        tablero[11].setInfo("Solar6     ","Blanco",1);
        tablero[12].setInfo("Serv1      ","Blanco",1);
        tablero[13].setInfo("Solar7     ","Blanco",1);
        tablero[14].setInfo("Solar8     ","Blanco",1);
        tablero[15].setInfo("Trans2     ","Blanco",1);
        tablero[16].setInfo("Solar9     ","Blanco",1);
        tablero[17].setInfo("Caja       ","Blanco",1);
        tablero[18].setInfo("Solar10    ","Blanco",1);
        tablero[19].setInfo("Solar11    ","Blanco",1);
        tablero[20].setInfo("Parking    ","Blanco",1);
        tablero[21].setInfo("Solar12    ","Blanco",1);
        tablero[22].setInfo("Suerte     ","Blanco",1);
        tablero[23].setInfo("Solar13    ","Blanco",1);
        tablero[24].setInfo("Solar14    ","Blanco",1);
        tablero[25].setInfo("Trans3     ","Blanco",1);
        tablero[26].setInfo("Solar15    ","Blanco",1);
        tablero[27].setInfo("Solar16    ","Blanco",1);
        tablero[28].setInfo("Serv2      ","Blanco",1);
        tablero[29].setInfo("Solar17    ","Blanco",1);
        tablero[30].setInfo("IrCarcel   ","Blanco",1);
        tablero[31].setInfo("Solar18    ","Blanco",1);
        tablero[32].setInfo("Solar19    ","Blanco",1);
        tablero[33].setInfo("Caja       ","Blanco",1);
        tablero[34].setInfo("Prop20     ","Blanco",1);
        tablero[35].setInfo("Trans4     ","Blanco",1);
        tablero[36].setInfo("Suerte     ","Blanco",1);
        tablero[37].setInfo("Solar21    ","Blanco",1);
        tablero[38].setInfo("Imp2       ","Blanco",1);
        tablero[39].setInfo("Solar22    ","Blanco",1);
    };

    public void ImprimirTablero() {

        // Imprimir avatares system.out.format("%-10%bs",avatar)
        // Guardar lo de arriba en variable string s = string.format("%-10%bs",avatar)
        // string s = "%-10s%bs".formatted()

        System.out.println("|"+tablero[20].getNombre()+String.format("%c", )+"|"+ANSI_RED+tablero[21].getNombre()+ANSI_RESET+"|"+tablero[22].getNombre()+"|"+ANSI_RED+tablero[23].getNombre()+ANSI_RESET+"|"+ANSI_RED+tablero[24].getNombre()+ANSI_RESET+"|"+tablero[25].getNombre()+"|"+ANSI_YELLOW+tablero[26].getNombre()+ANSI_RESET+"|"+ANSI_YELLOW+tablero[27].getNombre()+ANSI_RESET+"|"+tablero[28].getNombre()+"|"+ANSI_YELLOW+tablero[29].getNombre()+ANSI_RESET+"|"+tablero[30].getNombre()+"| \n");
        System.out.println("|"+ANSI_WHITE+tablero[19].getNombre()+ANSI_RESET+"|"+ANSI_GREEN+tablero[31].getNombre()+ANSI_RESET+"| \n");
        System.out.println("|"+ANSI_WHITE+tablero[18].getNombre()+ANSI_RESET+"|\t\t\t\t\t\t\t\t\t"+ANSI_GREEN+tablero[32].getNombre()+ANSI_RESET+"| \n");
        System.out.println("|"+tablero[17].getNombre()+"|"+tablero[33].getNombre()+"| \n");
        System.out.println("|"+ANSI_WHITE+tablero[16].getNombre()+ANSI_RESET+"|"+ANSI_GREEN+tablero[34].getNombre()+ANSI_RESET+"| \n");
        System.out.println("|"+tablero[15].getNombre()+"|"+tablero[35].getNombre()+"| \n");
        System.out.println("|"+ANSI_PURPLE+tablero[14].getNombre()+ANSI_RESET+"|"+tablero[36].getNombre()+"| \n");
        System.out.println("|"+ANSI_PURPLE+tablero[13].getNombre()+ANSI_RESET+"|"+ANSI_BLUE+tablero[37].getNombre()+ANSI_RESET+"| \n");
        System.out.println("|"+tablero[12].getNombre()+"|"+tablero[38].getNombre()+"| \n");
        System.out.println("|"+ANSI_PURPLE+tablero[11].getNombre()+ANSI_RESET+"|"+ANSI_BLUE+tablero[39].getNombre()+ANSI_RESET+"| \n");
        System.out.println("|"+tablero[10].getNombre()+"|"+ANSI_CYAN+tablero[9].getNombre()+ANSI_RESET+"|"+ANSI_CYAN+tablero[8].getNombre()+ANSI_RESET+"|"+tablero[7].getNombre()+"|"+ANSI_CYAN+tablero[6].getNombre()+ANSI_RESET+"|"+tablero[5].getNombre()+"|"+tablero[4].getNombre()+"|"+ANSI_ALONSOMIGUEL+tablero[3].getNombre()+ANSI_RESET+"|"+tablero[2].getNombre()+"|"+ANSI_ALONSOMIGUEL+tablero[1].getNombre()+ANSI_RESET+"|"+tablero[0].getNombre()+"| \n");
    }
}