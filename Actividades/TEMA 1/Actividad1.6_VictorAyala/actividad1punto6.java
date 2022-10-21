import java.io.File; 
import java.io.IOException; 
 
public class actividad1punto6 { 
    public static void main(String[] args) throws IOException { 
        if (args.length != 3) { 
            System.out.println("Comando invalido. Uso: "); 
            System.out.println("comando origen texto destino"); 
        } 
        else { 
            File outputFile = new File(args[2]); 
            ProcessBuilder processBuilder = new ProcessBuilder("grep", args[1], args[0]); 
            processBuilder.inheritIO(); 
            processBuilder.directory(new File("/home/ayala/")); 
            processBuilder.redirectOutput(outputFile); 
            processBuilder.start(); 
        } 
    } 
}