import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    // Registro con todos los datos
    //Registro registro = new Registro();

    // Array con todos los jugadores
    private ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    private int turno;

    // Funcion que añade jugadores al array
    private void setJugador(String nombre,String avatar){
        Jugador nuevo = new Jugador(nombre, avatar);
        listaJugadores.add(nuevo);

        //registro.setJugadores(nuevo);
    }

    // Funcion que lista jugadores
    private void listarJugadores(){
        for (int i=0; i<listaJugadores.size();i++) {
            listaJugadores.get(i).describirJugador();
        }
    }

    private void listarAvatares(){
        for(int i = 0; i<listaJugadores.size();i++){
            listaJugadores.get(i).getAvatar().describirAvatar();
        }
    }



    // Funcion para coger lineas de comando y parsearlas para saber que hacer
    public void getComando() {
        String comando;
        String comandos[];

        Scanner linea = new Scanner(System.in);
        comando = linea.nextLine();
        linea.nextLine();

        comandos = comando.split(" ");

        // Switch case para comparar primera palabra comando
        switch (comandos[0]) {

            case "crear": // Switch para crear jugador:
                String avatar = comandos[2];
                setJugador(comandos[1],avatar);
                break;

            case "listar":
                if(comandos[1].equals("jugadores")){
                    listarJugadores();
                } else if (comandos[1].equals("avatares")){
                    // Listar avatares
                    listarAvatares();
                }
                break;
            case "jugador":
                // Imprimir jugador al que le toca turno
                break;
            case "lanzar":
                break;
            case "acabar":
                break;
            case "describir":
                if(comandos[1].equals("jugador")){
                    // Describir jugador {nombre}

                } else if (comandos[1].equals("avatar")){
                    // Describir avatar {avatar}
                } else {
                    // Describir {casilla}
                }
                break;
            case "ver":
                // Imprimir tablero
                break;
        }
    }
}
