import java.io.File;
import java.io.IOException;

public class actividad1punto4 {

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        String directorioPorDefecto =  String.valueOf(pb.directory());
        System.out.println("El directorio por defecto es:" + directorioPorDefecto);
        pb.start();

        ProcessBuilder pb1 = new ProcessBuilder("notepad.exe");
        System.out.println("El directorio ha sido cambiado de lugar.");
        pb1.directory(new File("C:\\ESD"));
        directorioPorDefecto = String.valueOf(pb1.directory());
        System.out.println("La dirección del nuevo directorio es:" +directorioPorDefecto);
        pb1.start();
    }
}
