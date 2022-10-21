import java.io.IOException;

public class isAlive {
    
    public static void main(String[] args) throws IOException, InterruptedException {
    Process proceso = Runtime.getRuntime().exec(args);
    try {
        while (proceso.isAlive()) {
            System.out.println("¡El proceso está vivo!");
            Thread.sleep(3000);
        }
        System.out.println("El proceso ha muerto.");
    }catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
