package enums;

import java.util.concurrent.TimeUnit;

public class Cemaforo {
    enum colores{
        VERDE,
        AMARILLO,
        ROJO
    }
    boolean exit = false;
    int num=0;
    public void cambiarColor() throws InterruptedException {
        while (!exit){
            switch (num) {
                case 0:
                    System.out.println(colores.VERDE+
                    "\nPuede continuar");
                    num += 1;
                    break;
                case 1:
                    System.out.println(colores.AMARILLO+
                            "\nCuidado cambio a ROJO");
                    num += 1;
                    break;
                case 2:
                    System.out.println(colores.ROJO+
                            "\nALTO!!");
                    num += 1;
                    break;
                case 3:
                    System.out.println(colores.AMARILLO+
                            "\nYa cambio a VERDE");
                    num = 0;
                    break;
            }
           TimeUnit.SECONDS.sleep(2);
        }
    }
}
