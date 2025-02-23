package eje3;

public class Luz extends DispositivoBase{

    @Override
    public void apagar() {
        System.out.println("luz apagada");
    }

    @Override
    public void encender() {
        System.out.println("luz encendida");
    }

    @Override
    public void estado() {
        System.out.println("estado de la luz: normal");
    }
}
