import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ReproductorCancion[] cancion = new ReproductorCancion[4];
    static List<ReproductorCancion> playlist = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static {
        cancion[0] = new ReproductorCancion("Sad but true","Metallica","Metallica", 5.24F,1991);
        cancion[1] = new ReproductorCancion("One step closer","Linkin park","Hybrid Theory",2.35F,2000);
        cancion[2] = new ReproductorCancion("Symphony of destruction","Megadeth","Cowntdown to extintion",4.02F,1992);
        cancion[3] = new ReproductorCancion("Paradise city","Guns n'roses","Appetite for Destruction",6.48F,1987);
    }

    private static void menu(){
        System.out.println("-----MP3-----");
        System.out.println("1) Ver lista de canciones");
        System.out.println("2) Reproducir playlist");
        System.out.println("3) Salir");

        int respuesta = scan.nextInt();

        switch (respuesta){
            case 1: mostrarCanciones();
                break;
            case 2: reproducirPlaylist();
                break;
            case 3: System.exit(0);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    private static void mostrarCanciones() {
        System.out.println("-----Canciones disponibles-----");
        for (ReproductorCancion c : cancion) {
            System.out.println("Título: " + c.getTitulo());
            System.out.println("Artista: " + c.getArtista());
            System.out.println("Álbum: " + c.getAlbum());
            System.out.println("Duración: " + c.getDuracion() + " minutos");
            System.out.println("Año: " + c.getLanzamiento());
            System.out.println("-----------------------------");
        }

        agregarCancionAPlaylist();
        menu();
    }

    private static void reproducirPlaylist() {
        System.out.println("-----Reproduciendo Playlist-----");

        if (playlist.isEmpty()) {
            System.out.println("La playlist está vacía. Agrega canciones antes de reproducir.");
        } else {
            for (ReproductorCancion c : playlist) {
                System.out.println("Título: " + c.getTitulo());
                System.out.println("Artista: " + c.getArtista());
                System.out.println("Álbum: " + c.getAlbum());
                System.out.println("Duración: " + c.getDuracion() + " minutos");
                System.out.println("Año: " + c.getLanzamiento());
                System.out.println("-----------------------------");
            }
        }

        menu();
    }

    private static void agregarCancionAPlaylist() {
        System.out.println("Seleccione el número de la canción que desea agregar a la playlist:");
        for (int i = 0; i < cancion.length; i++) {
            System.out.println((i + 1) + ") " + cancion[i].getTitulo());
        }
        int seleccion = scan.nextInt();

        if (seleccion > 0 && seleccion <= cancion.length) {
            playlist.add(cancion[seleccion - 1]);
            System.out.println("Canción agregada a la playlist.");
        } else {
            System.out.println("Selección inválida.");
        }

        menu();
    }
}