package ejemplo;

import java.util.Date;

public class Reloj extends Thread {

    private static Reloj reloj;
  

    private synchronized static void crearInstancia() {
        if (reloj == null) {
            reloj = new Reloj();
            reloj.start();
        }
    }



    public static Reloj getInstancia() {
        crearInstancia();

        return reloj;
    }



    @Override
    public void run() {
        while (true) {

            Date hora = new Date(System.currentTimeMillis());
            System.out.println(hora);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
