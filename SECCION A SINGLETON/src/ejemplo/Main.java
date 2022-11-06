package ejemplo;


public class Main {

    public static void main(String[] args) {
        
        // 3 relojes usando el patrón singleton    
        Reloj r = Reloj.getInstancia();
        Reloj r2 = Reloj.getInstancia();
        Reloj r3 = Reloj.getInstancia();

    }

}