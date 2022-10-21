import java.io.IOException;

public class actividad1punto1 {
    
    public static void main(String[] args) {
    if (args.length < 1) {
        System.exit(1);
    }
    try {
        Runtime.getRuntime().exec(args);
    }catch (IOException e) {
        e.printStackTrace();
    }
}
}
